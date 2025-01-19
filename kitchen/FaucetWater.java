/**
 * Creates water class. Used when faucet is "turned on."
 *
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

public class FaucetWater extends ColorPalette implements DrawingObject {
    private String name;
    private double x;
    private double y;
    private Path2D.Double water;
    private Path2D.Double waterShade;

    public FaucetWater(double x, double y){
        this.x = x;
        this.y = y;

    }

    @Override
    public void draw(Graphics2D g2d) {
        water = new Path2D.Double();
        waterShade = new Path2D.Double();

        water.moveTo(x, y);
        water.lineTo(x+5,y);
        water.lineTo(x+10,y+40);
        water.lineTo(x-10,y+40);
        water.closePath();

        waterShade.moveTo(x, y);
        water.lineTo(x+2,y);
        water.lineTo(x+5,y+40);
        water.lineTo(x-15,y+40);
        water.closePath();

        g2d.setStroke(new BasicStroke(0));
        g2d.setPaint(blue);
        g2d.fill(water);
        g2d.draw(water);

        g2d.setPaint(lightBlue);
        g2d.fill(waterShade);
        g2d.draw(waterShade);
    }

    @Override
    public String objectName(String name) {
        this.name = name;
        return null;
    }

    @Override
    public String getObjectName() {
        return name;
    }
}
