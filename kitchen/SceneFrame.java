/**
 * This class takes care of instantiating a window for the canvas.
 * It's also in charge of event handling which is done through MouseListeners and ActionListeners
 *
 @author Ma. Malena T. del Rosario (222071)
 @version March 4, 2023
 **/
/*
I have not discussed the Java language code in my program
with anyone other than my instructor or the teaching assistants
assigned to this course.

I have not used Java language code obtained from another student,
or any other unauthorized source, either modified or unmodified.

If any Java language code or documentation used in my program
was obtained from another source, such as a textbook or website,
that has been clearly noted with a proper citation in the comments
of my program.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SceneFrame extends ColorPalette {
    private double w;
    private double h;
    private JFrame frame;
    private SceneCanvas canvas;
    private JLabel lightSwitchListener;
    private JLabel stoveKnobListener;
    private JLabel ovenKnobListener;
    private JLabel faucetListener;
    private JLabel dimLayer;
    private int mouseClick1;
    private int mouseClick2;
    private int mouseClick3;
    private int mouseClick4;
    Boolean buttonPressed;
    //The objects below are used for animation
    Light lightRay;
    FaucetWater water;
    Fire flames;

    /**
     * @param w - width of canvas frame
     * @param h - height of canvas frame
     *
     * Sets up a new Timer for the steam animation. When the respective JLabel is clicked on
     * the actionPerformed will call on the .moveSteam() and make the steam start moving up.
     */
    public SceneFrame(int w, int h) {
        this.w = w;
        this.h = h;

        buttonPressed = false;
        Timer timer = new Timer(50, new ActionListener() { //Timer for the steam animation
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonPressed) { //If JLabel is clicked it will move the steam going up
                    canvas.getSteam().moveSteam();
                    canvas.repaint();
                }
            }
        });
        timer.start();
        frame = new JFrame();
        canvas = new SceneCanvas(w, h);
    }
    /**
     * Sets up the GUI in order to view the canvas
     * Also sets up multiples JLabels which is used to activate animations.
     */
    public void setupGUI() {
        Container cp = frame.getContentPane();

        //Specifications for the JLabel located at the light switch
        lightSwitchListener = new JLabel();
        lightSwitchListener.setBounds(300, 225, 25, 30);
        cp.add(lightSwitchListener);

        //Specifications for the JLabel located at the first convection knob
        stoveKnobListener = new JLabel();
        stoveKnobListener.setBounds(560, 342, 20, 20);
        cp.add(stoveKnobListener);

        //Specifications for the JLabel located at the second convection knob
        ovenKnobListener = new JLabel();
        ovenKnobListener.setBounds(610, 342, 20, 20);
        cp.add(ovenKnobListener);

        //Specifications for the JLabel located at the faucet
        faucetListener = new JLabel();
        faucetListener.setBounds(900, 300, 20, 20);
        cp.add(faucetListener);

        //Adds the dark layer on top to make kitchen appear dim
        dimLayer = new JLabel();
        dimLayer.setBounds(0, 0, 1028, 768);
        dimLayer.setBackground(darkTransparent);
        dimLayer.setOpaque(true);
        cp.add(dimLayer);

        frame.setTitle("Midterm Project - del Rosario, Ma. Malena - 222071 ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * sets up a new MouseListener for each JLabel so that when label is clicked it will activate an event
     */
    public void setUpMouseListener() {

        MouseListener ml = new Listener();
        lightSwitchListener.addMouseListener(ml);
        ovenKnobListener.addMouseListener(ml);
        stoveKnobListener.addMouseListener(ml);
        faucetListener.addMouseListener(ml);

    }

    public class Listener implements MouseListener {
        /**
         * If mouse is clicked on one of the JLabels it will check
         * which label and activate the respective animation
         */
        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getSource() == lightSwitchListener) //turns light on/off
            {
                mouseClick1++;
                if (mouseClick1 % 2 == 0) //If the number of clicks done on the LightSwitchListener is an even number
                                          //it will close the light.
                {
                    dimLayer.setOpaque(true);
                    for (int i = 0; i < canvas.getObjects().size(); i++)
                    {
                        //this 'if' statement compares each item in 'objects' until it finds the matching object.
                        //After matching, it deletes the object at index i.
                        if ((!(canvas.getObjects().get(i).getObjectName() == null)) &&
                                (canvas.getObjects().get(i).getObjectName().equals("lightRay")))
                        {
                            canvas.getObjects().remove(i); //deletes the object from the ArrayList
                            canvas.getLight().changeBulb(dirtyWhite);
                        }
                    }
                } else
                {
                    dimLayer.setOpaque(false);
                    canvas.getObjects().add(lightRay = new Light(110, 110)); //creates a new Light object since the
                                                                             //previous one was deleted.

                    lightRay.objectName("lightRay"); //Passes the string name to the objectName method so when the Listener
                                           //is clicked again, the 'for' loop will work.
                    canvas.getLight().changeBulb(brightYellow);
                }
            } else if (e.getSource() == ovenKnobListener) { //turns oven on/off
                mouseClick2++;
                if (mouseClick2 % 2 == 0) //If the number of clicks done on the ovenKnobListener is an even number
                                          //it will close the oven light.
                    canvas.getConvection().turnOnConvection(transparentColor, false);
                else
                    canvas.getConvection().turnOnConvection(yellow, true);

            } else if (e.getSource() == faucetListener) //turns water on/off
            {
                mouseClick3++;
                if (mouseClick3 % 2 == 0) //If the number of clicks done on the faucetListener is an even number
                                          //it will close the faucet.
                {
                    for (int i = 0; i < canvas.getObjects().size(); i++) //compares each object in ArrayList to the
                                                                        //name of object, in this case "water"
                    {
                        if ((!(canvas.getObjects().get(i).getObjectName() == null)) &&
                                (canvas.getObjects().get(i).getObjectName().equals("water")))
                        {
                            canvas.getObjects().remove(i); //removes the index of the water object
                        }
                    }
                } else
                {
                    canvas.getObjects().add(water = new FaucetWater(935, 285)); //creates new FaucetWater object
                    water.objectName("water"); //passes string value to objectName method for future references

                }

            } else if (e.getSource() == stoveKnobListener) //turns stove on/off
            {
                mouseClick4++;
                if (mouseClick4 % 2 == 0) //same with the other JLabels, if cumulative clicks is even fire of stove
                                         //will stop
                {
                    buttonPressed = false; //when mouseClicks is even it means the stove is off, therefore buttonPressed
                                          //will be false and it will stop the animation

                    for (int i = 0; i < canvas.getObjects().size(); i++)
                    {
                        if ((!(canvas.getObjects().get(i).getObjectName() == null)) &&
                                (canvas.getObjects().get(i).getObjectName().equals("flames")))
                        {
                            canvas.getObjects().remove(i);


                        }
                    }
                } else
                {
                    buttonPressed = true;
                    canvas.getObjects().add(flames = new Fire(575, 302));
                    flames.objectName("flames");
                }
            } canvas.repaint();
        }
            public void mousePressed (MouseEvent e){
            }

            public void mouseReleased (MouseEvent e){
            }

            public void mouseEntered (MouseEvent e){
            }

            public void mouseExited (MouseEvent e){
            }
        }
}



