package itschool;

import java.util.Random;
import java.util.*;

public class Main
{

    public static void main(String[] args) {


        mini();
    }
    private static void mini() {

        int[] array = new int[101];

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        System.out.print("Массив array: ");


        for (int i = 0; i < array.length; i++) {

        }

        System.out.println();

        System.out.println(Arrays.toString(array));
        System.out.println();

        for(int i=0;i<5;i++)
        {
            int t=array[i];
            array[i]=array[array.length - 5+i];
            array[array.length - 5+i]=t;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        for(int i=0;i<10;i++)
        {
            int t=array[i];
            array[i]=array[array.length - 10+i];
            array[array.length - 10+i]=t;
        }
        System.out.println(Arrays.toString(array));


    }


}