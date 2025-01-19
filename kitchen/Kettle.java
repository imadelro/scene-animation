/**
 * Creates a kettle. Composed of multiple shapes.
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

public class Kettle extends ColorPalette implements DrawingObject{
    private SemiCircle kettleBody;
    private Path2D.Double handle;
    private Triangle spout;
    private Circle top;
    private Line line1;
    private Path2D.Double wire;
    private Circle wirePlug;


    public Kettle(double x, double y){

        kettleBody = new SemiCircle(x, y, x, y*0.75, x*0.94, y*0.75, x*0.94, y, mediumGray);
        spout = new Triangle(x*0.98, y*0.85, (x*0.98)+20, y*0.85, (x*0.98)+10,
                (y*0.85)+10, black);
        top = new Circle( (x+(x*0.94))*0.497, y-67, 10, black );
        handle = new Path2D.Double();
        handle.moveTo(x-45, y-40);
        handle.curveTo(x-60, y-45, x-60, y-20, x-50, y-20 );
        line1 = new Line(x*0.95, y*0.85, x, y*0.85, black, (new BasicStroke(1)));
        wirePlug = new Circle(x+12, y-32, 12, black);
        wire = new Path2D.Double();
        wire.moveTo(x+17, y-25);
        wire.curveTo(x+17, y, x-3, y-25, x-3, y-15);

    }

    public void draw(Graphics2D g2d){

        //For the handle
        g2d.setStroke(new BasicStroke(5));
        g2d.setPaint(darkGray);
        g2d.draw(handle);

        //For the wire
        g2d.setStroke(new BasicStroke(2));
        g2d.setPaint(black);
        g2d.draw(wire);
        wirePlug.draw(g2d);

        spout.draw(g2d);
        top.draw(g2d);
        kettleBody.draw(g2d);
        line1.draw(g2d);

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