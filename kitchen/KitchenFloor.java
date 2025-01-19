/**
 * Creates a kitchen floor class. Uses a for loop to create spaced lines automatically.
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
import java.util.*;

public class KitchenFloor extends ColorPalette implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double height;
    private Rectangle floor;
    private Line floorLines;

    public KitchenFloor(double x, double y, double width, double height) {
        this.x = x;
        this.x = y;
        this.width = width;
        this.height = height;

        floor = new Rectangle(x, y, width, height, floorColor);

    }

    public void draw( Graphics2D g2d){
        floor.draw(g2d);

        for (int i = 0; i < 5; i++) {
            floorLines = new Line(0, (y+600)+(i*35), width,
                    (y+600)+(i*35), floorLine, (new BasicStroke(4)));

            floorLines.draw(g2d);
        }
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
