
import java.util.ArrayList;
import java.util.List;

class RoverSystem {
    private final Integer topX;
    private final Integer topY;
    private List<Rover> outputList = new ArrayList<>();

    private boolean checkBoundary(Rover rover){
        return rover.getX()<topX ||rover.getY()>topY;
    }

    public RoverSystem(int topX, int topY) {
        this.topX = topX;
        this.topY = topY;
    }

    private void getFinalCoordinate(Rover rover, List<Command> commands) {
        if (checkBoundary(rover)) {
            for (Command command : commands) {
                executeCommand(rover, command);
            }
        }
        outputList.add(rover);
    }

    private void executeCommand(Rover rover, Command command) {
        switch (command) {
            case L:
                rover.turnLeft();
                break;
            case R:
                rover.turnRight();
                break;
            case M:
                rover.moveForward();
                break;
            default:
                System.out.println("Bad instruction declare");
                break;
        }
    }

    public void processInstruction(Rover rover,String instruction) {
        if(instruction.length()==0){
            outputList.add(rover);
        }else {
            List<Command> convertedList = new ArrayList<>();
            char[] charArr = instruction.toCharArray();
            for (char chr : charArr) {
                convertedList.add(Command.valueOf(String.valueOf(chr)));
            }
            getFinalCoordinate(rover, convertedList);
        }
    }

    public StringBuilder generateOutput(){
        StringBuilder outputString = new StringBuilder();
        outputList.forEach(rover -> outputString.append(String.format("%d %d %s \n",rover.getX(), rover.getY(), rover.getDirection())));
        return outputString;
    }
}
