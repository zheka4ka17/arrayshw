import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex7 {
    /*Fill an array of dimension n with random numbers from 3
to 13. Calculate how many times each digit occurs. Output the
result to the screen. n is specified from the keyboard.*/
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int sum0 = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0, sum8 = 0, sum9 = 0;
        { Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(10) + 3;}
        System.out.println(Arrays.toString(arr));

            for (int j = 0; j < size; j++) {
                String s = Integer.toString(arr[j]);
                int c = s.length();

                for (int k = 0; k < c; k++) {
                    char c1 = s.charAt(k);
                    switch (c1) {
                        case ('0'):
                            sum0++;break;
                        case ('1'):
                            sum1++;break;
                        case ('2'):
                            sum2++;break;
                        case ('3'):
                            sum3++;break;
                        case ('4'):
                            sum4++;break;
                        case ('5'):
                            sum5++;break;
                        case ('6'):
                            sum6++;break;
                        case ('7'):
                            sum7++;break;
                        case ('8'):
                            sum8++;break;
                        case ('9'):
                            sum9++; break;

                    }


                }

            }

        System.out.println("Колличество нулей :"+ sum0);
        System.out.println("Колличество единиц :"+ sum1);
        System.out.println("Колличество двоек :"+ sum2);
        System.out.println("Колличество троек :"+ sum3);
        System.out.println("Колличество четверок :"+ sum4);
        System.out.println("Колличество пятерок :"+ sum5);
        System.out.println("Колличество шестерок :"+ sum6);
        System.out.println("Колличество семерок :"+ sum7);
        System.out.println("Колличество восьмерок :"+ sum8);
        System.out.println("Колличество девяток :"+ sum9);
    }}