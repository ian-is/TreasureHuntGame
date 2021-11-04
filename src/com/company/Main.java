package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    private static String[][] mainBoard = new String[10][8];

    public static void main(String[] args){

        setBoard();
       printBoard();
       coin();
    }

    public static void setMainBoard(String[][] mainBoard) {

       setBoard();
        printBoard();
        coin();


    }




    public static void setBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                mainBoard[i][j] = "[ ]";

            }

        }
    }

    public static void printBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mainBoard[i][j]);
            }
            System.out.println("");
        }

    }
    public static void coin(){
        Random random = new Random();
        int NumberOfCoins = random.nextInt((15-10)+1)+10;
        System.out.println(NumberOfCoins);
        for (int i = 0; i < NumberOfCoins; i++) {
            mainBoard[random.nextInt(10)][random.nextInt(8)] = "[ " + (random.nextInt((50-10)+1)+10) + "]";

        }
    }
}