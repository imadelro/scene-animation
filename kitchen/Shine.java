/**
 * Creates a Shine class. Used on objects such as cupboard and convection oven.
 * Gives object a more realistic drawing.
 *
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

public class Shine extends ColorPalette implements DrawingObject {

    private double slope;
    private Path2D.Double shine;

    public Shine(double x, double y, double thickness, double length){

        slope = 30;

        shine = new Path2D.Double();
        shine.moveTo( x*thickness, y);
        shine.lineTo(x*thickness+slope, y);
        shine.lineTo( (x*thickness)-slope, y+length);
        shine.lineTo( (x*thickness)-(2*slope), y+length);
        shine.closePath();

    }
    @Override
    public void draw(Graphics2D g2d){
        g2d.setColor(shineColor);
        g2d.fill(shine);
        g2d.draw(shine);
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

