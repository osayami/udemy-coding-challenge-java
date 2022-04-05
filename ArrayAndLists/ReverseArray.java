import java.util.Arrays;

/*
Write a method called reverse() with an int array as a parameter.

The method should not return any value. In other words, the method is allowed to modify the array parameter.

To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].

The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]

and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]

TIP: When swapping the elements, use a variable to temporarily hold the current element.

NOTE: The method should be defined as private static.

NOTE: Do not add a main method to the solution code.
*/
public class ReverseArray {
    private static void reverse(int[] array) {

        System.out.print("Array = " + Arrays.toString(array));

        int maxlen = array.length - 1;
        int halfLen = maxlen / 2;
        int temp;
        for (int i = 0; i < halfLen; i++) {
            temp = array[i];
            array[i] = array[maxlen - i];
            array[maxlen - i] = temp;

        }

        System.out.print("Reversed array = " + Arrays.toString(array));

    }

}
