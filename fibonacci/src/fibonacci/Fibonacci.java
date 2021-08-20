/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
    {
      return n;
    }
    else
    {
      long [] a=new long[n];
      a[0]=0;
      a[1]=1;
      for(int i=2;i<=n;i++)
      {
        a[i]=a[i-1]+a[i-2];
      }
      return a[n];
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
