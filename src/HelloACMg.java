import acm.program.*;
import acm.graphics.*;

import java.awt.*;


public class HelloACMg extends GraphicsProgram {

    public void run(){
        GLabel label = new GLabel("Hello World!!!");
        label.setColor(Color.CYAN);
        add(label, 100, 100);

        GRect rect = new GRect(100, 100);
        add(rect, 200, 200);
        rect.setColor(Color.ORANGE);
        rect.setFillColor(Color.GRAY);
    }
    public static void main(String[] args){
        (new HelloACMg()).start(args);
    }
}