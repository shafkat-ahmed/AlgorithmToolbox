package javaapplication3;
import java.util.*;
import java.io.*;
import java.util.regex.*;
import  java.util.Scanner;
public class JavaApplication3{
  public static void main(String[]args)throws IOException{
    try {
      Scanner scan =new Scanner(new File("D:\\input03.txt"));
      int patternNum =scan.nextInt();
      System.out.println(patternNum);
      String pattern[]=new String[patternNum];
      for(int i=0;i<patternNum;i++){
        pattern[i]=scan.next();
        //System.out.println(pattern[i]);
      }
      int matcherNum= scan.nextInt();
      System.out.println(matcherNum);
      String matcher[]=new String[matcherNum];
      
      for(int i=0;i<matcherNum;i++){
        matcher[i]=scan.next();
        //System.out.println(matcher[i]);
        //patternCheck(matcher[i],pattern);
      }
    
    for(int i=0;i<matcherNum;i++)
    {
        int c=0;
        for(int j=0;j<patternNum;j++)
        {
            if(Pattern.matches(pattern[j],matcher[i]))
            {
                c=j+1;
                System.out.println("yes "+c);
                
        }
        }
        if(c==0)
        {
            System.out.println("NO 0");
        }
           
        }
    }
    }
    catch(IOException e)
    {
      System.out.println(e);
    }
  }

    