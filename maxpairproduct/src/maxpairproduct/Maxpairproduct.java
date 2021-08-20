/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxpairproduct;
/**
 *
 * @author Acer
 */
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Maxpairproduct
{ 
  public Maxpairproduct()
  {
  }
  static long findma(Long[] ff)
  {
    int n=ff.length;
    int maxind1=0;
    int maxind2=0;
    for (int i=0;i<n;i++)
    {
      if(ff[i]>ff[maxind1])
      {
        maxind1=i;
      }
    }
     for (int i=0;i<n;i++)
     {
       if((ff[maxind1]!=ff[i]) && (ff[i]>ff[maxind2]))
       {
         maxind2=i;
       }
            
     }
     return ff[maxind1]*ff[maxind2];
  }
  public static void main(String[] args) throws IOException
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    Long [] f=new Long[a]; 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String  lines = br.readLine();    
    String[] strs = lines.trim().split("\\s+");
    for (int i = 0; i < strs.length; i++) 
    {
    f[i] = Long.parseLong(strs[i]);
    }
    //maxpairproduct m=new maxpairproduct();
    System.out.println (findma(f));
  }
}
