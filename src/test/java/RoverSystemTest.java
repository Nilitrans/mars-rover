import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
1. return the start position when given no instruction
2. return the correct final position when turn right
3. return the correct final position when turn left
4. return the correct final position when move forward
5. return the correct final position when given complex instruction
6. return correct final positions for multiple rovers with different instructions
7. return edge position when go beyond the coordinate
 */

class RoverSystemTest {

    @Nested
    class withinTheCoordinate{
        RoverSystem roverSystem = new RoverSystem(5,5);
        @Test
        void should_return_the_start_point_when_given_no_instruction() {
            Rover rover = new Rover(1,1, Position.N);
            String instruction = "";

            roverSystem.processInstruction(rover,instruction);

            assertEquals("1 1 N \n",roverSystem.generateOutput().toString());
        }
    }

}