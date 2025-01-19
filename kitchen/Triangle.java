/**
 * Creates custom Triangle class. Allows easier creation of triangles.
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
public class Triangle implements DrawingObject{
    private double xStartPoint;
    private double yStartPoint;
    private double xPoint2;
    private double yPoint2;
    private double xEndPoint;
    private double yEndPoint;
    private Color color;

    public Triangle(double xStartPoint, double yStartPoint, double xPoint2, double yPoint2,
                    double xEndPoint, double yEndPoint, Color color ) {

        this.xStartPoint = xStartPoint;
        this.yStartPoint = yStartPoint;
        this.xPoint2 = xPoint2;
        this.yPoint2 = yPoint2;
        this.xEndPoint = xEndPoint;
        this.yEndPoint = yEndPoint;
        this.color = color;

    }

    public void draw(Graphics2D g2d){

        Path2D.Double triangle = new Path2D.Double();
        g2d.setColor(color);
        triangle.moveTo(xStartPoint, yStartPoint);
        triangle.lineTo(xPoint2, yPoint2);
        triangle.lineTo(xEndPoint, yEndPoint);
        triangle.closePath();
        g2d.fill(triangle);
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
