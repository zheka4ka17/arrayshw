import java.util.Random;

public class ex2 {
    /*Fill an array of 30 elements with random numbers from -70
    to +50. Find the minimum element and output it to the console.
    Find the maximum element and output it to the console.*/
    static int size = 30;
    static  int[] arr = new int[size];

    public static void main(String[] args) {
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Random random = new Random();
        for (int i=0; i<size; i++) {
            arr[i] = random.nextInt(120) -70;
            if (arr[i] < min)
                min = arr[i];
            else if(arr[i]>max)
                max=arr[i];
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.printf("Minimum element : %d", min);
        System.out.println();
        System.out.printf("Maximum element : %d", max);

    }
}
