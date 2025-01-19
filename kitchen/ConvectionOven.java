/**
 * Creates a Convection Oven. Composed of various shapes.
 @author Ma. Malena T. del Rosario (222071)
 @version March 5, 2023
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
import java.util.*;

public class ConvectionOven extends ColorPalette implements DrawingObject {
    private double x;
    private double y;
    private Square body;
    private Rectangle stoveBase;
    private Rectangle stove1;
    private Rectangle stove2;
    private Shape ovenDoor;
    private Shine ovenShine;
    private Rectangle ovenHandle;
    private Circle ovenButtons;
    private Circle ovenButtonIndicator;
    private Color currentColor;
    private Circle onIndicator;
    private boolean isOn;


    public ConvectionOven(double x, double y, double size) {
        isOn = false;
        this.x = x;
        this.y = y;

        currentColor = transparentColor;

        body = new Square(x, y, size, (darkGray));
        stoveBase = new Rectangle(x, y*0.975, size, 5, mediumGray);
        stove1 = new Rectangle(x+30, y*0.95, 60, 5, (new Color(45,45,45)));
        stove2 = new Rectangle(x+180, y*0.95, 60, 5, (new Color(45,45,45)));

        ovenDoor = new RoundRectangle2D.Double(x+20, y+100, size*0.85, 100, 5, 5);
        ovenHandle = new Rectangle(x+10, y+65, size-20, 10, mediumGray);
        ovenShine = new Shine(x+20, y+100, 1.20, 100);

        }

    @Override
    public void draw( Graphics2D g2d){

        body.draw(g2d);
        stove1.draw(g2d);
        stove2.draw(g2d);
        stoveBase.draw(g2d);

        //Round Rectangle
        g2d.setPaint(currentColor);
        g2d.fill(ovenDoor);
        g2d.draw(ovenDoor);

        ovenHandle.draw(g2d);
        ovenHandle.draw(g2d);
        ovenShine.draw(g2d);

        for (int i = 1; i <= 4; i++){
            ovenButtons = new Circle(x + (i * 50), y * 1.07, 20, black);
            ovenButtonIndicator = new Circle((x + 8 + (i * 50)), y * 1.02, 5, black);

            ovenButtons.draw(g2d);
            ovenButtonIndicator.draw(g2d);

        }

        if(isOn){
                onIndicator = new Circle((x + 8 + (2 * 50)), y * 1.02, 5, red);
                onIndicator.draw(g2d);
        }
    }
    @Override
    public String objectName(String name) {

        return name;
    }

    @Override
    public String getObjectName() {
        return null;
    }

    /**
     *@param b - indicates whether oven is on or off
     *@param color - changes the color of the oven door depending whether isOn is true or false
     *
     * Method called when user clicks on second oven knob/
     */
    public void turnOnConvection(Color color, boolean b){

       currentColor = color;
       isOn = b;

    }



}
