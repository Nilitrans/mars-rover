import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        int topX;
        int topY;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        topX = sc.nextInt();
        topY = sc.nextInt();
        RoverSystem roverSystem = new RoverSystem(topX,topY);
        while(!sc.hasNext("OUT")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Position initPos = Position.valueOf(sc.next());
            Rover rover = new Rover(x,y,initPos);
            String instruction = sc.next();
            roverSystem.processInstruction(rover,instruction);
        }
        System.out.println(roverSystem.generateOutput());
    }
}