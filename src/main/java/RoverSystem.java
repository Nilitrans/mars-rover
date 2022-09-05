public class RoverSystem {
    private int topX;
    private int topY;

    public RoverSystem(int topX, int topY) {
        this.topX = topX;
        this.topY = topY;
    }

    public String getTopRightCoordinate(){
        String output = String.format("右上角的坐标为（%d,%d）", topX,topY);
        System.out.println(output);
        return output;
    }
}
