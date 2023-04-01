package org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int i;
        Scanner scan = new Scanner(System.in);
        StringBuilder Result = new StringBuilder();
        int n = scan.nextInt(); //длина массива
        int m = scan.nextInt(); //шаг
        int l = m % n; // смещение если длинна массива меньше чем шаг
        int [] Array = new int [n];
        for (i=0; i<n; i++){Array[i]=i+1;} //заполнили массив значениями, можно вообще любыми целыми
        i=0;
        do {                                 //делаем обход
            Result.append(Array[i]+" ");
            i=i+l-1;
            if (i>=n) {i=i-n;}
            if (l==0) {break;}
        } while (i!=0);
        System.out.println(Result);
    }
}