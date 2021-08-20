/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxchocolate;
/**
 *
 * @author Acer
 */
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import java.util.*;

public class Maxchocolate {
    private static String optimalsummand(int n) {
        String st="";
        int c=0;
        int s=0;
        int l;
        l = (int)floor((sqrt(8*n+1)-1)/2);
        for(int i=1;i<=l;i++)
        {
            if(s+i==n)
            {
                c++;
                st=st+i;
                break;
            }
            else if(s+2*i+1>n)
            {
                c++;
                i=n-s;
                st=st+i;
                break;
            }
            c++;
            s=s+i;
            st=st+i+" ";
        }
        System.out.println(c);
        //write your code here
        return st;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(optimalsummand(n));
    }
}

