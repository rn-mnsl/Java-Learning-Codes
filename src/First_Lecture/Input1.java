package First_Lecture;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        String strName; 

        /*
            to resolve a behavior 
         */
        Scanner objStrInput = new Scanner(System.in);
        Scanner objNumInput = new Scanner(System.in);

        System.out.print("How old are you? ");
        int intAge = objNumInput.nextInt();

        System.out.println("What's your name? ");
        strName = objStrInput.nextLine();

        System.out.println("Hello " + strName + ", " + "You're still very young at " + intAge + "...");
    }
}

/*
   In the Scanner Class we can have different types of Inputs Methods:  

    next()       - accepts a word only  
    nextline()   - including spaces 
    nextInt()    - accepts integer input 
    nextFloat()  - accepts float input 
    nextDouble() - accepts double input 
    ...
 
 */

//we can utilize import java.util.Scanner