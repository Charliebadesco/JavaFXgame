package groupprojet;

public class Evoli extends Pokemon {
   public Evoli() {
       super("Evoli", 40, 10, 3, 15);
       ajouterAttaques(); 
   }

   @Override
   protected void ajouterAttaques() {
       getAttaques().add(ListeDesAttaques.CHARGE);
       getAttaques().add(ListeDesAttaques.MORSURE);
       getAttaques().add(ListeDesAttaques.RUGISSEMENT);
       getAttaques().add(ListeDesAttaques.POTION);
   }
}