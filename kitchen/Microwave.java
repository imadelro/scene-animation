/**
 * Creates a microwave class for the kitchen. Composite shapes composed of various shapes.
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

public class Microwave extends ColorPalette implements DrawingObject {
    private Rectangle body;
    private Shape door;
    private Shape glass;
    private Line handle;
    private Circle button1;
    private Circle button2;
    private Rectangle indicator;
    private Path2D.Double wire;
    private SemiCircle plug;
    private Line prong1;
    private Line prong2;


    public Microwave(double x, double y, double width, double height){
        body = new Rectangle(x, y, width, height, darkGray);
        door = new RoundRectangle2D.Double(x+7, y+7, width*0.70, height*0.85, 5, 5);
        glass = new RoundRectangle2D.Double(x+7, y+7, width*0.70, height*0.85, 5, 5);
        indicator = new Rectangle(x*1.26, y+7, width*0.15, height*0.15, black);
        button1 = new Circle(x*1.27, y+30, 10, lightGray);
        button2 = new Circle(x*1.27, y+45, 10, lightGray);
        plug = new SemiCircle(x-48,y+55,x-44,y+60,x-36,y+65,x-38,y+50,black);
        prong1 = new Line(x-42,y+48, x-39, y+55, darkGray, (new BasicStroke(1)));
        prong2 = new Line(x-48,y+50, x-45, y+55, darkGray, (new BasicStroke(1)));
        handle = new Line(x*1.22, y+20, x*1.22, y+55, lightGray, (new BasicStroke(3)));

        wire = new Path2D.Double();
        wire.moveTo(x-40, y+60);
        wire.curveTo(x-30, y+90, x, y+30, x+1.63, y+50);

    }

    public void draw(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(5));
        g2d.setPaint(black);
        g2d.draw(wire);
        body.draw(g2d);
        g2d.setPaint(darkGray);
        g2d.fill(door);
        g2d.draw(door);
        g2d.setPaint(glassColor);
        g2d.fill(glass);
        g2d.draw(glass);
        handle.draw(g2d);
        indicator.draw(g2d);
        button1.draw(g2d);
        button2.draw(g2d);
        plug.draw(g2d);
        prong1.draw(g2d);
        prong2.draw(g2d);


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
