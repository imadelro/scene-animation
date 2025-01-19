/**
 * Creates the counter for the kitchen. Only made out of Rectangles.
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

public class Counter extends ColorPalette implements DrawingObject {
    private Rectangle counterBody;
    private Rectangle counterTop;

    public Counter(double x, double y, double width, double height){

        counterBody = new Rectangle(x, y, width, height, (new Color(207,207,205)));
        counterTop = new Rectangle(x-15, y, width+15, height*0.10, (new Color(76,62,79)));

    }
    @Override
    public void draw( Graphics2D g2d){
        counterBody.draw(g2d);
        counterTop.draw(g2d);

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
