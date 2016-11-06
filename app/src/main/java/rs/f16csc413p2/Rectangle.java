package rs.f16csc413p2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.Random;


/**
 * A concrete instance of Shape as a rectangle.  Can be drawn to a View.  Implements
 * onDraw(Canvas).
 *
 * See Circle for implementation details
 */
public class Rectangle extends Shape {

    /**
     * Constructor
     * @param context Current application context.
     */
    public Rectangle(Context context){
        super(context);
    }

    /**
     * A concrete instance of Shape as a rectangle.  Can be drawn to a View.  Implements
     * onDrawe(Canvas).
     *
     * @param canvas the canvas onto which the rectangle will be drawn.
     *
     */
    public void onDraw(Canvas canvas) {

        // TODO:   Your code goes here
        Random rm = new Random();

        Paint myPaint = new Paint();
        myPaint.setAlpha(1);

        int red = rm.nextInt(255);
        int grn = rm.nextInt(255);
        int blu = rm.nextInt(255);

        myPaint.setColor(Color.rgb(red, grn, blu));
        myPaint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL);

        int height = canvas.getWidth();
        int width = canvas.getWidth();


        int left =  rm.nextInt(width)+1;
        int right = rm.nextInt(width);
        if(right > width){
            right = width - 1;
        }
        if(right < left){
            right = right + 1;
        }

        int top = (rm.nextInt(height)) +1;
        int bottom =  rm.nextInt(height);
        if(bottom > height){
            bottom = height - 1;
        }
        if(bottom < top){
            bottom = top +1;
        }
        canvas.drawRect(left, top, right, bottom, myPaint);


    }

    /**
     * Returns the current Shape type as a ShapeType.
     *
     * @return ShapeType.RECTANGLE
     */
    public ShapeType getShapeType(){ return ShapeType.RECTANGLE; }


}