package com.njeffery;
import java.util.Scanner;

public class RsCombatCalc {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("What is your Attack Level: ");
        int attack = userInput.nextInt();
        System.out.print("What is your Strength Level: ");
        int strength = userInput.nextInt();
        System.out.print("What is your Defense Level: ");
        int defense = userInput.nextInt();
        System.out.print("What is your Hitpoints Level: ");
        int hp = userInput.nextInt();
        System.out.print("What is your Magic Level: ");
        int magic = userInput.nextInt();
        System.out.print("What is your Ranged Level: ");
        int ranged = userInput.nextInt();
        System.out.print("What is your prayer Level: ");
        int prayer = userInput.nextInt();

        int result = attack + strength + defense + hp + magic + ranged + prayer;
        System.out.println(result);
    }
}
