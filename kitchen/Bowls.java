import java.awt.*;
/**
 * Class that makes a stack of bowls. Utilizes the SemiCircle shape class to create each bowl.
 This is a template for a Java file.
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

public class Bowls extends ColorPalette implements DrawingObject {
    String name;
    private SemiCircle bowl1;
    private SemiCircle bowl2;
    private SemiCircle bowl3;

    /**
     * @param x - starting x coordinate
     * @param y - starting y coordinate
     * Creates three new bowls.
     */
    public Bowls(double x, double y){

        bowl1 = new SemiCircle(x+40, y+50, x+20, y+75, x+90, y+80, x+80, y+60, dirtyWhite);
        bowl2 = new SemiCircle(x+35,y+70,x+35,y+90, x+80, y+100,x+80, y+70, lightGray);
        bowl3 = new SemiCircle(x+25,y+80,x+20,y+100, x+90, y+110,x+90, y+80, dirtyWhite);

    }

    @Override
    public void draw(Graphics2D g2d){
        bowl1.draw(g2d);
        bowl2.draw(g2d);
        bowl3.draw(g2d);
    }


    @Override
    public String objectName(String name) {

        return name;
    }

    @Override
    public String getObjectName() {
        return name;
    }
}
