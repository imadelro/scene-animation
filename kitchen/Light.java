/**
 * Creates the Light affect seen when user clicks on light switch.
 * Uses gradient coloring to make affect more realistic.
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

public class Light extends ColorPalette implements DrawingObject {
    private String name;
    private double x;
    private double y;
    private double w;
    private double h;
    private Path2D.Double lightRay;

    public Light(double x, double y){
        this.x = x;
        this.y = y;

        lightRay = new Path2D.Double();
        lightRay.moveTo(x,y);
        lightRay.lineTo(x+80,y);
        lightRay.lineTo(x+180,y+420);
        lightRay.lineTo(x-60,y+420);
        lightRay.closePath();

    }

    @Override
    public void draw(Graphics2D g2d) {
        GradientPaint gradient = new GradientPaint(50, 0, yellowTransparent, 300,400, transparentColor);

        g2d.setPaint(gradient);
        g2d.setStroke(new BasicStroke(0));
        g2d.fill(lightRay);
        g2d.draw(lightRay);
    }

    @Override
    public String objectName(String name) {

        this.name = name;
        return name;

    }

    @Override
    public String getObjectName() {

        return name;
    }

}
