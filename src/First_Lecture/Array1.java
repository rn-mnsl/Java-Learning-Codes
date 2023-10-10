package First_Lecture;

/*
    There are two types of array 

    Simple Array - One dimensional array 
    Multi-dimensional array - 2D, 3D ... 

 */

public class Array1 {
    public static void main(String[] args) { 

        int [] objEven = {2, 4, 6, 8, 10, 12};

        int[] objOdd = new int[8];

        objOdd[0] = 1; 
        objOdd[1] = 3; 
        objOdd[2] = 5; 
        objOdd[3] = 7; 
        objOdd[4] = 9; 
        objOdd[5] = 11; 
        objOdd[6] = 13;
        objOdd[7] = 15; 

        System.out.print("Displaying the even numbers: ");
        for (int intIndex = 0; intIndex < 6; intIndex++) { 
            
            System.out.print(objEven[intIndex] + " "); 

        } // we used hard coding 

        System.out.print("\n\n Displaying the odd numbers: ");
        for (int intIndex = 0; intIndex < objOdd.length; intIndex++) {
            System.out.print(objOdd[intIndex] + " ");

        } //we used parameterized 

        System.out.println("\n \nAnother way of displaying an array... "); 

        for (float flt) //hindi ko na natuloy 
        
    }
}
