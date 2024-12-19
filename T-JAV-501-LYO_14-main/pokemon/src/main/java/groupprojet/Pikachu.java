package groupprojet;

public class Pikachu extends Pokemon {
   public Pikachu() {
       super("Pikachu", 35, 10, 2, 20);
       ajouterAttaques(); 
   }

   @Override
   protected void ajouterAttaques() {
       getAttaques().add(ListeDesAttaques.TACLE);
       getAttaques().add(ListeDesAttaques.TONNERRE);
       getAttaques().add(ListeDesAttaques.CAGE_ECLAIR);
       getAttaques().add(ListeDesAttaques.POTION);
   }
}