/**
 * Creates a sink and faucet. Composed of various shapes.
 @author Ma. Malena T. del Rosario (222071)
 @version March 6, 2023
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

public class Sink extends ColorPalette implements DrawingObject{
    private Path2D.Double faucet;
    private SemiCircle metalPart;
    private Path2D.Double faucetOutline;
    private Rectangle sink;
    private Rectangle sinkOutline;
    public Sink(double x, double y){
        sink = new Rectangle(x-30, y, 70, 3, lightGray);
        sinkOutline = new Rectangle(x-40, y, 90, 8, darkGray);
        metalPart = new SemiCircle(x-20,y,x-20, y-20,x,y-20,x,y, darkGray);
        faucet = new Path2D.Double();
        faucet.moveTo(x-10, y);
        faucet.curveTo(x-15, y-20, x, y-80, x+15, (y*2-80)*0.5);
        faucetOutline = new Path2D.Double();
        faucetOutline.moveTo(x-10, y);
        faucetOutline.curveTo(x-15, y-20, x, y-80, x+15, (y*2-80)*0.5);



    }
    @Override
    public void draw(Graphics2D g2d) {

        g2d.setPaint(black);
        sinkOutline.draw(g2d);
        g2d.setStroke(new BasicStroke(10));
        g2d.setPaint(darkGray);
        g2d.draw(faucetOutline);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(faucet);
        metalPart.draw(g2d);
        sink.draw(g2d);
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
