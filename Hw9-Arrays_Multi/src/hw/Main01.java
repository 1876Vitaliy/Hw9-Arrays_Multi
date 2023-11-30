package hw;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        System.out.println("lottery Ticket\n");

        int[][] lotteryTicket = new int[4][];
        lotteryTicket[0] = new int[]{3, 15, 41, 65};
        lotteryTicket[1] = new int[]{20, 75, 6, 50};
        lotteryTicket[2] = new int[]{10, 45, 28, 8};
        lotteryTicket[3] = new int[]{61, 25, 1, 30};

        int count = 0;

        for (int[] ints : lotteryTicket) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter winning combination: ");
        int search = scanner.nextInt();

        for (int[] ints : lotteryTicket) {
            for (int anInt : ints) {
                if (anInt == 45 & search == 45) {
                    count++;
                }
            }
        }
        if (count > 0)
            System.out.println("\nI congratulate you!!! your winning number: " +
                    search + " has win!");
        else System.out.println("\nYour number: " +
                search + " is not a winning number! ");
    }
}