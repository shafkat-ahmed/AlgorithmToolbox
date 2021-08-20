/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionalknapsack;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
import java.util.Arrays;
public class Fractionalknapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights,double [] frac) {
        double value = 0.0;
        int temp=0;
        double r = 0.0;
        Arrays.sort(frac);
        double [] frac1= new double[frac.length];
        int k=0;
        for(int i=frac.length-1;i>=0;i--)
        {
          frac1[k]=frac[i];
          k++;
        }
        for (int i=0;i<frac1.length;i++)
        {
            for(int j=0;j<frac1.length;j++)
            {
                if(values[i]==frac1[j]*weights[i] && i!=j )
                {
                    temp=weights[i];
                    weights[i]=weights[j];
                    weights[j]=temp;
                }
            }
        }
        for(int i=0;i<frac1.length;i++)
        {
            if(weights[i]<=capacity)
            {
                capacity=capacity-weights[i];
                value= value+frac1[i]*weights[i];
            }
            else
            {
                r=(double)capacity/weights[i];
                capacity=(int)-r*weights[i];
                value=(double)value+r*weights[i]*frac1[i];
            }
        }
        return value;

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        double [] frac=new double[n];
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
            frac[i]=(double)values[i]/weights[i];
        }
        System.out.printf("%.4f",getOptimalValue(capacity, values, weights,frac));
    }
} 