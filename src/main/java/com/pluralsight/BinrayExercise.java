package com.pluralsight;

public class BinrayExercise {
    static int k = 5;

    public static void main(String[] args) {
//        System.out.println("Decimal to Binary");
//        System.out.printf("1. (10) 15  ->  (2) 1 1 1 1\n");
//        System.out.printf("2. (10) 32  ->  (2) 1 0 0 0 0 0\n");
//        System.out.printf("3. (10) 117 ->  (2) 1    1    1    0   1   0   1\n");
//        System.out.printf("                    64 + 32 + 16 + 0 + 4 + 0 + 1\n\n");
//        System.out.printf("4. (10) 946 ->  (2) 11 1011 0010\n");
//        System.out.println("                     2^9 -- 2^0");
//
//        System.out.println("~~~");
//        System.out.println("Binary to Decimal");
//        System.out.printf("1. (2) 0000 0100 -> (10) 4\n");
//        System.out.printf("2. (2) 0000 1101 -> (10) 14\n");
//        System.out.printf("3. (2) 0011 0101 -> (10) 53\n\n");
//        System.out.printf("4. (2) 01010101 10101010 -> (10) 21930\n");
//        System.out.printf("2^14 + 2^12 + 2^10 + 2^8 + 2^7 + 2^5 + 2^3 + 2^1\n");
//        System.out.print("16384 + 4096 + 1024 + 256 + 128 +  32 +  8  + 2 ");

        // Afternoon Session
        int i = 0; // variable DECLARATION
        i = 1;    // variable ASSIGNMENT
        System.out.println(i);
        int j = 5; // variable DECLARATION AND ASSIGNMENT
        j = 2;

        System.out.println(j);

        double d;
        d = 3.14;
        d = d + 1;
        System.out.println(d);

        System.out.println(k);
        addOne(33);

        // all primitives start with lower case: double
        // non-primitives start with upper case: String

    }

    public static void addOne(int i) {
//        int i = 22;
        i = i + 1;
        System.out.println("here's i + 1: " + i);

        /*
        * 1. long vehicleId
        * 2. String vehicleMake
        * 3. String vehicleColor
        * 4. bool hasTow
        * 5. double odometer
        * 6. double price
        * 7. char ratingQuality
        * 8. int phoneNumber (String? e.g. +67 (888)-6767)
        * 9. String socialSecurityNo
        * 10.String zip
        * */

    }
}
