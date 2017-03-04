import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test
    public void neighbours() throws Exception {

    }

    @Test
    public void test1() {  // Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
        boolean expected = false;
        boolean actual = Main.neighbours(true, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() { // Any live cell with two or three live neighbours lives on to the next generation.
        boolean expected = true;
        boolean actual = Main.neighbours(true, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() { // Any live cell with two or three live neighbours lives on to the next generation.
        boolean expected = true;
        boolean actual = Main.neighbours(true, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() { // Any live cell with more than three live neighbours dies, as if by overcrowding.
        boolean expected = false;
        boolean actual = Main.neighbours(true, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() { // Any dead cell with ONE live neighbours is still dead cell.
        boolean expected = false;
        boolean actual = Main.neighbours(false, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void test6() { // Any dead cell with TWO live neighbours is still dead cell.
        boolean expected = false;
        boolean actual = Main.neighbours(false, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test7() { // Any dead cell with EXACTLY THREE live neighbours becomes a live cell.
        boolean expected = true;
        boolean actual = Main.neighbours(false, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void test8() { // Any dead cell with FOUR live neighbours is still dead cell.
        boolean expected = false;
        boolean actual = Main.neighbours(false, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void test9() { // Any dead cell with FOUR live neighbours is still dead cell.
        boolean expected = false;
        boolean actual = Main.neighbours(false, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void test10() { // Any dead cell with FOUR live neighbours is still dead cell.
        boolean expected = false;
        boolean actual = Main.neighbours(false, 8);
        assertEquals(expected, actual);
    }

}