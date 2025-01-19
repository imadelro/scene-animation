/**
 * Creates a fire class. Made out of multiples triangles. Each triangle signifies a flame.
 * Also uses two orange colors for some texture.
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

public class Fire extends ColorPalette implements DrawingObject {
    private String name;
    private Triangle flame1;
    private Triangle flame2;
    private Triangle flame3;
    private Triangle flame4;
    private Triangle flame5;
    private Triangle flame6;
    private Triangle flame7;
    private Triangle flame8;
    private Circle stoveIndicator;


    public Fire(double x, double y){
        flame1 = new Triangle(x,y,x+10,y-7,x+10, y, orange);
        flame2 = new Triangle(x+10,y,x+25,y-20,x+20, y, orange);
        flame3 = new Triangle(x,y,x-7,y-14,x-15, y, orange);
        flame4 = new Triangle(x-15, y,x-20,y-10,x-28, y, orange);
        flame5 = new Triangle(x+8,y,x+10,y-3,x+10, y, darkOrange);
        flame6 = new Triangle(x+13,y,x+25,y-15,x+20, y, darkOrange);
        flame7 = new Triangle(x-7,y,x-7,y-7,x-15, y, darkOrange);
        flame8 = new Triangle(x-20, y,x-20,y-13,x-31, y, darkOrange);

        stoveIndicator = new Circle(568, 326.4, 5,red);
    }
    @Override
    public void draw(Graphics2D g2d) {

        flame1.draw(g2d);
        flame2.draw(g2d);
        flame3.draw(g2d);
        flame4.draw(g2d);
        flame5.draw(g2d);
        flame6.draw(g2d);
        flame7.draw(g2d);
        flame8.draw(g2d);
        stoveIndicator.draw(g2d);
    }

    @Override
    public String objectName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String getObjectName() {
        return name;
    }
}
