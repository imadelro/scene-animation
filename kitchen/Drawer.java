/**
 * Class that creates drawers. Responsible for the drawers seen at the bottom.
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

public class Drawer extends ColorPalette implements DrawingObject {
    private Rectangle drawerSize;
    private Rectangle drawer;
    private Line drawerHandle;

    public Drawer(double x, double y, double width, double height){

        drawerSize = new Rectangle(x, y, width, height, (darkBrown));
        drawer = new Rectangle(x+10, y+10, width*0.90, height*0.75, (lightBrown));
        drawerHandle = new Line( (x+40), (y+20), x+150, (y+20), (lightGray), (new BasicStroke(5)));

    }
    @Override
    public void draw(Graphics2D g2d){

        drawerSize.draw(g2d);
        drawer.draw(g2d);
        drawerHandle.draw(g2d);

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
