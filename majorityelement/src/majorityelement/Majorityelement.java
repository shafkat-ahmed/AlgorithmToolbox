/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorityelement;

/**
 *
 * @author Acer
 */
import java.util.*;
import java.io.*;

public class Majorityelement {
    private static boolean majoritycheck(int [] a,int cand)
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
        if(a[i]==cand)
        {
            c++;
            if(c>a.length/2)
            {
                return true;
            }
        }
        }
        return false;
    }
    private static int findcandidate(int [] a)
    {
        int maj_ind=0;
        int c=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[maj_ind]==a[i])
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c==0)
            {
                maj_ind=i;
                c=1;
            }
        
        }
      return a[maj_ind];
    }
    private static int getMajorityElement(int[] a, int left, int right) {
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
        int cand=findcandidate(a);
        if (majoritycheck(a,cand))
        {
        return cand;
        }
        
        //write your code here
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        
        }
        if (getMajorityElement(a, 0, a.length) != -1 ){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}


 