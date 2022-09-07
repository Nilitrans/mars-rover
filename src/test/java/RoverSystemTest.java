import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/*
1. should create and return the right top coordinate with the first line input
2. should create the rover and return current coordinate with the second line input
3. should return the original coordinate when (0,0,N)
4. should return the （1,3,N）when the original coordinate is (1,2,N) and given the third line input LMLMLMLMM
5.
 */
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

    @Test
    void should_return_the_marCar_when_second_line_inputted() throws IOException {
        try {
//            when(bf.read()).thenReturn(5).thenReturn(5).thenReturn(1).thenReturn(2).thenReturn("N");
            when(bf.readLine()).thenReturn("5 5 \n1 2 N");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(bf.readLine());
        rs = new RoverSystem(5,5);
        rover = new Rover(1,2,"N");
        String expectedOutput = "火星车当前的坐标为（1,2,N）";

    }
}

