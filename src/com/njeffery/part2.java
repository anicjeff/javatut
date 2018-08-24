//https://www.youtube.com/watch?v=yYN8u90MKCg&list=PLE7E8B7F4856C9B19&index=2
//https://help.github.com/articles/adding-a-file-to-a-repository-using-the-command-line/
//https://help.github.com/articles/cloning-a-repository/
package com.njeffery;
//import package needed for user input called scanner you can use * to import entire packages
import java.util.Scanner;

public class part2 {
    //Creates a new scanner object named userInput this is what accepts user input
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("your fav number: ");
//if user input is an integer perform all of the code in statement
//.hasNextDouble() .hasNextFloat() .hasNextShort() etc
        //why does this work? the if statment itself is checking userinput
        //the if statment prevents crashing if the user inputs something other than int
        if (userInput.hasNextInt()) {
            //recieves user input and stores in variable we expect an interger
            //.nextFloat() .nextDouble() etc.
            int numberEntered = userInput.nextInt();
            System.out.println("you entered: " + numberEntered);
            System.out.print("enter a second number: ");
            int numberEntered2 = userInput.nextInt();
            int result = numberEntered2 + numberEntered;
            System.out.println(result);
        }
    }







}
