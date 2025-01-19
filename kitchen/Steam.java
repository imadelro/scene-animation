/**
 * Class that makes steam. Appears on canvas when user clicks on stove knob.
 *
 @author Ma. Malena T. del Rosario (222071)
 @version March 7, 2023
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

public class Steam extends ColorPalette implements DrawingObject {
    private double x;
    private double y;
    private double yOrig;

    public Steam(double x, double y){
        this.x = x;
        this.y = y;

        yOrig = y; //saves original y coordinate for looping the animation.

    }

    @Override
    public void draw(Graphics2D g2d){
        GradientPaint gradient = new GradientPaint(560, 500, darkGray, 500, 200, transparentColor);
        g2d.setPaint(gradient);
        g2d.setStroke(new BasicStroke(3));

        Path2D.Double steam = new Path2D.Double();

        steam.moveTo(x, y);
        steam.curveTo(x - 35, y + 10, x + 10, y + 10, x - 10, y + 30);
        steam.moveTo(x + 20, y);
        steam.curveTo(x - 15, y +10, x + 30, y + 10, x + 10, y + 30);
        steam.moveTo(x + 20, y+150);
        steam.curveTo(x - 15, y + 160, x + 30, y + 160, x + 10, y + 180);
        steam.moveTo(x, y+150);
        steam.curveTo(x - 35, y + 160, x + 10, y + 160, x - 10, y + 180);

        g2d.draw(steam);

    }
    /**
     * When method is called y will decrement by 2 pixels therefore
     * the steam will appear to move up. However, when y finally becomes
     * less than 0, it will modify the y value and give it back the original value.
     */
    public void moveSteam(){
        y -= 2;

        if (y < -30) //When y becomes less than -30, steam will reset
            y = yOrig;
    }

    @Override
    public String objectName(String name) {
        return null;
    }

    @Override
    public String getObjectName() {
        return null;
    }
}
