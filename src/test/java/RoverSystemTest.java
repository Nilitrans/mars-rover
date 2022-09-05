import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.when;

public class RoverSystemTest {
    BufferedReader bf = Mockito.mock(BufferedReader.class);
    @Test
    void should_create_empty_coordinate_with_first_line_input() {
        RoverSystem rs = new RoverSystem(1,2);
        String expectedOutput = "右上角的坐标为（1,2）";
        try {
            when(bf.read()).thenReturn(1).thenReturn(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(expectedOutput, rs.getTopRightCoordinate());
    }

}
