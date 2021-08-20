/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointsandsegments;

import java.util.Scanner;

public class Pointsandsegments {

    private static String fastCountSegments(int[] starts, int[] ends, int points) {
        String s="";
        int c=0;
        for(int i=0;i<starts.length;i++)
        {
            if(starts[i]<=points && ends[i]>=points)
            {
                c++;
            }
            
        }
        //write your code here
        s=s+c;
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] starts = new int[n];
        int[] ends = new int[n];
        int[] points = new int[m];
        for (int i = 0; i < n; i++) {
            starts[i] = scanner.nextInt();
            ends[i] = scanner.nextInt();
        }
        String S="";
        for (int i = 0; i < m; i++) {
            int p=scanner.nextInt();
            S=S+fastCountSegments(starts,ends,p)+" ";
        }
        System.out.println(S);
        //use fastCountSegments
      
    }
}


