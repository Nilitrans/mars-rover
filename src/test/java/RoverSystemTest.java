import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
7. return edge position when go beyond the coordinate
 */

class RoverSystemTest {

    RoverSystem roverSystem = new RoverSystem(5,5);
    @Nested
    class withinTheCoordinate{
        @Test
        void given_1_1_N_should_return_the_start_point_when_given_no_instruction() {
            Rover rover = new Rover(1,1, Position.N);
            String instruction = "";

            roverSystem.processInstruction(rover,instruction);

            assertEquals("1 1 N \n",roverSystem.generateOutput().toString());
        }

        @Test
        void given_1_1_N_should_return_1_1_E_when_given_turn_right() {
            Rover rover = new Rover(1,1, Position.N);
            String instruction = "R";

            roverSystem.processInstruction(rover,instruction);

            assertEquals("1 1 E \n",roverSystem.generateOutput().toString());
        }

        @Test
        void given_1_1_N_should_return_1_1_W_when_given_turn_left() {
            Rover rover = new Rover(1,1, Position.N);
            String instruction = "R";

            roverSystem.processInstruction(rover,instruction);

            assertEquals("1 1 E \n",roverSystem.generateOutput().toString());
        }

        @Test
        void given_1_1_N_should_return_1_2_N_when_move_forward() {
            Rover rover = new Rover(1,1, Position.N);
            String instruction = "M";

            roverSystem.processInstruction(rover,instruction);

            assertEquals("1 2 N \n",roverSystem.generateOutput().toString());
        }

        @Test
        void given_1_1_E_should_return_2_1_E_when_move_forward() {
            Rover rover = new Rover(1,1, Position.E);
            String instruction = "M";

            roverSystem.processInstruction(rover,instruction);

            assertEquals("2 1 E \n",roverSystem.generateOutput().toString());
        }

        @Test
        void given_1_1_N_should_return_1_2_N_when_process_LMLMLMLMM_as_instruction() {
            Rover rover = new Rover(1,1, Position.N);
            String instruction = "LMLMLMLMM";

            roverSystem.processInstruction(rover,instruction);

            assertEquals("1 2 N \n",roverSystem.generateOutput().toString());
        }

        @Test
        void given_1_1_N_and_3_3_E_should_return_1_2_N_and_5_1_E_when_process_LMLMLMLMM_and_MMRMMRMRRM_as_instructions() {
            Rover rover1 = new Rover(1,1, Position.N);
            Rover rover2 = new Rover(3,3, Position.E);
            String instruction1 = "LMLMLMLMM";
            String instruction2 = "MMRMMRMRRM";

            roverSystem.processInstruction(rover1,instruction1);
            roverSystem.processInstruction(rover2,instruction2);

            assertEquals("1 2 N \n5 1 E \n",roverSystem.generateOutput().toString());
        }
    }

    @Nested
    class beyondTheCoordinate{
        @Test
        void given_4_4_N_should_return_edge_point_4_5_N_when_given_MM() {
            Rover rover = new Rover(4,4, Position.N);
            String instruction = "MM";

            roverSystem.processInstruction(rover,instruction);

            assertEquals("4 5 N \n",roverSystem.generateOutput().toString());
        }
    }
}