
import java.util.List;
import java.util.Scanner;

public class RoverSystem {
    private final Integer topX;
    private final Integer topY;
    protected List<Rover> outputList;

    private boolean checkBoundary(Rover rover){
        return rover.getX()<topX ||rover.getY()>topY;
    }

    public RoverSystem(int topX, int topY) {
        this.topX = topX;
        this.topY = topY;
    }

    public void getTopRightCoordinate(){
        String output = String.format("右上角的坐标为（%d,%d）", topX,topY);
        System.out.println(output);
    }

    public void getFinalCoordinate(Rover rover, List<Rover> outputList, Scanner sc) {
        boolean processSuccessfully = true;
        if(checkBoundary(rover)){
            String instruction = sc.next();
            if(instruction!=null && instruction.length()>0) {
                char[] strChar = instruction.toCharArray();
                for(char chr : strChar){
                    switch (String.valueOf(chr)) {
                        case "M":
                            rover.moveForward();
                            break;
                        case "L":
                            rover.turnLeft();
                            break;
                        case "R":
                            rover.turnRight();
                            break;
                        default:
                            System.out.println("Bad instruction declare");
                            processSuccessfully =false;
                            break;
                    }
                }
            }
            if(processSuccessfully){
                outputList.add(rover);
            }
        }
    }

    public void generateOutput(){
        StringBuilder outputString = new StringBuilder();
        outputList.forEach(rover -> {
            outputString.append(String.format("%d %d %s",rover.getX(), rover.getY(), rover.getDirection()));
        });
        System.out.println(outputString);
    }

}
