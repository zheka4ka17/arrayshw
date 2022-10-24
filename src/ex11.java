import java.util.Random;

public class ex11 {
    /*The program should output the word yes for a symmetric array
and the word no for an asymmetric array. Symmetric array is an
array, in which values of the elements from the end is equal to the
value of elements from the beginning. The array is specified and
initialized at the beginning of the program  */
    static int size = 5;
    static int[] arr = new int[size];

    public static void main(String[] args) {
fillRandom();
print();
exam();
    }

    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(2);//проверял на маленьком диапазоне , на большом тоже должно работать

    }
    static void print(){
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }
    static void exam(){
        int count=0;
        for (int i=0;i<size/2; i++){
            if (arr[i]==arr[size-i-1]){
                count++;}}
            if (count== size/2)
            System.out.println("Yes");
            else System.out.println("No");


    }
}
