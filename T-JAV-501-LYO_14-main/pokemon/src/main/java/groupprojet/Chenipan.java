package groupprojet;

public class Chenipan extends Pokemon {
   public Chenipan() {
       super("Chenipan", 30, 10, 1, 8);
       ajouterAttaques(); 
   }

   @Override
   protected void ajouterAttaques() {
       getAttaques().add(ListeDesAttaques.BOND);
       getAttaques().add(ListeDesAttaques.PIC_VENIN);
       getAttaques().add(ListeDesAttaques.SECRETION);
       getAttaques().add(ListeDesAttaques.POTION);
   }
}