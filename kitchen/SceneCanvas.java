/**
 * This class instantiates an ArrayList of Objects called objects.
 * Each object that needs to be painted on the canvas is added to 'objects'.
 * After all object have been added a for loop iterates through 'objects'
 * drawing each one on the canvas.
 *
 * There are also additional methods in this Class that allow specific objects to appear/disappear.
 *
 This is a template for a Java file.
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
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject> objects;
    private final int width;
    private final int height;
    private KitchenWall wallpaper;
    private KitchenFloor floor;
    private Counter counter;
    private Cabinet c1;
    private Cabinet c2;
    private Drawer d1;
    private Drawer d2;
    private Drawer d3;
    private Cupboard cp1;
    private Refrigerator ref;
    private CeilingLamp light;
    private ExhaustFan exhaust;
    private Pan pan;
    private ConvectionOven convection;
    private Microwave microwave;
    private Kettle kettle;
    private Socket socket1;
    private Socket socket2;
    private Sink sink;
    private Switch lightSwitch;
    private Steam steam;

    /**
     * @param w h - the width and height of the canvas
     * @returns the convection object so it can be modified
     */
    public SceneCanvas( int w, int h ){
        setPreferredSize(new Dimension(w, h));
        objects = new ArrayList<DrawingObject>();

        width = w;
        height = h;

        objects.add(wallpaper = new KitchenWall( 280, 0, 740, 600));
        objects.add(floor = new KitchenFloor( 0, 580, 1025, 183 ));
        objects.add(counter = new Counter( 280, 320, 745, 260));
        objects.add(c1 = new Cabinet( 280, 0, 230, 150 ));
        objects.add(c2 = new Cabinet( 780, 0, 230, 150 ));
        objects.add(d1 = new Drawer(300, 360, 190, 70));
        objects.add(d2 = new Drawer(300, 460, 190, 70));
        objects.add(d3 = new Drawer(800, 480, 190, 70));
        objects.add(cp1 = new Cupboard(790, 360, 200, 100));
        objects.add(ref = new Refrigerator(30, 140, 225, 420));
        objects.add(light = new CeilingLamp(150, 0, 2, 50));
        objects.add(steam = new Steam(560,300));
        objects.add(exhaust = new ExhaustFan(600, 0, 100, 120));
        objects.add(pan = new Pan(550, 300, 20, 30));
        objects.add(convection = new ConvectionOven(510, 320, 260));
        objects.add(socket1 = new Socket(310, 280, 50, 25));
        objects.add(socket2 = new Socket(830, 280, 50, 25));
        objects.add(microwave = new Microwave(375, 250, 120, 70));
        objects.add(kettle = new Kettle(850,320));
        objects.add(sink = new Sink( 920, 320));
        objects.add(lightSwitch = new Switch(300, 225, 25, 30));

    }
    /**
     * @param g - Graphics component
     * takes care of drawing everything inside the object list.
     */
    protected void paintComponent( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double backdrop = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(new Color(167,168,172));
        g2d.fill(backdrop);

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHints(rh);

        for (int i = 0; i < objects.size(); i++){
            objects.get(i).draw(g2d);
        }
    }
    /**
     * @returns the convection object so it can be modified
     */
    public ConvectionOven getConvection(){

        return convection;
    }
    /**
     * @returns the light object so it can be modified
     */
    public CeilingLamp getLight(){

        return light;
    }
    /**
     * @returns the steam object so it can be modified
     */
    public Steam getSteam(){

        return steam;
    }
    /**
     * @returns the list of objects so they can be modified
     */
    public ArrayList<DrawingObject> getObjects(){

        return objects;
    }
}
