package classes;

public class PlayerCharacter{
   private Race rac;
   private Profession prof;
   private Attributes attr;
   private Skills skil;
   private Age age;
   private Origin ori;
   private Gender gen;
   
   public PlayerCharacter(Race r, Profession p, Attributes at, Skills s, Age ag, Origin o, Gender g){
      this.rac = r;
      this.prof = p;
      this.attr = at;
      this.skil = s;
      this.age = ag;
      this.ori = o;
      this.gen = g;
      
      this.attr.addBuffs(ag.GetBuff());
      this.attr.addBuffs(gen.GetBuff());
      //apply buffs (r, p?, ag, ori?, gen)
   }
}