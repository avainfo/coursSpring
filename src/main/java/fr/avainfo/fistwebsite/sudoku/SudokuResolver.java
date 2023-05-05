package fr.avainfo.fistwebsite.sudoku;

import java.util.ArrayList;
import java.util.Arrays;

public class SudokuResolver {

    public static void main(String[] args) {
        SudokuResolver sudokuResolver = new SudokuResolver();
        //System.out.println(Arrays.toString(getSquare(0, 6)));
        for(int i = 0; i < tableau.length; i++) {
            System.out.println(isOnlyOneEmpty(getLine(i)));
        }
        for(int i = 0; i < tableau.length; i += 3) {
            for(int j = 0; j < tableau.length; j += 3) {
                //System.out.println(isOnlyOneEmpty(getSquare(i, j)));
            }
        }
    }

    //x : vertical
    //y : horizontal
    public static final int[][] tableau = {
            {0, 0, 0, 0, 3, 0, 0, 6, 2},
            {0, 0, 0, 0, 7, 2, 0, 0, 1},
            {2, 0, 0, 6, 0, 0, 8, 0, 0},

            {1, 0, 9, 4, 2, 6, 3, 8, 7},
            {0, 0, 4, 0, 0, 0, 2, 0, 0},
            {5, 8, 0, 1, 0, 7, 6, 0, 4},

            {0, 0, 6, 0, 0, 1, 0, 0, 3},
            {4, 0, 0, 3, 8, 0, 0, 0, 0},
            {7, 3, 0, 0, 6, 0, 0, 0, 0}
    };

    public static int getAt(int x, int y) {
        return tableau[x][y];
    }

    private static int[] getLine(int i) {
        return tableau[i];
    }

    public static int[] getSquare(int x, int y) {
        int[][] square = new int[3][3];
        square = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        for(int i = x; i < x + 3; i++) {
            for(int j = y; j < y + 3; j++) {
                square[i - x][j - y] = tableau[i][j];
            }
        }
        System.out.println(Arrays.deepToString(square).replace("[[", "[").replace("]]", "]").replace("], ", "]\n"));
        ArrayList<Integer> simpleArray = new ArrayList<>();
        for(int[] ints : square) {
            for(int anInt : ints) {
                simpleArray.add(anInt);
            }
        }
        return simpleArray.stream().mapToInt(i -> i).toArray();
    }

    public static int getSizeOfEmpty(int[] grid) {
        int i = 0;
        for(int j : grid) {
            if(j == 0) i++;
        }
        return i;
    }

    public static boolean isOnlyOneEmpty(int[] grid) {
        int i = 0;
        int missing = 0;
        for(int j : grid) {
            if(j == 0) i++;

        }
        for(int j = 0; j < 9; j++) {
            for(int i1 : grid) {
                if(missing == j - 1)
                    missing = j;
            }

        }
        if(i == 1) {
            System.out.println(missing);
        }
        return true;
    }

}
