class Rover {
    private int x;
    private int y;
    private Position position;

    public Rover(int x, int y, Position position) {
        this.x = x;
        this.y = y;
        this.position = position;
    }

    public String getCoordinate() {
        return String.format("火星车当前的坐标为（%d,%d,%s）", x, y, position);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position getDirection() {
        return position;
    }

    public void moveForward() {
        switch (this.position) {
            case E:
                this.x += 1;
                break;
            case S:
                this.y -= 1;
                break;
            case W:
                this.x -= 1;
                break;
            case N:
                this.y += 1;
                break;
        }
    }

    public void turnLeft() {
        switch (this.position) {
            case E:
                this.position = Position.N;
                break;
            case S:
                this.position = Position.E;
                break;
            case W:
                this.position = Position.S;
                break;
            case N:
                this.position = Position.W;
                break;
        }
    }


    public void turnRight () {
        switch (this.position) {
            case E:
                this.position = Position.S;
                break;
            case S:
                this.position = Position.W;
                break;
            case W:
                this.position = Position.N;
                break;
            case N:
                this.position = Position.E;
                break;
        }
        }
}
