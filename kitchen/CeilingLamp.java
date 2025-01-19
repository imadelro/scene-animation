/**
 * Class that creates a Ceiling Lamp. Composite shape composed of various shape classes.
 This is a template for a Java file.
 @author Ma. Malena T. del Rosario (222071)
 @version Mach 6, 2023
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

public class CeilingLamp extends ColorPalette implements DrawingObject{
    private SemiCircle lampshade;
    private Rectangle cord;
    private Path2D.Double shadow;
    private Shape bulb ;
    private Color currentColor;

    /**
     * @param x - starting x coordinate
     * @param y - starting y coordinate
     * @param width - width of cabinet
     * @param height - starting height of cabinet
     *
     */

    public CeilingLamp(double x, double y, double width, double height){
        currentColor = white;
        bulb = new Ellipse2D.Double(x-10, y+90, 20,20);
        cord = new Rectangle(x, y, width, height, mediumGray);
        lampshade = new SemiCircle(x*0.60, y+100, x*0.60, y+30, x*1.40, y+30, x*1.40, y+100, white);
        shadow = new Path2D.Double();
        shadow.moveTo(x, y+47);
        shadow.curveTo(x*1.40, y+50, x*1.40, y+100, x*1.40, y+100);
        shadow.lineTo(x*1.15,y+100);
        shadow.closePath();

    }
    @Override
    public void draw(Graphics2D g2d){
        cord.draw(g2d);
        g2d.setPaint(currentColor);
        g2d.fill(bulb);
        g2d.draw(bulb);
        lampshade.draw(g2d);
        g2d.setPaint(dirtyWhite);
        g2d.fill(shadow);


    }
    public void changeBulb(Color color){
        currentColor = color;
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
