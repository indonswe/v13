package org.example;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //1
        int arrayInt[] = new int[]{11, 23, 5};
        for (int i = 0; i < 3; i++) {
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
        for (String names : array) {
            System.out.printf(names);
            if (counter < array.length) System.out.printf(", ");
            counter++;
        }
        System.out.println("]");
        Arrays.sort(array);
        System.out.printf("Sort String array: [");
        counter = 1;
        for (String names : array) {
            System.out.printf(names);
            if (counter < array.length) System.out.printf(", ");
            counter++;
        }
        System.out.println("]");

        //4
        int[] nrArray1 = {1, 15, 20};
        System.out.printf("Elements from first array: ");
        for (int numbers : nrArray1) {
            System.out.printf(numbers + " ");
        }
        System.out.println("");
        int[] nrArray2 = Arrays.copyOf(nrArray1, 3);
        System.out.printf("Elements from second array: ");
        for (int numbers : nrArray2) {
            System.out.printf(numbers + " ");
        }
        System.out.println("");

        //5
        String[][] dArrays = new String[2][2];
        dArrays[0][0] = "France";
        dArrays[0][1] = "Paris";
        dArrays[1][0] = "Sweden";
        dArrays[1][1] = "Stockholm";
        System.out.println(dArrays[0][0] + " " + dArrays[0][1]);
        System.out.println(dArrays[1][0] + " " + dArrays[1][1]);

        //6
        int[] values = {43, 5, 23, 17, 2, 14};
        float sum = (float) 0.0;
        for (int total : values) {
            sum += total;
        }
        sum = sum / 6;
        //DecimalFormat formatter = new DecimalFormat("#0.0");
        //formatter = sum;
        //System.out.println(formatter.format(sum));
        System.out.printf("Average is: %.1f %n", sum); //Tried a fem things but get "," instead of point

        //7
        System.out.println("");
        int[] tenInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("Array: ");
        for (int numbers : tenInt) {
            System.out.printf(numbers + " ");
        }
        System.out.println("");
        System.out.printf("Odd Array: ");
        for (int numbers : tenInt) {
            if (numbers % 2 != 0) System.out.printf(numbers + " ");
        }
        System.out.println("");

        //8
        String duplicateArrays[] = {"20", "20", "40", "20", "30", "40", "50", "60", "50"};
        System.out.printf("Array: ");
        boolean isDeleted = false;
        for (int duoNumbers = 0; duoNumbers < duplicateArrays.length; duoNumbers++) {
            System.out.printf(duplicateArrays[duoNumbers] + " ");
        }
        System.out.println("");
        System.out.printf("Array without duplicate values: ");


        Arrays.sort(duplicateArrays);
        //for (int numbers:duplicateArrays) {

        String[] newArray = new String[duplicateArrays.length - 1];

        //for (int i = 0, j = 1 ; i < duplicateArrays.length; i++, j++){
        for (int i = 0; i < duplicateArrays.length; i++) {
            //int indexOrg = duplicateArrays[numbers];
            for (int j = i + 1; j < duplicateArrays.length; j++)
                //if (j >duplicateArrays.length) break;
                if (duplicateArrays[i].equals(duplicateArrays[j])) {
                    isDeleted = true;
                    break;
                    //newArray[j] ="1";
                } else {
                    newArray[i] = duplicateArrays[i];
                }

        }
        for (int duoNumbers = 0; duoNumbers < newArray.length; duoNumbers++) {
            System.out.printf(newArray[duoNumbers] + " ");
        }
        System.out.println("");

        //9
        int[] addArrayField = new int[]{1,2,3,4,5,6,7};
        addArrayField = add(addArrayField);
        System.out.println("");
        for (int duoNumbers = 0; duoNumbers < addArrayField.length; duoNumbers++) {
            System.out.printf(addArrayField[duoNumbers] + " ");
        }
        System.out.println("");

        //10
        int counterMulti =0;
        int[][] multi = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        //int[][] multiPrint = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        int[][] multiPrint = new int [10][10];
        for (int i=0;i < 10;i++){

            multiPrint [counterMulti][i] = (multi[counterMulti][counterMulti]*multi[counterMulti][i]);
            if (i==9) {
                if (counterMulti == 1) break;
                counterMulti = 1;
                i = 0;
            }
        }
        for (int i=0;i < 10;i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(multiPrint[i][j] + " ");
                if (i==9||j==9) System.out.println("");
            }
        }
        System.out.println("");

        //11
        String tal1="";
        int rounds=0;
        String[] value = new String[999];
        String[] valueCopy = new String[999];
        do {
            System.out.println("Give me the number 5: ");
            Scanner scNr1 = new Scanner(System.in);
            tal1 = scNr1.nextLine(); // holds actual input
            value[rounds]= tal1;
        } while ((tal1)!=("5"));
        for (int i=0,j=value.length;i<value.length;i++,j--) {
            valueCopy[i] = value[j];
            System.out.println(valueCopy);
        }




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
    public static int[] add(int[]addArray){
        int length = addArray.length;
        int[] newArray = new int[length+1];
        for (int duoNumbers = 0; duoNumbers < addArray.length; duoNumbers++) {
            newArray[duoNumbers] = addArray[duoNumbers];
            System.out.printf(addArray[duoNumbers] + " ");
        }
        //newArray[length+1]= ""
        System.out.printf("");
        return newArray;
    }


}
