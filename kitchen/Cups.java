/**
 * Creates cups for the kitchen. Uses Path2D.Double to create two cups.
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

public class Cups extends ColorPalette implements DrawingObject {
    private Path2D.Double cup;
    private Path2D.Double cup2;
    private Color colorCup;


    public Cups(double x, double y, Color colorCup){

        this.colorCup = colorCup;

        cup = new Path2D.Double();
        cup.moveTo(x+20,y);
        cup.lineTo(x+50, y);
        cup.lineTo(x+45, y+40);
        cup.lineTo(x+25, y+40);
        cup.closePath();

        cup2 = new Path2D.Double();
        cup2.moveTo(x+60,y+15);
        cup2.curveTo(x+60, y+50, x+80, y+50, x+80, y+15);
        cup2.closePath();


    }
    @Override
    public void draw(Graphics2D g2d){
        g2d.setColor(colorCup);
        g2d.fill(cup);
        g2d.fill(cup2);

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
