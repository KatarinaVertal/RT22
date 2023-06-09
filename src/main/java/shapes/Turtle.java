package shapes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Turtle {
    private double x;
    private double y;
    private int rotation;
    private int length;

    public Turtle() {
        this.x = 400;
        this.y = 400;
        this.rotation = 0;
        this.length = 10;
    }

    public void move() {
        this.x = this.x + this.length * Math.cos(Math.toRadians(rotation));
        this.y= this.y - this.length * Math.sin(Math.toRadians(rotation));
        System.out.println(x);
    }
}
