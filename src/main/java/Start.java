import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        int topX;
        int topY;
        Rover rover = new Rover(0,0,"N");
        List<Rover> outputList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        topX = sc.nextInt();
        topY = sc.nextInt();
        RoverSystem roverSystem = new RoverSystem(topX,topY);
        while(!sc.hasNext("OUT")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            String direction = sc.next();
            rover = new Rover(x,y,direction);
            roverSystem.getFinalCoordinate(rover,outputList,sc);
        }
        roverSystem.getTopRightCoordinate();
        rover.getCoordinate();
    }
}