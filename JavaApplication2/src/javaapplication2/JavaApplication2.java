package javaapplication2
import java.util.*;
import java.io.*;
import java.util.regex.*;
import  java.util.Scanner;
public class JavaApplication2 {
  public static void main(String[]args)throws IOException{
    try {
      Scanner scan =new Scanner(new File("D:\\input03.txt"));
      int patternNum=scan.nextInt();
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
        patternCheck(matcher[i],pattern);
      }
    }
    catch(IOException e)
    {
      System.out.println(e);
    }
  }
    public static void patternCheck(String m,String p[]){
      String ans="";
      for(int i=0;i<p.length;i++){
//        Pattern r = Pattern.compile(p[i]);
//        Matcher match = r.matcher(m);
        if(Pattern.matches(p[i],m)){
       ans =(i+1)+" ";
        }

      }
      if(ans!=""){
      
      System.out.println("Yes "+ans);
      }
      else{
      
      System.out.println("No 0");
      }
    }
  
}