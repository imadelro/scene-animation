/**
 * Creates a Cupboard that contains bowls and cups. Uses the Bowls and Cups classes to create one object.
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

public class Cupboard extends ColorPalette implements DrawingObject {
    private Rectangle size;
    private Shape outline;
    private Rectangle glass;
    private Line divider;
    private Line handle;
    private Shine shine;
    private Shine shine2;
    private Bowls bowls;
    private Cups glassCup;

    public Cupboard(double x, double y, double width, double height){
        size = new Rectangle(x, y, width, height, darkBrown);
        outline = new Rectangle2D.Double(x, y, width, height);
        glass = new Rectangle(x, y, width, height, glassColor);
        divider = new Line((x+width)*0.90, y, (x+width)*0.90, y+height, (new Color(69, 76, 89, 70)), (new BasicStroke(3)));
        handle = new Line(x+20, y+40, x+20, y+60, lightGray, (new BasicStroke(5)));
        shine = new Shine(x, y, 1.10, height);
        shine2 = new Shine(x, y, 1.20, height);
        bowls = new Bowls(x,y);
        glassCup = new Cups(x+100,y+55, transparentColor);

    }
    @Override
    public void draw(Graphics2D g2d){
        size.draw(g2d);
        bowls.draw(g2d);
        glassCup.draw(g2d);
        glass.draw(g2d);
        handle.draw(g2d);
        divider.draw(g2d);
        shine.draw(g2d);
        shine2.draw(g2d);
        g2d.setPaint(lightBrown);
        g2d.setStroke(new BasicStroke(12));
        g2d.draw(outline);


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
