/**
 * Creates a socket. Composed of multiple personalized Shape classes.
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

public class Socket extends ColorPalette implements DrawingObject {
    private double y;
    private Shape socketOutline;
    private Rectangle socketLayer;
    private Square socket1;
    private Square socket2;
    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;
    private SemiCircle plug1;
    private SemiCircle plug2;


    public Socket(double x, double y, double width, double height) {
        this.y = y;
        socketOutline = new RoundRectangle2D.Double(x, y, width, height, 3, 3);
        socketLayer = new Rectangle(x + 5, y + 5, width * 0.80, height * 0.65,
                (new Color(241, 240, 245)));

        //Construction of left socket
        socket1 = new Square(x + 8, y + 8, 10, white);
        line1 = new Line(x + 8, y + 8, x + 8, y + 13,
                black, (new BasicStroke(1)));
        line2 = new Line(x + 18, y + 8, x + 18, y + 13,
                black, (new BasicStroke(1)));
        plug1 = new SemiCircle(x+10, y+18, x+10, y+10, x+17, y+10, x+17, y+18, black);

        //Construction of right socket
        socket2 = new Square(x + 30, y + 6, 14, white);
        line3 = new Line(x + 32, y + 8, x + 32, y + 13,
                black, (new BasicStroke(1)));
        line4 = new Line(x + 42, y + 8, x + 42, y + 13,
                black, (new BasicStroke(1)));
        plug2 = new SemiCircle(x+41, y+18, x+41, y+10, x+34, y+10,
                x+34, y+18, black);
    }

    @Override
    public void draw(Graphics2D g2d){
        g2d.setPaint(new Color(217, 216, 221));
        g2d.draw(socketOutline);
        socketLayer.draw(g2d);

        socket1.draw(g2d);
        line1.draw(g2d);
        line2.draw(g2d);
        plug1.draw(g2d);

        socket2.draw(g2d);
        line3.draw(g2d);
        line4.draw(g2d);
        plug2.draw(g2d);

    }
    public void moveX(){
        y += 10;
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
