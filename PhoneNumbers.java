package q1;

import java.util.Random;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Thomas Carlton.
 * @version 1.0
 */
public class PhoneNumbers {
    
    /**
     * <p>Max values of the random number for each digit. </p>
     * of the 10 digit phone number.
     * @param args command line arguments.
     */
    /**
     * <p>Max values for the first digit. </p>
     * of the phone number.
     */
    private static final int N1 = 7;
    /**
     * <p>Max values for the fourth digit. </p>
     * of the phone number.
     */
    private static final int N4 = 6;
    /**
     * <p>Max values for the fifth digit. </p>
     * of the phone number.
     */
    private static final int N5 = 3;
    /**
     * <p>Max values for the sixth digit. </p>
     * of the phone number.
     */
    private static final int N6 = 5;
    /**
     * <p>Max values for the ninth digit. </p>
     * of the phone number.
     */
    private static final int N9 = 9;



    /**
     * <p>Generates the random numbers and prints out in the correct.</p>
     * phone number format.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
    
        Random generator = new Random();
    
    
        
        int n1 = generator.nextInt(N1) + 1;
        int n2 = generator.nextInt(N1) + 1;
        int n3 = generator.nextInt(N1) + 1;
        int n4 = generator.nextInt(N4) + 1;
        int n5 = generator.nextInt(N5) + 1;
        int n6 = generator.nextInt(N6) + 1;
        int n7 = generator.nextInt(N9) + 1;
        int n8 = generator.nextInt(N9) + 1;
        int n9 = generator.nextInt(N9) + 1;
        int n10 = generator.nextInt(N9) + 1;
    
        
        System.out.println(n1 + "" + n2 + "" + n3 + "-" 
                + n4 + "" + n5 + "" + n6 
                + "-" + n7 + "" + n8 + "" + n9 + "" + n10);

    }
}
