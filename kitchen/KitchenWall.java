/**
 * Creates a kitchen wall class. Uses a for loop to create spaced lines automatically. There are two different for loops
 * for both vertical and horizontal lines.
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

public class KitchenWall extends ColorPalette implements DrawingObject {
    private double x;
    private double y;
    private double width;
    private double height;
    private Rectangle wall;
    private Line vertical_lines;
    private Line horizontal_lines;


    public KitchenWall(double x, double y, double width, double height) {
        this.x = x;
        this.x = y;
        this.width = width;
        this.height = height;

        wall = new Rectangle(x, y, width, height, (new Color(230,231,235)));

    }
    public void draw( Graphics2D g2d ) {

        wall.draw(g2d);

        for (int i = 0; i < 26; i++) {
             vertical_lines = new Line( i*40, y, i*40, y+height, (new Color(167,168,172)), (new BasicStroke(2)));
              vertical_lines.draw(g2d);
        }
        for(int i = 0; i < 15; i++){
            horizontal_lines = new Line( x, i*40, width+x+280, i*40, (new Color(167,168,172)), (new BasicStroke(2)));
            horizontal_lines.draw(g2d);
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
