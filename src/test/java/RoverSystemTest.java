//import org.junit.After;
//import org.junit.Before;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.List;
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class RoverSystemTest {
///*
//1. should create and return the right top coordinate with the first line input
//2. should create the rover and return current coordinate with the second line input
//
//3. should return the original coordinate when (0,0,N)
//4. should return the （1,3,N）when the original coordinate is (1,2,N) and given the third line input LMLMLMLMM
//5.
// */
//    private static final Integer INIT_X = 5;
//    private static final Integer INIT_Y = 5;
//    private static List<Rover> OUTPUT_LIST;
//    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
//    private final PrintStream originalOut = System.out;
//    private final PrintStream originalErr = System.err;
//
//    @Before
//    public void setUpStreams() {
//        System.setOut(new PrintStream(outContent));
//        System.setErr(new PrintStream(errContent));
//    }
//
//    @After
//    public void restoreStreams() {
//        System.setOut(originalOut);
//        System.setErr(originalErr);
//    }
//    @Test
//    void should_return_the_original_coordinate_when_given_no_instruction() {
//        String instructionInput = "";
//        ByteArrayInputStream bais = new ByteArrayInputStream(instructionInput.getBytes());
//        System.setIn(bais);
//        RoverSystem roverSystem = new RoverSystem(INIT_X,INIT_Y,OUTPUT_LIST);
//        Rover rover1 = new Rover(1,1,"N");
//        roverSystem.getFinalCoordinate(rover1,scMock);
//        assertEquals("1 1 N\n",outContent.toString());
//
//    }
//}