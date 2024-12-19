package groupprojet;

public class Bulbizarre extends Pokemon {
   public Bulbizarre() {
       super("Bulbizarre", 45, 10, 3, 10);
       ajouterAttaques(); 
   }

   @Override
   protected void ajouterAttaques() {
       getAttaques().add(ListeDesAttaques.ACROBATIE);
       getAttaques().add(ListeDesAttaques.FOUET_LIANES);
       getAttaques().add(ListeDesAttaques.POUDRE_DODO);
       getAttaques().add(ListeDesAttaques.POTION);
   }
}