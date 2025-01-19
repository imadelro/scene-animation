/**
 * Creates a Semi Circle shape class. Allows easier creation of semi circles.
 This is a template for a Java file.
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

public class SemiCircle implements DrawingObject {
    private double xStartPoint;
    private double yStartPoint;
    private double xBezierPointLeft;
    private double yBezierPointLeft;
    private double xBezierPointRight;
    private double yBezierPointRight;
    private double xEndPoint;
    private double yEndPoint;
    private Color color;
    public SemiCircle(double x, double y, double x2, double y2, double x3, double y3, double x4, double y4, Color color ){
        xStartPoint = x;
        yStartPoint = y;
        xBezierPointLeft = x2;
        yBezierPointLeft = y2;
        xBezierPointRight = x3;
        yBezierPointRight = y3;
        xEndPoint = x4;
        yEndPoint = y4;
        this.color = color;

    }

    public void draw(Graphics2D g2d){
        Path2D.Double SemiCircle = new Path2D.Double();
        SemiCircle.moveTo(xStartPoint, yStartPoint);
        SemiCircle.curveTo(xBezierPointLeft, yBezierPointLeft, xBezierPointRight, yBezierPointRight, xEndPoint, yEndPoint);
        g2d.setPaint(color);
        g2d.fill(SemiCircle);


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

