import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex10 {
    /*Fill an array of dimension n with random numbers from 0
to 33. Find the element of the array that is divided by the value
of the element on the left and the value of the element on the
right without remainder. Output values of the source array to the
console. Output the index of the found element; if it is not found,
output -1. n is specified from the keyboard.*/


    public static void main(String[] args) {
        System.out.println("Введите длину массива ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int index = 0;
        Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(33);
            System.out.println(Arrays.toString(arr));

        for (int j = 1; j < size; j++) {
            if (arr[j] % arr[j - 1] == 0 && arr[j] % arr[j+1]== 0) {
                index = j;
                System.out.println(arr[j]);
                System.out.printf("index : %d", index);
            }
        }
        if (index==0)
            System.out.println("-1");
    }



}

