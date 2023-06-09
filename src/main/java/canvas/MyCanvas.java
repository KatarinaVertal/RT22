package canvas;

import lombok.Getter;
import lombok.Setter;
import shapes.Turtle;

import javax.swing.*;
import java.awt.*;

@Getter @Setter
public class MyCanvas extends JPanel {
    private Turtle turtle;

    public MyCanvas(){
        this.turtle = new Turtle();
    }

    public void paintComponent(Graphics g){
        g.fillOval((int) (turtle.getX()-15), (int) (turtle.getY()-15), 30,30);
        g.setColor(Color.red);
        g.fillOval((int) (turtle.getX()+10), (int) (turtle.getY()-5), 10,10);
    }
}
