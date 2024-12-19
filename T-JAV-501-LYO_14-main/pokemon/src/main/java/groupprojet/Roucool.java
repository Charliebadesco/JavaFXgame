package groupprojet;

public class Roucool extends Pokemon {
   public Roucool() {
       super("Roucool", 30, 10, 1, 8);
       ajouterAttaques(); 
   }

   @Override
   protected void ajouterAttaques() {
       getAttaques().add(ListeDesAttaques.PIC_PIC);
       getAttaques().add(ListeDesAttaques.TORNADE);
       getAttaques().add(ListeDesAttaques.VENT_VIOLENT);
       getAttaques().add(ListeDesAttaques.POTION);
   }
}