import java.util.Random;

public class ex4 {
    /*Write a program that checks whether all values of array
elements are different (they are not repeated). Output Yes if they
are different and No if there is at least one repetition. The array is
specified and initialized at the beginning of the program.*/
    static int size = 15;
    static int[] arr = new int[size];

    public static void main(String[] args) {
fillRandom();
print();
findRepeatedElements();
    }

    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(120);
    }
    static void print(){
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }
    static void findRepeatedElements() {
        int count =0;
        for (int i=0;i<size-1;i++){
            for(int j=i+1; j<size;j++)
                if (arr[i]==arr[j])
                    count++;}
        if (count==0)
            System.out.println("Yes");
        else System.out.println("No");

            }

    }

