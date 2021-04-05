import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Test {

     private static final Scanner scanner = new Scanner(System.in);

     public static void staircase() {
          int o = scanner.nextInt();
          int star = 1;
          int space = o;
          for (int i = 0; i < o; i++) {
               for (int a = 0; a < space - 1; a++) {
                    System.out.print(" ");
               }
               for (int b = 0; b < star; b++) {
                    System.out.print("*");

               }
               space--;
               star++;
               System.out.println("");
          }
     }

     public static void sodem() {
          int position=0;
          int count = 0;
          int N = scanner.nextInt();
          int[] arr = { 5, 2, 4, 3, 5, 1, 3, 5 };
          for (int i = 0; i < arr.length; i++) {
               if(arr[i]==N){
                 position=arr[i];
                 count++;
               }
          }
          System.out.print("co tat ca "+count+" so "+position+" trong mang");
     }

     public static void songuyento() {
          int n = scanner.nextInt();
          if (n % n != 0 && n % 1 != 0) {
               System.out.println("n khong la so nguyen to");

          } else {
               System.out.println("n la so nguyen to");

          }
          if (n % 2 == 0) {
               System.out.print("n la so chan");
          } else {
               System.out.print("n la so le");
          }
     }
     // public static int songuyento(){
     // int p = scanner.nextInt();
     // if(p<2){
     // return 0;
     // }
     // for(int i=2; i<p ; i++){
     // if(p%i ==0){
     // return 0;
     // }
     // }
     // return 1;
     // }

     // Problem 4

     public static void main(String[] args) {
          int n = scanner.nextInt();
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          // Problem 5
          switch (n) {
          case 1:
               staircase();
               break; // tùy chọn
          case 2:
               sodem();
               break; // tùy chọn
          case 3:
               // if (songuyento()==0)
               // {
               // System.out.print("n khong la so nguyen to");
               // }
               // else{System.out.print("n la so nguyen to");}
               // break; // tùy chọn
               songuyento();
          }

          scanner.close();
     }
}