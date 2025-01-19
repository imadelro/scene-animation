/**
 * Creates a line shape class. Makes it easier to create lines.
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
public class Line implements DrawingObject {
    private double xStartPos;
    private double yStartPos;
    private double xEndPos;
    private double yEndPos;
    private Color color;
    private Stroke stroke;

    public Line(double xStartPos, double yStartPos, double xEndPos, double yEndPos, Color color, Stroke stroke) {

        this.xStartPos = xStartPos;
        this.yStartPos = yStartPos;
        this.xEndPos = xEndPos;
        this.yEndPos = yEndPos;
        this.yEndPos = yEndPos;
        this.color = color;
        this.stroke = stroke;

    }


    public void draw(Graphics2D g2d) {

        Line2D.Double line1 = new Line2D.Double(xStartPos, yStartPos, xEndPos, yEndPos);
        g2d.setColor(color);
        g2d.setStroke(stroke);
        g2d.draw(line1);


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
