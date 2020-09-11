package lesson2;

import java.util.Arrays;

public class homeWork2 {
    public static final int SIZE_ARR = 7;

    public static void main(String[] args) {
//1.
        int[] myArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 1) {
                myArr[i] = 0;
            } else {
                myArr[i] = 1;
            }

        }
        System.out.println(Arrays.toString(myArr));
//2.
        int[] myArr1 = new int[8];
        for (int i = 0; i < myArr1.length; i++) {
            myArr1[i] = i * 3;
        }
        System.out.println(Arrays.toString(myArr1));

//3.
        int[] myArr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArr2.length; i++) {
            if (myArr2[i] < 6) myArr2[i] *= 2;
        }
        System.out.println(Arrays.toString(myArr2));

//4.

        int[][] myArr3 = new int[SIZE_ARR][SIZE_ARR];
        for (int i = 0; i < myArr3.length; i++) {
            for (int j = 0; j < myArr3.length; j++) {
                if (i == j || i + j == SIZE_ARR - 1) {
                    myArr3[i][j] = 1;
                }
            }
        }
        for (int[] datum : myArr3) {
            for (int e : datum) {
                System.out.printf("%3d ", e);
            }
            System.out.println();
        }
//5.

        int[] myArr4 = {1, 23, 45, 67, 78, -19, 15};
        int maxNum = myArr4[1];
        int minNum = maxNum;
        for (int i : myArr4) {
            if (i >= maxNum) {
                maxNum = i;
            } else if (i <= minNum) {
                minNum = i;
            }
        }
        System.out.println("Максимальный элемент равен: " + maxNum);
        System.out.println("Минимальный элемент равен: " + minNum);

//6. Воспользоался тем, что при равенстве правой и левой части их сумма(sum) делится на 2 без остатка.
//   А половина(n), полученная при делении и есть правая или левая часть.
//   Затем путем переборки в следующем итере сравнил n с суммой(sum1) при сложении каждого последующего элемента
//   И усли sum1 и n равны, следовательно оставшаяся часть также будет равна n. А массив можно разделить на правую и левую равные части.

        int[] myArr5 = {1, 5, 7, 11, 2};
        checkBalance(myArr5);

//7.
        int[] myArr6 = {1, 2, 3, 4, 5, 6, 7};
        changeArray(myArr6, -2);

    }
//6.
    public static boolean checkBalance(int[] Array) {
        int sum = 0;
        int sum1 = 0;
        for (int i : Array) {
            sum = sum + i;
        }
        for (int i : Array) {
            int n = sum / 2;
            sum1 = sum1 + i;
            if (sum1 == n) {
                return true;
            }
        }
        return false;
    }

//7.

    public static void changeArray(int[] Array, int n) {
        int a;
        int b = Array.length;
        System.out.println(Arrays.toString(Array));
       if(n > 0){
           for(int j = 0; j < n; j++) {
               a = Array[b-1];
               for (int i = b-1; i > 0; i--) {
                   Array[i] = Array[i-1];
               }
               Array[0] = a;
           }
        } else{
           for(int j =0; j > n; j--){
               a = Array[0];
               for (int i = 0; i < b-1; i++) {
                   Array[i] = Array[i+1];
               }
               Array[b-1] = a;
           }
       }

        System.out.println(Arrays.toString(Array));
    }
}


