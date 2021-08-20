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
import java.util.Arrays;
public class Dotproduct {
    private static long maxDotProduct(int[] a, int[] b) {
        //write your code here
        int[] c=new int[a.length];
        int [] d=new int[b.length];
        Arrays.sort(a);
        Arrays.sort(b);
        int j = 0,k=0;
        for(int i=c.length-1;i>=0;i--)
        {
            c[j]=a[i];
            j++;
        }
        for(int i=d.length-1;i>=0;i--)
        {
            d[k]=b[i];
            k++;
        }
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += c[i] * d[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}

