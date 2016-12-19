package com.company.lw03;

/**
 * Created by Администратор on 03.10.2016.
 */
public class Primer {
    public static void main(String[] args) {
        Lab03 lab03 = new Lab03();
        double mid = lab03.logika(2.1, 2.2, 0.5);
        System.out.println(mid);

        System.out.println("================");

        lab03.poka(18.1);

        System.out.println("\n================");

        double[] A1 = new double[10];
        for(int i = 0; i < A1.length; i++){
            A1[i] = Math.random() * 10 * 1.1;
        }

        lab03.massivy(A1, 1, 3);

       /* System.out.println("4444444444");

        int[] A = new int[100];
        for(int i = 0; i < A.length; i++){
            A[i] = (int)(Math.random() * 100);
        }

        int[] B = new int[100];
        for(int i = 0; i < B.length; i++){
            B[i] = (int)(Math.random() * 100);
        }

        int i = lab03.mass2(A, B);
        System.out.println(i);

        System.out.println("//////////5555555555555555555555555555555555555555");

        double[] A2 = new double[5];
        for(int j = 0; j < A2.length; j++){
            A2[j] = Math.random() * 100;
        }

        double[] B2 = new double[5];
        for(int u = 0; u < B2.length; u++){
            B2[u] = Math.random() * 100;
        }

        lab03.matrix(A2, B2);
    */
    }
}
