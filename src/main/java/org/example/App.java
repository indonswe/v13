package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //1
        int array[] = new int[] {11, 23, 5};
        //for (int i:array) {
        for (int i=0;i<3;i++){
            System.out.println(array[i]);

        }

        //2
        int nr = 5;
        int index = indexOf(array, nr);
        System.out.println("Index position of number " + nr + " is " + index);




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
