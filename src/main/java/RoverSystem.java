import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class RoverSystem {
    private int topX;
    private int topY;
    private Rover rover;
    private List<Rover> outputList;
    private Scanner sc;

    public RoverSystem(int topX, int topY, Rover rover, List<Rover> outputList, Scanner sc) {
        this.topX = topX;
        this.topY = topY;
        this.rover = rover;
        this.outputList = outputList;
        this.sc = sc;
    }

    public void getTopRightCoordinate(){
        String output = String.format("右上角的坐标为（%d,%d）", topX,topY);
        System.out.println(output);
    }
}
