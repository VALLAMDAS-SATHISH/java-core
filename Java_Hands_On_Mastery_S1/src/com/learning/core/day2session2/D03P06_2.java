package com.learning.core.day2session2;

import java.util.Scanner;

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

class CricketRating {
    String playerName;
    float critic1, critic2, critic3, avgRating;
    String coins;

    CricketRating(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        calculateAverageRating(critic1, critic2);
        calculateCoins();
    }

    CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        calculateCoins();
    }

    void calculateAverageRating(float critic1, float critic2) {
        avgRating = (critic1 + critic2) / 2;
    }

    void calculateAverageRating(float critic1, float critic2, float critic3) {
        avgRating = (critic1 + critic2 + critic3) / 3;
    }

    String calculateCoins() {
        if (avgRating >= 7) {
            coins = "Gold";
        } else if (avgRating >= 5) {
            coins = "Silver";
        } else if (avgRating >= 2) {
            coins = "Copper";
        } else {
            coins = "NotEligible";
        }
        return coins;
    }

    void display() {
        System.out.println(playerName + " " + avgRating + " " + coins);
    }
}

public class D03P06_2 {
    public static void main(String[] args) throws NotEligibleException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter player name:");
        String playerName = scanner.next();
        
        System.out.println("Enter ratings (up to three, separated by space):");
        float critic1 = scanner.nextFloat();
        float critic2 = scanner.nextFloat();
        
        System.out.println("Enter the third rating (if available) or 0 if not:");
        float critic3 = scanner.nextFloat();

        if (critic3 > 0) {
		    CricketRating player = new CricketRating(playerName, critic1, critic2, critic3);
		    player.display();
		} else {
		    CricketRating player = new CricketRating(playerName, critic1, critic2);
		    player.display();
		}

        scanner.close();
    }
}