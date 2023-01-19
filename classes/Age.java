package classes;

public class Age{
   private String age;
   private int[] buff;
   
   public Age(char a){
      buff = new int[6];
      if (a == 'V') {
         age = "Very young";
         buff = new int[]{-1, 2, 0, 0, -1, 2};
      } else if (a == 'Y') {
         age = "Young";
         buff = new int[]{1, 1, 1, 0, -1, 0};
      } else if (a == 'M') {
         age = "Middle-aged";
         buff = new int[]{0, 0, 0, 1, 1, 0};
      } else if (a == 'O') {
         age = "Older";
         buff = new int[]{-1, -1, -1, 1, 2, 1};
      } else if (a == 'A') {
         age = "Ancient";
         buff = new int[]{-2, -2, -2, 2, 3, 1};
      } else {
         throw new IllegalArgumentException("Bad param");
      }
   }
}