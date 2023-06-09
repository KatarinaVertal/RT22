package shapes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Turtle {
    private int x;
    private int y;
    private int rotation;
    private int length;

    public Turtle() {
        this.x = 400;
        this.y = 400;
        this.rotation = 0;
        this.length = 10;
    }

    public void move() {

    }
}
