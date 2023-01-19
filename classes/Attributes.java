package classes;

public class Attributes{
   //Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma
   private int[] attr;
   
   public Attributes(int[] ats){
      this.attr = new int[6];
      for(int i = 0; i < 6; i++){
         this.attr[i] = ats[i];
      }
   }
}