package shapes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Turtle {
    private Integer x;
    private Integer y;
    private Integer rotation;

    public Turtle() {
        this.x = 400;
        this.y = 400;
        this.rotation = 0;
    }

}
