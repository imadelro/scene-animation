/**
 * Creates a kitchen Refrigerator. Composite shape composed of Rectangle and Line classes.
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
import java.awt.*;
public class Refrigerator extends ColorPalette implements DrawingObject {
    private Rectangle layer1;
    private Rectangle bottom;
    private Line separator;
    private Line handle1;
    private Line handle2;

    public Refrigerator(double x, double y, double width, double height) {

        layer1 = new Rectangle(x, y, width, height, (white));
        bottom = new Rectangle(x, y*3.90, width, height*0.05, darkGray);
        separator = new Line(x, y*2.5, x+width, y*2.5, lightGray, (new BasicStroke(7)) );
        handle1 = new Line(x*2, y*1.75, x*2, y*2.15, darkGray, (new BasicStroke(5)) );
        handle2 = new Line(x*2, y*2.85, x*2, y*3.15, darkGray, (new BasicStroke(5)) );


    }

    public void draw( Graphics2D g2d ){

        layer1.draw(g2d);
        separator.draw(g2d);
        bottom.draw(g2d);
        handle1.draw(g2d);
        handle2.draw(g2d);

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
