/**
 * Creates Rectangle Shape Class. Allows easier creation of Rectangles.
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

 import java.awt.geom.*;
 import java.awt.*;

public class Rectangle implements DrawingObject {

    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;

    public Rectangle(double x, double y, double width, double height, Color color){

        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void draw(Graphics2D g2d){

        Rectangle2D.Double rectangle = new Rectangle2D.Double( x, y, width, height );
        g2d.setColor(color);
        g2d.fill(rectangle);
        g2d.draw(rectangle);

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

