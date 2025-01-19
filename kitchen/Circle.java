/**
 * Creates Circle Shape Class. Allows easier creation of circles.
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
import java.awt.geom.*;

public class Circle implements DrawingObject {

    private double x;

    private double y;
    private double size;
    private Color color;

    public Circle(double x, double y, double size, Color color) {

        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;

    }
    @Override
    public void draw(Graphics2D g2d ) {

        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(circle);


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

