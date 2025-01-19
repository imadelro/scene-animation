/**
 * Creates a Color Palette class. Is implemented by majority of classes
 * in order for them to easily call different colors.
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

public class ColorPalette {
    protected Color darkBrown;
    protected Color lightBrown;
    protected Color glassColor;
    protected Color glassColor2;
    protected Color darkTransparent;
    protected Color shineColor;
    protected Color floorColor;
    protected Color floorLine;
    protected Color black;
    protected Color darkGray;
    protected Color mediumGray;
    protected Color lightGray;
    protected Color dirtyWhite;
    protected Color white;
    protected Color transparentColor;
    protected Color red;
    protected Color blue;
    protected Color lightBlue;
    protected Color yellow;
    protected Color yellowTransparent;
    protected Color brightYellow;
    protected Color orange;
    protected Color darkOrange;

    public ColorPalette(){

        darkBrown = new Color(133, 92, 57);
        lightBrown = new Color(176,119,76);
        glassColor = new Color(69, 76, 89, 80);
        glassColor2 = new Color(172,201,219,80);
        darkTransparent = new Color(17, 17, 17,100);
        shineColor = new Color(150,150,150,80);
        floorColor = new Color(203,176,159);
        floorLine = new Color(182,140,112);
        black = new Color(15, 15, 15);
        darkGray = new Color(32,32,32);
        mediumGray = Color.GRAY;
        lightGray = new Color(189,192,194);
        dirtyWhite = new Color(241,240,245);
        white = Color.WHITE;
        transparentColor = new Color(255,255,255, 73);
        red = new Color(102, 0, 0);
        blue = new Color(41, 172, 255, 119);
        lightBlue = new Color(99, 226, 255, 202);
        yellow = new Color(255, 184, 49, 110);
        yellowTransparent = new Color(248, 222, 98,80);
        brightYellow = new Color(255, 236, 165, 232);
        orange = new Color(255, 129, 49, 232);
        darkOrange = new Color(243, 85, 0, 232);

    }
}
