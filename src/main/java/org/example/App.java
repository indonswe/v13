package org.example;

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
        int counter = 0;
        for (String names:array){
            System.out.printf(names);
            if (counter < array.length) System.out.printf(",");
            counter++;
        }
        System.out.println("]");
        Arrays.sort(array);
        System.out.printf("Sort String array: [");
        counter = 0;
        for (String names:array){
            System.out.printf(names);
            if (counter < array.length) System.out.printf(",");
            counter++;
        }
        System.out.println("]");



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
