import java.util.Random;

public class ex6 {
    /*Fill an array of 10 elements with random numbers from -10 to
+10. Count the number of unique values (occurring in the array
once). Output values of unique elements and indexes, under
which they are in the array, to the console.*/
    static int size = 10;
    static int[] arr = new int[size];

    public static void main(String[] args) {
        fillRandom();
        print();
        uniqueElements();


    }

    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(20) - 10;
    }

    static void print() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void uniqueElements() {
        int x= 25;// создал переменную не из диапазона значений, чтобы не выводить значения переменной
        // и его индекс если  такое значение уже было раньше
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < size ; i++) {
            for (int j = i+1; j < size-1; j++) {
                if (arr[i] == arr[j]){
                    x=arr[i];
                    count++;}}
                    if (count == 0 && arr[i]!=x) {
                        count1++;
                        System.out.printf("Value of unique elements : %d ", arr[i]);

                        System.out.printf("Index of unique elements : %d", i);
                        System.out.println();
                    }
                    count=0;
                }

            System.out.printf("Count the number of unique values %d:", count1);
            System.out.println();


        }
    }




