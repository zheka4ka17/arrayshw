import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex9 {
    /*Fill an array of dimension n with random numbers from -2
to n. If there is at least one negative value in the array that is less
than -1, replace all negative values in the array by the square (by
the power of 2) of these values. Output the source and resultant
array to the console.*/
    public static void main(String[] args) {
        System.out.println("Введите размер массива n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n + 2) - 2;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int j = 0; j < n; j++) {
            if (arr[j] < -1) {
                for (int k = 0; k < n; k++)
                    if (arr[k]<0)
                    arr[k] = arr[k] * arr[k];
                break;
            }  }

                System.out.print(Arrays.toString(arr));




        }
    }


