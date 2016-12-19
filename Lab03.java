package com.company.lw03;

/**
 * Created by Администратор on 03.10.2016.
 */
public class Lab03 implements var02{

    @Override
    public double logika(double d1, double d2, double d3) {
        double mid=d1;
        if((d2 < d1 && d1 < d3) || (d3<d1 && d1<d2)) {mid = d1;}
        else if((d1 < d2 && d2 < d3) || (d3<d2 && d2<d1)) {mid = d2; }
        else if((d1< d3 && d3 < d2) || (d2<d3 && d3<d1)) {mid = d3;}
        return mid;
    }

    @Override
    public void poka(double N) {

        int K = 0;
        int sum = 1;
        while(sum < N){
            K = K + 1;
            sum=sum+K;
        }
        System.out.println("К : "+ K);
        System.out.println("Сумма : "+ sum);
    }

    @Override
    public void massivy(double[] A, int K, int L) {

        System.out.println("Наш массив :");
        for (int i = 0; i < A.length; i++) {
            System.out.printf(" %.3f ", A[i]);
        }
        System.out.println("");
        double sum = 0;
        for (int i = 0; i < A.length; i++)
        {
            if(i>=K && i<=L) {sum=sum+A[i];}
        }

        System.out.println("Сумма "+sum);
    }

    }

