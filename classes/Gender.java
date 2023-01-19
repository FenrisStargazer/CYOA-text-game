package classes;

public class Gender{
   private String gen;
   private int[] buff;
   
   public Gender(char mf){
      if (mf == 'F') {
         gen = "Female";
         buff = new int[]{0, 0, 1, 0, 1, 1};
      } else if (mf == 'M') {
         gen = "Male";
         buff = new int[]{1, 1, 0, 1, 0, 0};
      } else {
         throw new IllegalArgumentException("Bad param");
      }
   }
}