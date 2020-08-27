package Stuffs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // The array has static size
        String[] array = new String[4];
        array[0] = "firstElement";
        array[1] = "secondElement";
        array[2] = "thirdElement";
        array[3] = "fourthElement";
        System.out.println(Arrays.toString(array));

        //The ArrayList has dinamic size
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("firstElement");
        arrayList.add("secondElement");
        arrayList.add("thirdElement");
        arrayList.add("fourthElement");
        for (String item : arrayList)
            System.out.println(item);

        //The Arraylist can't store primitives, but the array can.
        //-->ArrayList<int> intArray = new ArrayList<int>();
        int[] intArray = {1,2,3};

        //Size:
        System.out.println("Size of Array: " + array.length);
        System.out.println("Size of ArrayList: " + arrayList.size());

        System.out.println("The fourthElement index is: " + arrayList.indexOf("fourthElement"));
    }
}
