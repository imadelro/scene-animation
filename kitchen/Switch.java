/**
 * Creates light switch.
 *
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
public class Switch extends ColorPalette implements DrawingObject {
    private Rectangle lightSwitch;
    private Rectangle layer1;
    public Switch(double x, double y, double width, double height){

        lightSwitch = new Rectangle(x, y, width, height, dirtyWhite);
        layer1 = new Rectangle(x+7,y+7, width*0.40, height*0.40, white);

    }

    public void draw(Graphics2D g2d){
        lightSwitch.draw(g2d);
        layer1.draw(g2d);
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
