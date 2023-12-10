import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // we have two methods to declare an array

        // first method
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 6;
        numbers1[2] = 5;
        System.out.println(Arrays.toString(numbers1));

        // Second Method and Best Practice
        int[] numbers2 = {3,1,5,2};
        System.out.println(Arrays.toString(numbers2));

        // Checking The Length of an Array
        System.out.println(numbers2.length); // 4

        // Sorting an Array
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2)); // [1, 2, 3, 5]

        // 2 Dimesional Arrays
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        // We Can Print Our 2D Array Like: 
        System.out.println(Arrays.toString(arr[0])); // {1,2,3}
        System.out.println(Arrays.toString(arr[1])); // {4,5,6}
        System.out.println(Arrays.toString(arr[2])); // {7,8,9}

        // Or We Can Just Use deepToString() method
        System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        
    }
}
