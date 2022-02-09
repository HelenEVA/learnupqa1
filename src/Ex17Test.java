import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex17Test {

    @Test
    public void shouldAmountRetired(){

        int[]speeds = new int[3];
        speeds[0] = 1;
        speeds[1] = 0;
        speeds[2] = 3;

        int expected = 2;
        int actual = Ex17.amountRetired(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulIncorrectdAmountRetired(){

        int[]speeds = new int[3];
        speeds[0] = 1;
        speeds[1] = 3;
        speeds[2] = 3;

        int expected = 2;
        int actual = Ex17.amountRetired(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSpeedsRetired(){

        int[]speeds = {1, 0, 3};

        int[] expected = {1, 3};
        int[] actual = Ex17.ArrayRetired(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldNotSpeedsRetired(){

        int[]speeds = {1, 0, 3};

        int[] expected = {0};
        int[] actual = Ex17.ArrayNotRetired(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }
    
}