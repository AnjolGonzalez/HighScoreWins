package com.pluralsight;
import java.util.Scanner;
public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game score: ");
        String score = scanner.nextLine();

        String[] scoreSplit = score.split("\\:");

        String team1 = scoreSplit[0];
        int team2Score = Integer.parseInt(scoreSplit[2]);

        String[] scoreSplit2 = scoreSplit[1].split("\\|");

        String team2 = scoreSplit2[0];
        int team1Score = Integer.parseInt(scoreSplit2[1]);

        System.out.print("Winner: ");

        if (team1Score > team2Score){
            System.out.print(team1);
        }else{
            System.out.print(team2);
        }


    }
}
