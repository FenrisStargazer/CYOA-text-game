package classes;

public class PlayerCharacter{
   private Race rac;
   private Profession prof;
   private Attributes attr;
   private Skills skil;
   private Age age;
   private Origin ori;
   
   public PlayerCharacter(Race r, Profession p, Attributes at, Skills s, Age ag, Origin o){
      this.rac = r;
      this.prof = p;
      this.attr = at;
      this.skil = s;
      this.age = ag;
      this.ori = o;
   }
}