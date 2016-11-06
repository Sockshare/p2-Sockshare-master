package rs.f16csc413p2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

/**
 * Returns either a circle, rectangle or picture shape that can
 * be sent to a view since each shape implements the onDraw() method.
 * Returns null if the string cannot be decoded
 *
 * @param   //context     Current application context
 * @param   //shape       String containing either circle, rectangle or picture
 * @return              Shape object or null if the shape string cannot be decoded
 */
public class ShapeFactory {

    public Shape getShape(Context context, String shape) {

        // TODO: Your code goes here


        if(shape.equalsIgnoreCase("RECTANGLE")){

            Shape rectangle;
            rectangle = new Rectangle(context);
            return rectangle;
        }

        if(shape.equalsIgnoreCase("CIRCLE")){

            Shape circle;
            circle = new Circle(context);
            return circle;
        }

        //Need to convert a Drawable into a shape in order to return it

        if(shape.equalsIgnoreCase("PICTURE")){

            Picture pic = new Picture(context);
            return pic;
        }
        return null;
    }
}