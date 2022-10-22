public class ex1 {
  /*  Fill an array of 15 elements with Fibonacci numbers. Output
    only the even elements of the array to the console.*/
    static int size = 15;
    static  int[] arr = new int[size];
    public static void main(String[] args) {
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+ " ");
        System.out.print(arr[1]+ " ");
        for(int i=2; i<size ;i++){
            arr[i]=arr[i-1]+arr[i-2];
        System.out.print(arr[i] + " ");}
        System.out.println();
        for (int j=0; j<size;j++)
            if (j%2==0)
                System.out.print(arr[j]+ " ");



    }
}
