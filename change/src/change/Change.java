/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        boolean a=true;
        int r=0;
        int c=0;
        while(a==true)
        {
            if(m>=10)
            {
                r=m/10;
                m=m-r*10;
                c=c+r;
            }
            else if(m>=5)
                    {
                        r=m/5;
                        m=m-r*5;
                        c=c+r;
                    }
            else if(m>=1 && m<5)
            {
              c=c+m;
              a=false;
            }
            else
            {
            a=false;
            }
        }
        //write your code here
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

