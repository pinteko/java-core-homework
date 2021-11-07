package ru.geekbrains.java.core.homeworks.homework4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGameHomework {

    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '.';
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static char[][] field;
    private static char dotHuman;
    private static char dotAi;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;
    private static final int winLength = 4;
    private static int oneX;
    private static int oneY;

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        while (true) {
            chooseTheDot();
            playRound();
            System.out.printf("SCORE:  HUMAN     AI\n" +
                    "          %d       %d\n", scoreHuman, scoreAi);
            System.out.print("Wanna play again? Y or N >>> ");
            if (!scanner.next().toLowerCase().equals("y")) {
                System.out.println("Good bye!");
                break;
            }
        }
    }

    private static void playRound() {
        System.out.printf("ROUND %d START\n", ++roundCounter);
        initField(5, 5);
        printField();
        if (dotHuman == DOT_X) {
            humanFirstTurn();
        } else {
            aiFirstTurn();
        }
    }

    private static void aiFirstTurn() {
        while (true) {
            aiTurn();
            printField();
            if (checkGame(dotAi)) break;
            humanTurn();
            printField();
            if (checkGame(dotHuman)) break;
        }
    }

    private static void humanFirstTurn() {
        while (true) {
            humanTurn();
            printField();
            if (checkGame(dotHuman)) break;
            aiTurn();
            printField();
            if (checkGame(dotAi)) break;
        }
    }


    private static void chooseTheDot() {
        System.out.print("If you want to play with 'X' then enter 'X' otherwise enter anything >>> ");
        if (scanner.next().toLowerCase().equals("x")) {
            dotHuman = DOT_X;
            dotAi = DOT_O;
        } else {
            dotHuman = DOT_O;
            dotAi = DOT_X;
        }
    }

    private static boolean checkGame(char dot) {
        if (checkWinUpper(dot, winLength)) {
            if (dot == dotHuman) {
                System.out.println("Human win!!!");
                scoreHuman++;
            } else {
                System.out.println("AI win!!!");
                scoreAi++;
            }
            return true;
        }
        if (checkDraw()) return true;
        return false;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            if (findDot(dotAi)) {
                x = oneX;
                y = oneY;
            }
            else if (findDotReverse(dotAi)) {
                x = oneX;
                y = oneY;
            }
            else if (findDot(dotHuman)) {
                x = oneX;
                y = oneY;
            }
            else if (findDotReverse(dotHuman)) {
                x = oneX;
                y = oneY;
            }
            else if (findDotReverseTwo(dotHuman)) {
                x = oneX;
                y = oneY;
            }
            else if (findDotTwo(dotHuman)) {
                x = oneX;
                y = oneY;
            }

            else if (findDotTwo(dotAi)) {
                x = oneX;
                y = oneY;
            }
            else if (findDotReverseTwo(dotAi)) {
                x = oneX;
                y = oneY;
            }
            else {

               x = random.nextInt(fieldSizeX);
               y = random.nextInt(fieldSizeY);
               }

            } while (!isCellEmpty(y, x));
               field[y][x] = dotAi;

    }

    private static void humanTurn() {
        int x;
        int y;

        do {
            System.out.print("Please enter coordinates of your turn x and y split by whitespace >>> ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));
        field[y][x] = dotHuman;
    }

  /*  private static boolean checkWin(char dot) {
        //hor
        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
        //ver
        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
        //diagonal
        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;
        return false;
    } */

    private static boolean checkWinUpper(char dot, int winSize) {
        int scoreDotOne;
        int scoreDotTwo;
        int scoreDotThree;
        int scoreDotFour;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                scoreDotOne = 0;
                scoreDotTwo = 0;
                scoreDotThree = 0;
                scoreDotFour = 0;
                for (int y = 0; y < field.length; y++) {
                    if (field[y][j] == dot) {
                        scoreDotOne++;
                        if (scoreDotOne == winSize) {
                            return true;
                        }
                    }
                    else {
                        scoreDotOne = 0;
                    }
                }
                for (int x = 0; x < field[j].length; x++) {
                    if (field[j][x] == dot) {
                        scoreDotTwo++;
                        if (scoreDotTwo == winSize) {
                            return true;
                        }
                    }
                    else {
                        scoreDotTwo = 0;
                    }
                }
                for (int h = 0; h < field.length; h++) {
                    if (j + h < field[i].length && i + h < field.length) {
                        if (field[i + h][j + h] == dot) {
                            scoreDotThree++;
                            if (scoreDotThree == winSize) {
                                return true;
                            }
                        } else {
                            scoreDotThree = 0;
                        }
                    }
                }
                for (int z = 0; z < field.length; z++) {
                    if ((i - z >= 0) && j + z < field[i].length) {
                        if (field[i - z][j + z] == dot) {
                            scoreDotFour++;
                            if (scoreDotFour == winSize) {
                                return true;
                            }
                        } else {
                            scoreDotFour = 0;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("It's DRAW!!!");
        return true;
    }

    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static void initField(int sizeX, int sizeY) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    private static boolean findDot(char dot) {
        int scoreDotOne;
        int scoreDotTwo;
        int scoreDotThree;
        int scoreDotFour;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                scoreDotOne = 0;
                scoreDotTwo = 0;
                scoreDotThree = 0;
                scoreDotFour = 0;
                oneX = 0;
                oneY = 0;
                for (int y = 0; y < field.length - 1; y++) {

                    if (field[y][j] == dot) {
                        scoreDotOne++;
                        if (scoreDotOne == 3 && field[y + 1][j] == DOT_EMPTY) {
                            oneX = j;
                            oneY = y + 1;
                            return true;
                        }
                    }
                    else {
                        scoreDotOne = 0;
                    }
                }
                for (int x = 0; x < field[j].length - 1; x++) {

                    if (field[j][x] == dot) {
                        scoreDotTwo++;
                        if (scoreDotTwo == 3 && field[j][x + 1] == DOT_EMPTY) {
                           oneX = x + 1;
                           oneY = j;
                           return true;
                        }
                    }
                    else {
                        scoreDotTwo = 0;
                    }
                }
                for (int h = 0; h < field.length - 1; h++) {
                    if (j + h + 1 < field[i].length && i + h + 1 < field.length) {
                        if (field[i + h][j + h] == dot) {
                            scoreDotThree++;
                            if (scoreDotThree == 3 && field[i + h + 1][j + h + 1] == DOT_EMPTY) {
                                oneY = i + h + 1;
                                oneX = j + h + 1;
                                return true;
                            }
                        } else {
                            scoreDotThree = 0;
                        }
                    }
                }
                for (int z = 0; z < field.length - 1; z++) {
                    if ((i - z - 1 >= 0) && (i - z - 1) < field.length && j + z + 1 < field[i].length) {
                        if (field[i - z][j + z] == dot) {
                            scoreDotFour++;
                            if (scoreDotFour == 3 && field[i - z - 1][j + z + 1] == DOT_EMPTY) {
                                oneY = i - z - 1;
                                oneX = j + z + 1;
                                return true;
                            }
                        } else {
                            scoreDotFour = 0;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean findDotTwo(char dot) {
        int scoreDotOne;
        int scoreDotTwo;
        int scoreDotThree;
        int scoreDotFour;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                scoreDotOne = 0;
                scoreDotTwo = 0;
                scoreDotThree = 0;
                scoreDotFour = 0;
                oneX = 0;
                oneY = 0;
                for (int y = 0; y < field.length - 1; y++) {

                    if (field[y][j] == dot) {
                        scoreDotOne++;
                        if (scoreDotOne == 2 && field[y + 1][j] == DOT_EMPTY) {
                            oneX = j;
                            oneY = y + 1;
                            return true;
                        }
                    }
                    else {
                        scoreDotOne = 0;
                    }
                }
                for (int x = 0; x < field[j].length - 1; x++) {

                    if (field[j][x] == dot) {
                        scoreDotTwo++;
                        if (scoreDotTwo == 2 && field[j][x + 1] == DOT_EMPTY) {
                            oneX = x + 1;
                            oneY = j;
                            return true;
                        }
                    }
                    else {
                        scoreDotTwo = 0;
                    }
                }
                for (int h = 0; h < field.length - 1; h++) {
                    if (j + h + 1 < field[i].length && i + h + 1 < field.length) {
                        if (field[i + h][j + h] == dot) {
                            scoreDotThree++;
                            if (scoreDotThree == 2 && field[i + h + 1][j + h + 1] == DOT_EMPTY) {
                                oneY = i + h + 1;
                                oneX = j + h + 1;
                                return true;
                            }
                        } else {
                            scoreDotThree = 0;
                        }
                    }
                }
                for (int z = 0; z < field.length - 1; z++) {
                    if ((i - z - 1 >= 0) && (i - z - 1) < field.length && j + z + 1 < field[i].length) {
                        if (field[i - z][j + z] == dot) {
                            scoreDotFour++;
                            if (scoreDotFour == 2 && field[i - z - 1][j + z + 1] == DOT_EMPTY) {
                                oneY = i - z - 1;
                                oneX = j + z + 1;
                                return true;
                            }
                        } else {
                            scoreDotFour = 0;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean findDotReverse(char dot) {
        int scoreDotOne;
        int scoreDotTwo;
        int scoreDotThree;
        int scoreDotFour;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                scoreDotOne = 0;
                scoreDotTwo = 0;
                scoreDotThree = 0;
                scoreDotFour = 0;
                oneX = 0;
                oneY = 0;
                for (int y = 0; y < field.length - 1; y++) {
                    if (i - y - 1 >= 0) {
                        if (field[i - y][j] == dot) {
                            scoreDotOne++;
                            if (scoreDotOne == 3 && field[i - y - 1][j] == DOT_EMPTY) {
                                oneX = j;
                                oneY = i - y - 1;
                                return true;
                            }
                        } else {
                            scoreDotOne = 0;
                        }
                    }
                }
                for (int x = 0; x < field[j].length - 1; x++) {
                    if (j - x - 1 >= 0) {
                        if (field[i][j - x] == dot) {
                            scoreDotTwo++;
                            if (scoreDotTwo == 3 && field[j][j - x - 1] == DOT_EMPTY) {
                                oneX = j - x - 1;
                                oneY = i;
                                return true;
                            }
                        } else {
                            scoreDotTwo = 0;
                        }
                    }
                }
                for (int h = 0; h < field.length - 1; h++) {
                    if (i - h - 1 >= 0 && j - h - 1 >= 0) {
                        if (field[i - h][j - h] == dot) {
                            scoreDotThree++;
                            if (scoreDotThree == 3 && field[i - h - 1][j - h - 1] == DOT_EMPTY) {
                                oneY = i - h - 1;
                                oneX = j - h - 1;
                                return true;
                            }
                        } else {
                            scoreDotThree = 0;
                        }
                    }
                }
                for (int z = 0; z < field.length - 1; z++) {
                    if (j - z - 1 >= 0  && i + z + 1 < field.length) {
                        if (field[i + z][j - z] == dot) {
                            scoreDotFour++;
                            if (scoreDotFour == 3 && field[i + z + 1][j - z - 1] == DOT_EMPTY) {
                                oneY = i + z + 1;
                                oneX = j - z - 1;
                                return true;
                            }
                        } else {
                            scoreDotFour = 0;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean findDotReverseTwo(char dot) {
        int scoreDotOne;
        int scoreDotTwo;
        int scoreDotThree;
        int scoreDotFour;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                scoreDotOne = 0;
                scoreDotTwo = 0;
                scoreDotThree = 0;
                scoreDotFour = 0;
                oneX = 0;
                oneY = 0;
                for (int y = 0; y < field.length - 1; y++) {
                    if (i - y - 1 >= 0) {
                        if (field[i - y][j] == dot) {
                            scoreDotOne++;
                            if (scoreDotOne == 2 && field[i - y - 1][j] == DOT_EMPTY) {
                                oneX = j;
                                oneY = i - y - 1;
                                return true;
                            }
                        } else {
                            scoreDotOne = 0;
                        }
                    }
                }
                for (int x = 0; x < field[j].length - 1; x++) {
                    if (j - x - 1 >= 0) {
                        if (field[i][j - x] == dot) {
                            scoreDotTwo++;
                            if (scoreDotTwo == 2 && field[j][j - x - 1] == DOT_EMPTY) {
                                oneX = j - x - 1;
                                oneY = i;
                                return true;
                            }
                        } else {
                            scoreDotTwo = 0;
                        }
                    }
                }
                for (int h = 0; h < field.length - 1; h++) {
                    if (i - h - 1 >= 0 && j - h - 1 >= 0) {
                        if (field[i - h][j - h] == dot) {
                            scoreDotThree++;
                            if (scoreDotThree == 2 && field[i - h - 1][j - h - 1] == DOT_EMPTY) {
                                oneY = i - h - 1;
                                oneX = j - h - 1;
                                return true;
                            }
                        } else {
                            scoreDotThree = 0;
                        }
                    }
                }
                for (int z = 0; z < field.length - 1; z++) {
                    if (j - z - 1 >= 0  && i + z + 1 < field.length) {
                        if (field[i + z][j - z] == dot) {
                            scoreDotFour++;
                            if (scoreDotFour == 2 && field[i + z + 1][j - z - 1] == DOT_EMPTY) {
                                oneY = i + z + 1;
                                oneX = j - z - 1;
                                return true;
                            }
                        } else {
                            scoreDotFour = 0;
                        }
                    }
                }
            }
        }
        return false;
    }


}
