/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class Changedp {
    private static int getChange(int m) {
       int numcoins=0;
       int [] coins={1,3,4};
       int [] MinNumCoins=new int[m+1];
       for(int i=1;i<m+1;i++)
       {
        MinNumCoins[i] =Integer.MAX_VALUE;
        for(int j=0;j<coins.length;j++)
        {
            if(i>=coins[j])
            {
                numcoins=MinNumCoins[i-coins[j]]+1;
                if(numcoins<MinNumCoins[i])
                {
                    MinNumCoins[i]=numcoins;
                }
            }
        }
       }
       return MinNumCoins[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
