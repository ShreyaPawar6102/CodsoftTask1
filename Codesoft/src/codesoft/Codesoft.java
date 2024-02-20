/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesoft;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nikhi
 */
public class Codesoft {
    
    
     private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      


  

     {
        Random random = new Random();
        int totalScore = 0;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds: 3");
        System.out.println("Attempts To Guess Number In Each Round: 10\n");

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 1; i <= MAX_ROUNDS; i++) {
                int number = random.nextInt(MAX_RANGE) + MIN_RANGE;
                int attempts = 0;

                System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, MIN_RANGE, MAX_RANGE,
                        MAX_ATTEMPTS);

                while (attempts < MAX_ATTEMPTS) {
                    System.out.println("Enter your guess: ");
                    int guessNumber = scanner.nextInt();
                    attempts++;

                    if (guessNumber == number) {
                        int score = MAX_ATTEMPTS - attempts;
                        totalScore += score;
                        System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                                attempts, score);
                        break;
                    } else if (guessNumber < number) {
                        System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guessNumber,
                                MAX_ATTEMPTS - attempts);
                    } else if (guessNumber > number) {
                        System.out.printf("The number is less than %d. Attempts Left = %d.\n", guessNumber,
                                MAX_ATTEMPTS - attempts);
                    }
                }

                if (attempts == MAX_ATTEMPTS) {
                    System.out.printf("\nRound = %d\n", i);
                    System.out.println("Attempts = 0");
                    System.out.printf("The Random Number Is: %d\n\n", number);
                }
            }

            System.out.printf("Game Over. Total Score = %d\n", totalScore);
        }
    }
}
    }
    

