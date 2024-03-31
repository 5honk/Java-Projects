// Since this is my first time using Java, I will doccument everything and problems I face

public class LearningJava {     // Needs to be the file name
    public static void main (String[] args) {
        System.out.println (" Hello World!");   // Printing out text
        System.out.println (3142024);           // Printing Numbers

    // Variables (similar to C variables :D! )
        String varString = "Ilovefood";
        int varInt = 1;
        float varFloat = 3.14f; // Needs f at the end 
        boolean tOf = false;
        byte varByte = 100; // can only be within -128 and 127?!

        System.out.println(varFloat);   // Unlike in C, we dont need %

    // Primitive Data = created by Java. Non-Primitive Data = Created by the user

    // Arithmatic Operators is the same 

    // Maths (The variable names are self explanitory, so no commentation)
        Math.max(5,10);
        Math.min(11,2);
        Math.sqrt(9);
        Math.abs(-22);  // Gives the positive version = 22
        Math.random();
    
    // If conditions (Same as C as well as condtions)
        if (5 < 10) { 
            System.out.println ("I kinda want a McFlurry");
        } else {
            System.out.println ("There is ice cream at home");
        }

    // While loop (Same as C)
        int i = 0;

        while (i < 10) {
            System.out.println("Chocolate");
            i++;
        }

    // For loop (Same as C) + break and continue
        for (i = 0; i < 5; i++) {
            System.out.println("Bagel");
        }

    // Arrays (the square brackets have to be after the variable not after the name)
        int[] Array = {1,2,3};
        System.out.println(Array[1]);

        for (i = 0; i < 3; i++) {
            System.out.println(Array[i]);
        }

    // 2D Array
        int[][] FancyArray = {{22,33,44},{66,77,88}};
        System.out.println(FancyArray[1][2]);   // Takes the right array as [1][0]        

    // Calling Method
        methodeg ();
    }
    
    // Method/function
    static void methodeg () {
        System.out.println("this works if called!");    // it worked without being at the top??? does that mean java is not top down processing
    }
}