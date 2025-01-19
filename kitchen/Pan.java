/**
 * Creates a kitchen pan. Composed of SemiCircle class and Path2D.Double shape
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
import java.awt.geom.*;

public class Pan extends ColorPalette implements DrawingObject{
    private SemiCircle body;
    private Path2D.Double handle;


    public Pan(double x, double y, double width, double height) {

        body = new SemiCircle(x*0.97, y*0.95, x*0.97, y*1.05,
                x*1.10, y*1.05, x*1.10, y*0.95, red);
        handle = new Path2D.Double();
        handle.moveTo(x+30, y);
        handle.lineTo(x+80, y-40);
        handle.lineTo(x+83, y-40);
        handle.lineTo(x+30, y+5);
        handle.closePath();

    }

    public void draw( Graphics2D g2d){

        g2d.setPaint(darkGray);
        g2d.fill(handle);
        g2d.draw(handle);
        body.draw(g2d);

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
