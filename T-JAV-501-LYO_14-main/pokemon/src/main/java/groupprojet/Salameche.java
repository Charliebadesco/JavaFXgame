package groupprojet;

public class Salameche extends Pokemon {
   public Salameche() {
       super("Salameche", 40, 10, 8, 18);
       ajouterAttaques(); 
   }

   @Override
   protected void ajouterAttaques() {
       getAttaques().add(ListeDesAttaques.BALLON_BRULANT);
       getAttaques().add(ListeDesAttaques.LANCEFLAMME);
       getAttaques().add(ListeDesAttaques.CHAMP_PYRO);
       getAttaques().add(ListeDesAttaques.POTION);
   }
}