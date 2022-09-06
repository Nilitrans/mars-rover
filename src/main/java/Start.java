import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        int topX = 0;
        int topY = 0;
        Rover rover = new Rover(0,0,"N");
        RoverSystem roverSystem = new RoverSystem(0,0, null, Collections.emptyList(),null);
        List<Rover> outPutList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        topX = sc.nextInt();
        topY = sc.nextInt();
        while(!sc.hasNext("OUT")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            String direction = sc.next();
            rover = new Rover(x,y,direction);
            roverSystem = new RoverSystem(topX,topY,rover,outPutList,sc);
        }
        roverSystem.getTopRightCoordinate();
        rover.getCoordinate();
    }
}