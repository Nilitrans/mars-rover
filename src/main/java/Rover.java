public class Rover {
    private int x;
    private int y;
    private String direction;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void getCoordinate() {
        String output = String.format("火星车当前的坐标为（%d,%d,%s）", x, y, direction);
        System.out.println(output);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void moveForward() {
        switch (this.direction) {
            case "E":
                this.x += 1;
                break;
            case "S":
                this.y -= 1;
                break;
            case "W":
                this.x -= 1;
                break;
            case "N":
                this.y += 1;
                break;
        }
    }

    public void turnLeft() {
        switch (this.direction) {
            case "E":
                this.direction = "N";
                break;
            case "S":
                this.direction = "E";
                break;
            case "W":
                this.direction = "S";
                break;
            case "N":
                this.direction = "W";
                break;
        }
    }


    public void turnRight () {
        switch (this.direction) {
            case "E":
                this.direction = "S";
                break;
            case "S":
                this.direction = "W";
                break;
            case "W":
                this.direction = "N";
                break;
            case "N":
                this.direction = "E";
                break;
        }
        }

    @Override
    public String toString() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", direction='" + direction + '\'' +
                '}';
    }
}
