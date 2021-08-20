/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Acer
 */
import java.util.*;

public class Coveringsegments {

    private static String optimalPoints(int [] a,int[] b) {
        String s="";
        int c=0;
        int temp=0;
        int n=b.length;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(b[j-1]>b[j])
                {
                    temp=b[j-1];
                    b[j-1]=b[j];
                    b[j]=temp;
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        int i =0;
        int j=i+1;
        int t=0;
        while(i<n)
        {
            if(j==n)
            {
                    c++;
                    s=s+t+" ";
                
                break;
            }
            t=b[i];
            if(b[j]>=b[i]&&a[j]<=b[i])
            {
                j++;
            }
            else
            {
                s=s+t+" ";
                i=j;
                j=i+1;
                c++;
                if(i==b.length-1)
                {
                    c++;
                    s=s+b[i]+" ";
                    break;
                }
            }
        } 
        System.out.println(c);
        return s;
        
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a=new int[n];
        int [] b=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        System.out.println(optimalPoints(a,b));
    }
}