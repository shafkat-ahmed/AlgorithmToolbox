/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zero_one_knapsack;

/**
 *
 * @author Acer
 */
import java.util.*;
import java.util.Arrays;
public class Zero_one_knapsack {
    static int optimalWeight(int W, int[] w) {
        //write you code here
        int n=w.length;
       
        Arrays.sort(w);
        int [][] V=new int[n+1][W+1];
        for(int i=0;i<n+1;i++)
        {
            for( int weight=0;weight<W+1;weight++)
            {
                if(i==0)
                {
                    V[i][weight]=0;
                }
                else if(weight==0)
                {
                    V[i][weight]=0;
                }
                else if (weight<w[i-1])
                {
                    V[i][weight]=V[i-1][weight];
                }
                else
                {
                 int a=V[i-1][weight-w[i-1]]+w[i-1];
                 V[i][weight]=max(V[i-1][weight],a); 
                }
                
            }
            }
        return V[n][W];
        }
    public static int max(int o,int p)
    {
        if (o>p)
        {
            return o;
        }
        else
        {
            return p;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

