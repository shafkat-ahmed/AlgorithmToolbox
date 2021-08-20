/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfuel;

import java.util.*;
import java.io.*;
public class CarFuel {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int n=stops.length-2;
        int refil=0;
        int crefil=0;
        int lastrefil=0;
        while(crefil<=n)
        {
             lastrefil=crefil;
             if(stops[lastrefil]+tank==stops[stops.length-1])
                {
                    refil++;
                }
            while(crefil<=n && stops[crefil+1]-stops[lastrefil]<=tank)
            {
                crefil++;
               
            }
            if(crefil==lastrefil || stops[0]>tank)
            {
                return -1;
            }
            else if (crefil<=n)
            {
                refil++;
            }
        }
                    
     return refil;               
            
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }
        stops[n]=dist;

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
