import classes.*;
import java.util.*;
//import java.io.*;
//import cscd212utils.fileutils.FileUtils;

public class CYOAMain{
   public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      String YEL = "\u001B[33m";
      System.out.println(YEL + "Please select a menu option: \n     1: Start new game\n     2: Load save game\n     3: Options" + "\u001B[0m");
      int sel = getUserInput(3, input);
      //if(){
      
      //} else 
   }
   
   public static int getUserInput(int opt, Scanner in){
      int select = in.nextInt();
      if (select <= opt && select >= 0){
         return select;
      } else {
         System.out.println("Nice try, clever little bugger. But that's not gonna fly. Please try again.");
         return getUserInput(opt, in);
      }
   }
}