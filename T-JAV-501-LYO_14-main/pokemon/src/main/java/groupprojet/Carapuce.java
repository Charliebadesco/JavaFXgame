package groupprojet;

public class Carapuce extends Pokemon {
   public Carapuce() {
       super("Carapuce", 40, 10, 4, 13);
       ajouterAttaques(); 
   }

   @Override
   protected void ajouterAttaques() {
       getAttaques().add(ListeDesAttaques.PISTOLET_A_EAU);
       getAttaques().add(ListeDesAttaques.HYDROCANNON);
       getAttaques().add(ListeDesAttaques.CHAMP_HYDRO);
       getAttaques().add(ListeDesAttaques.POTION);
   }
}