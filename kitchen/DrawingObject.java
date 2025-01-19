/**
 * Interface for the different objects. All objects utilize the draw() method, but only some classes
 * makes use of the objectName() and getObjectName() methods (those that need to be removed from the ArrayList).
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

public interface DrawingObject{

    void draw( Graphics2D g2d );
}
