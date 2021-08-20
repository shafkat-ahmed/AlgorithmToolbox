/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 mala* and open the template in the editor.
 */
package editdistance;

import java.util.*;

class Editdistance {
  public static int EditDistance(String s, String t) {
    //write your code here
    char [] s1 =s.toCharArray();
    char [] t1=t.toCharArray();
    int m=s1.length;
    int n=t1.length;
    int [][] dp = new int [m+1][n+1];
    for(int i=0;i<=m;i++)
    {
        for(int j=0;j<=n;j++)
        {
            if(i==0) 
            {
                dp[i][j]=j;
            }
            else if(j==0)
            {
                dp[i][j]=i;
            }
            else if(s1[i-1]==t1[j-1])
            {
                dp[i][j]=dp[i-1][j-1];
            }
            else
            {
                dp[i][j]=1+min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]);
            }
                
        }
    }
    return dp[m][n];
  }
  public static int min(int a,int b,int c)
  {
      if(a<=b && a<=c)
      {
          return a;
      }
      else if(b<=a && b<=c)
      {
          return b;
      }
      else
      {
          return c;
      }
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String t = scan.next();
    System.out.println(EditDistance(s, t));
  }

}

