package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        char[] inputString = scanner.next().toCharArray();

        System.out.println("---------");
        for (char ch : inputString) {
            if (count%3 == 0) {
                System.out.print("| ");
                System.out.print(ch + " ");
            } else if (count%3 == 1) {
                System.out.print(ch + " ");
            } else if (count%3 == 2) {
                System.out.print(ch + " ");
                System.out.println("|");
            }
            count++;
        }
        System.out.println("---------");

    }
}
