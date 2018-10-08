package dto;

import java.util.Objects;

public class PointDto {
    private int x;
    private int y;

    public PointDto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
