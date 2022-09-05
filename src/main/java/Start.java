import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int topX = 0;
        int topY = 0;
        while(!sc.hasNext("OUT")){
            topX = sc.nextInt();
            topY = sc.nextInt();
        }
        RoverSystem rs = new RoverSystem(topX,topY);

    }
}