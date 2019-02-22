import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        Scanner keyboard;
        int testing;
        String question;

        keyboard = new Scanner(System.in);

        testing = keyboard.nextInt();
        if (testing>0){
            System.out.println("0-10");
        }
        else if(testing>0){
            System.out.println("11-20");
        }
        else if(testing>0){
            System.out.println("21-30");
        }
        else if(testing>0){
            System.out.println("31-40");
        }
        else if(testing>0){
            System.out.println("41-50");
        }
        else if(testing>0){
            System.out.println("51-60");
        }
        else if(testing>0){
            System.out.println("61-70");
        }
        else if(testing>0){
            System.out.println("71-80");
        }
        else if(testing>0){
            System.out.println("81-90");
        }
        else if (testing>0){
            System.out.println("91-100");
        }


    }
}
