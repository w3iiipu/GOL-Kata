import java.util.Random;

public class Main {
//    You start with a two dimensional grid of cells, where each cell is either alive or dead. In this version of the problem, the grid is finite, and no life can exist off the edges. When calcuating the next generation of the grid, follow these rules:
//
//            1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
//            2. Any live cell with more than three live neighbours dies, as if by overcrowding.
//            3. Any live cell with two or three live neighbours lives on to the next generation.
//            4. Any dead cell with exactly three live neighbours becomes a live cell.
//    You should write a program that can accept an arbitrary grid of cells, and will output a similar grid showing the next generation.

    public static void main(String[] args) {

gameBoard();
    }

    public static void gameBoard (){
        // initialized grid size
        int col = 4;
        int row = 4;

        // create 2d array
       boolean [][] board =  new boolean[col][row];
        // random generator for state
        Random rand = new Random();
        // populating the array with random state of 0 or 1
       for (int i = 0; i <= board.length-1; i++){
           for (int j = 0; j <= board.length-1; j++){
               board[i][j] = rand.nextBoolean();
           }
       }
        //print array with randomized state
        for (int i = 0; i <= board.length - 1; i++) {
            for (int j = 0; j <= board.length - 1; j++) {
                System.out.printf("%5B ", board[i][j]);
            }
            System.out.println();
        }
//        System.out.printf("%5b ", Arrays.deepToString(board).replace("true", "O".replace("false", "X") ));
//        System.out.println(Arrays.deepToString(board));
    }

//    Original TDD method replaced by new method for visibility
//    public static boolean neighbours(boolean status ,int input) {
//        if (status && input < 2 || status && input > 3) {
//            return false;
//        } else if (!status && input <3 || !status && input > 3) {
//            return false;
//        }
//        return true;

//    Method that checks for condition to determine state
    public static boolean neighbours(boolean state ,int neighbors) {
        if (state && neighbors < 2) {                               // Loneliness
            return false;
        } else if (state && neighbors > 3){                         // Overpopulation
            return false;
        } else if (state && neighbors == 2 || neighbors == 3){      // Survival
            return true;
        } else if (!state && neighbors == 3) {                      // Reproduction
            return true;
        } else                                                      // Death
        return false;
    }




}
