import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RoverSystemTest {
    private final BufferedReader bf = mock(BufferedReader.class);
    private RoverSystem rs;
    private Rover rover;
    private ByteArrayOutputStream bytes = null;
    private PrintStream console = null;

    @Before
    public void setUp() {
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));

    }
    @Test
    void should_create_empty_coordinate_with_first_line_inputted() {
//        rs = new RoverSystem(1,2);
        String expectedOutput = "右上角的坐标为（1,2）";

        String input = "1 2 \n OUT";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);


        Assertions.assertEquals(expectedOutput, bytes.toString());
    }

//    @Test
//    void should_return_the_marCar_when_second_line_inputted(){
//        try {
//            when(bf.read()).thenReturn(5).thenReturn(5).thenReturn(1).thenReturn(2).thenReturn("N");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        rs = new RoverSystem(5,5);
//        rover = new Rover(1,2,"N");
//        String expectedOutput = "火星车当前的坐标为（1,2,N）";
//        Assertions.assertEquals(expectedOutput, rover.getCoordinate());
//
//    }
}
