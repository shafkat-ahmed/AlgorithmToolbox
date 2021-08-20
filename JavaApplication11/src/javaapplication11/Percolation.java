/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;

public class Percolation {
       public  WeightedQuickUnionUF qf;
       public int[] g;
       public int a;
       public int os;
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n)
    { 
          a=1;
          g=new int[n*n];   
          for(int i=0;i<g.length;i++)
          {
                if(i<n)
                {
                    g[i]=0;
                    a++;
                }
                else
                {
                    if(i>g.length-n)
                    {
                        g[i]=n+1;
                        a++;
                    }
                    else{                 
             g[i]=a;
             a++;
            }
                }
          }
          }     
    
    // opens the site (row, col) if it is not open already
    public void open(int row, int col)
    {
        os++;
        g[row*3+col]=a*a+1;
        
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col)
    {
        if(g[row][col]==a*a+1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col)
    {
        if(g[row][col]<=a*a)
        {
            return true;
        }
        else
        {
            return false;            
        }
    }
    // returns the number of open sites
    public int numberOfOpenSites()
    {
        int c=0;
        for(int i=0;i<=a;i++)
          {
              for(int j=0;j<=i;j++)
              {
                  if(g[i][j]<=a*a)
                  {
                      c++;
                  }
              }
              
          }
        return c;
    }
// does the system percolate?
    public boolean percolates()
    {
     for(int i=a;i==0;i--)
     {
         for(int j=a;j>0;j--)
         {
             if(g[i][j]==
         }
     }
     }
  

    // test client (optional)
    public static void main(String[] args)
    {
        Scanner smash=new Scanner(System.in);
        int n=smash.nextInt();
        Percolation p=new Percolation(n);
        p.open(0,1);
        p.open(1,2);
        p.open(2,2);
        p.open(2,1);
        
    }
}