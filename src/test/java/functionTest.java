import org.junit.Test;

import static org.junit.Assert.*;

public class functionTest {

    @Test
    public void main() {
        int [] arr = {0, 2, 9, 10, 87};
        assertArrayEquals(arr, function.main());
        //int [] arr1 = {};
        //assertArrayEquals(arr1, function.main());
    }
   // @org.junit.Test
    public void getMiddle() {
        int []numbers1 = {1,2,3};
        int low1 = 0;
        int high1 = 2;
        assertEquals(0,function.getMiddle(numbers1, low1, high1));
        int []numbers2 = {3,2,1};
        int low2 = 0;
        int high2 = 2;
        assertEquals(2,function.getMiddle(numbers2, low2, high2));
        int []numbers3 = {6,2,4,6,1,9};
        int low3 = 0;
        int high3 = 5;
        assertEquals(3,function.getMiddle(numbers3, low3, high3));
    }
}