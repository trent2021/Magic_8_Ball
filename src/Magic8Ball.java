import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        Scanner keyboard;
        int testing;
        String question;

        keyboard = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 100");

        testing = keyboard.nextInt();
        if((testing>=1)&(testing<=10)){
            System.out.println("It is certain.");
        }
        else if((testing>=11)&(testing<=20)){
            System.out.println("Signs point to yes.");
        }
        else if((testing>=21)&(testing<=30)){
            System.out.println("Don't count on it.");
        }
        else if((testing>31)&(testing<=40)){
            System.out.println("Without a doubt.");
        }
        else if((testing>=41)&(testing<=50)){
            System.out.println("Very doubtful.");
        }
        else if((testing>=51)&(testing<=60)){
            System.out.println("Outlook not so good.");
        }
        else if((testing>=61)&(testing<=70)){
            System.out.println("Definitely.");
        }
        else if((testing>=71)&(testing<=80)){
            System.out.println("My reply is no.");
        }
        else if((testing>=81)&(testing<=90)){
            System.out.println("Outlook good.");
        }
        else if((testing>=91)&(testing<=100)){
            System.out.println("Nope.");
        }
        else{
            System.out.println("That is not a number from 1 to 100.");
        }


    }
}
