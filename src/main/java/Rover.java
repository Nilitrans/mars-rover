public class Rover {
    private int x;
    private int y;
    private String direction;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void getCoordinate(){
        String output = String.format("火星车当前的坐标为（%d,%d,%s）", x,y,direction);
        System.out.println(output);
    }
}
