package classes;

public class Skills{
   //Weapon Skills: Two-handed, Spear, One-handed, Shield, Archery, Unarmed
   private int[] WSkil;
   //Magic Skills: Destruction, Conjuration, Alteration, Illusion, Restoration, Divination, Necromancy
   private int[] MSkil;
   //Survival Skills: 
   private int[] SSkil;
   
   public Skills(){
      this.attr = new int[6];
      for(int i = 0; i < 6; i++){
         this.attr[i] = ats[i];
      }
   }
}