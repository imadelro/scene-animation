/**
 * Class that creates a Cabinet. Composite shapes composed of Rectangles, Circles, and Lines.
 This is a template for a Java file.
 @author Ma. Malena T. del Rosario (222071)
 @version Mach 4, 2023
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

public class Cabinet extends ColorPalette implements DrawingObject {

    private double x;
    private double y;
    private double width;
    private double height;

    private Rectangle layer1;
    private Rectangle layer2;
    private Rectangle glass;
    private Circle knob;
    private Circle knobShine;
    private Line connecter;

    /**
     * @param x - starting x coordinate
     * @param y - starting y coordinate
     * @param width - width of cabinet
     * @param height - starting height of cabinet
     * Each shape is used to create the cabinet
     */
    public Cabinet(double x, double y, double width, double height) {

        int knobSize = 10;
        layer1 = new Rectangle(x, y, width, height, darkBrown);
        layer2 = new Rectangle(x+10, y+10, width/2.5, height*0.85, lightBrown);
        glass = new Rectangle(x+(width/2.5)+30, y+10, width/2.75, height*0.85, glassColor2);
        knob = new Circle(x+15, height*0.75, knobSize, lightGray);
        knobShine = new Circle(x+16, height*0.765, knobSize/2, white);
        connecter = new Line(x, height*0.95, 800, height*0.95, darkGray, (new BasicStroke(5)));
    }

    @Override
    public void draw( Graphics2D g2d ){

        connecter.draw(g2d);
        layer1.draw(g2d);
        layer2.draw(g2d);
        glass.draw(g2d);
        knob.draw(g2d);
        knobShine.draw(g2d);


    }
    @Override
    public String objectName(String name) {

        return name;
    }

    @Override
    public String getObjectName() {
        return null;
    }




}
