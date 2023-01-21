package classes;

public class Skills{
   //Martial/Weapon Skills: Two-handed, Polearms, One-handed, Shield, Archery, Unarmed
   private int[] WSkil;
   //Sorcery/Magic Skills: Destruction, Conjuration, Alteration, Illusion, Restoration, Divination, Enchantment, Necromancy + Curses
   private int[] MSkil;
   //Survival/Trade Skills: Medicine, Tracking, Sneak, Alchemy, Smithing + Woodworking, Tanning + Weaving, Pickpocket, Lockpicking
   private int[] TSkil;
   //Behavior/Social Skills: Etiquette, Streetsmarts, Folklore
   private int[] SSkil;
   
   public Skills(int[] w, int[] m, int[] t, int[] s){
      this.WSkil = new int[6];
      this.MSkil = new int[8];
      this.TSkil = new int[8];
      this.SSkil = new int[3];
      for(int i = 0; i < 6; i++){
         this.WSkil[i] = w[i];
      }
      for(int i = 0; i < 8; i++){
         this.MSkil[i] = m[i];
      }
      for(int i = 0; i < 8; i++){
         this.TSkil[i] = t[i];
      }
      for(int i = 0; i < 3; i++){
         this.SSkil[i] = s[i];
      }
   }
   public void addBuffs(int[] w, int[] m, int[] t, int[] s){
      for(int i = 0; i < 6; i++){
         this.WSkil[i] += w[i];
      }
      for(int i = 0; i < 8; i++){
         this.MSkil[i] += m[i];
      }
      for(int i = 0; i < 8; i++){
         this.TSkil[i] += t[i];
      }
      for(int i = 0; i < 3; i++){
         this.SSkil[i] += s[i];
      }
   }
}