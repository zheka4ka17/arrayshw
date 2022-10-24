import java.util.Random;

public class ex5 {
    /*Fill an array of 10 elements with random numbers from -10
to +10. Calculate the number of duplicate values. Output only
duplicate items and the number of repetitions to the console.*/
    static int size = 10;
    static int[] arr = new int[size];

    public static void main(String[] args) {
fillRandom();
print();
findDuplicateValues();
    }

    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(20) - 10;
    }
    static void print(){
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();}

    static void findDuplicateValues(){
        int x=20;// создал переменную не из диапазона значений, чтобы не выводить значения переменной
        // и количесвто их, повторно в случае, когда повторений больше одного.
        int count=0;
        for (int i = 0; i < size - 1; i++){
            for (int j = i + 1; j < size; j++)
                if (arr[i] == arr[j])
                    count++;
            if (count>0 && arr[i]!=x){
                    System.out.printf("Duplicate items : %d", arr[i]);
                    System.out.println();

                    System.out.printf("The number of duplicate values :%d", count);
                    System.out.println();
                    x=arr[i];
            }
            count=0;
        }


        }

    }

