/**
 * Creates an Exhaust fan. Composite shape made out of personal Rectangle and Triangle classes.
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
import java.util.*;

public class ExhaustFan extends ColorPalette implements DrawingObject {
    private Rectangle rectangle;
    private Rectangle rectangle2;
    private Rectangle rectangle3;
    private Rectangle connecter;
    private Triangle triangle;
    private ArrayList<Circle> buttons;

    public ExhaustFan(double x, double y, double width, double height){
        rectangle = new Rectangle(x-10, y, width-7, height, white);
        triangle = new Triangle( (x+120), y+160, x-40, y+160, x+35, y+60, (dirtyWhite));
        rectangle2 = new Rectangle(x-40, y+161, (width*1.55)+5, height*0.20, mediumGray);
        rectangle3 = new Rectangle(x-45, y+180, (width*1.55)+15, (height*0.20)/5, (new Color(34, 33, 36)));
        connecter = new Rectangle(x*0.85, 0, 270, 10, darkGray);

        buttons = new ArrayList<Circle>();
        for (int i = 1; i <= 3; i++){ //Uses for loop to create buttons automatically
            buttons.add(new Circle( (x+30)+(i*20), height*1.38, 10, black));
            buttons.add(new Circle( (x+31)+(i*20), height*1.40, 5, (new Color(161, 0,0 ))));
        }



    }

    public void draw( Graphics2D g2d){
        triangle.draw(g2d);
        rectangle.draw(g2d);
        rectangle2.draw(g2d);
        rectangle3.draw(g2d);
        connecter.draw(g2d);

        for (int i = 0; i < buttons.size(); i++){
            buttons.get(i).draw(g2d);
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
