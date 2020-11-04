package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //1
        int arrayInt[] = new int[] {11, 23, 5};
        for (int i=0;i<3;i++){
            System.out.println(arrayInt[i]);

        }

        //2
        int nr = 5;
        int index = indexOf(arrayInt, nr);
        System.out.println("Index position of number " + nr + " is " + index);

        //3
        String[] array = {"Paris", "London", "New York", "Stockholm"};
        System.out.printf("String array: [");
        int counter = 1;
        for (String names:array){
            System.out.printf(names);
            if (counter < array.length) System.out.printf(", ");
            counter++;
        }
        System.out.println("]");
        Arrays.sort(array);
        System.out.printf("Sort String array: [");
        counter = 1;
        for (String names:array){
            System.out.printf(names);
            if (counter < array.length) System.out.printf(", ");
            counter++;
        }
        System.out.println("]");

        //4
        int[] nrArray1={1,15,20};
        System.out.printf("Elements from first array: ");
        for (int numbers:nrArray1) {
            System.out.printf(numbers + " ");
        }
        System.out.println("");
        int[] nrArray2 =Arrays.copyOf(nrArray1,3);
        System.out.printf("Elements from second array: ");
        for (int numbers:nrArray2) {
            System.out.printf(numbers + " ");
        }
        System.out.println("");

        //5
        String[][] dArrays = new String[2][2];
        dArrays[0][0]= "France";
        dArrays[0][1]= "Paris";
        dArrays[1][0]= "Sweden";
        dArrays[1][1]= "Stockholm";
        System.out.println(dArrays[0][0] + " " + dArrays[0][1]);
        System.out.println(dArrays[1][0] + " " + dArrays[1][1]);

        //6
        int[] values = {43,5,23,17,2,14};
        float sum= (float) 0.0;
        for (int total:values){
            sum += total;
        }
        sum = sum/6;
        //DecimalFormat formatter = new DecimalFormat("#0.0");
        //formatter = sum;
        //System.out.println(formatter.format(sum));
        System.out.printf("Average is: %.1f %n", sum); //Tried a fem things but get "," instead of point

        //7
        System.out.println("");
        int[] tenInt = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("Array: ");
        for (int numbers:tenInt) {
            System.out.printf(numbers+" ");
        }
        System.out.println("");
        System.out.printf("Odd Array: ");
        for (int numbers:tenInt) {
            if (numbers%2 != 0) System.out.printf(numbers+" ");
        }
        System.out.println("");







    }

    public static int indexOf(int[] array, int nr){
        int index = 0;
        System.out.println(array.length);
        for (int i=0;i<array.length;i++) {
                if (array[i]==nr){
                    index = i;
                }else{
                    index = -1;
                }
        }


        return (index);



    }



}
