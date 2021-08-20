/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partition3;

/**
 *
 * @author Acer
 */
import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.lang.*;
public class Partition3 {
    private static int partition3(int[] A) {
        //write your code here
       int b=0;
       Arrays.sort(A);
       int sum=0;
       int r=A.length;
       for(int i=0;i<A.length;i++)
       {
           sum=sum+A[i];
       }
       int part=sum/3;
       boolean [][] v=new boolean[r][part+1];
       if(sum%3!=0)
       {
        return 0;
       }
       else
       {
           for(int i=0;i<r;i++)
           {
               for(int p=0;p<part+1;p++)
               {
                   if(p==0)
                   {
                       v[i][p]= true;
                   }
                   else if(i==0)
                   {
                       if(p==A[i])
                       {
                           v[i][p]=true;
                       }
                       else
                       {
                           v[i][p]=false;
                       }
                   }
                   else
                   {
                     if(p<A[i])
                     {
                         v[i][p]=v[i-1][p];
                     }
                     else
                     {
                         b=Math.abs(A[i]-p);
                         v[i][p]=v[i-1][b];
                     }
                   }
               }
           }
       }
       int c=0;
       for(int i=0;i<r;i++)
       {
           if(v[i][part]==true)
           {
               c++;
           }
       }
       if(c>=3)
       {
           return 1;
       }
       else
       {
           return 0;
       }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(partition3(A));
    }
}