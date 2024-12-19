package groupprojet;

public class Mewtwo extends Pokemon {
    public Mewtwo() {
        super("Mewtwo", 100, 10, 7, 22);
        ajouterAttaques(); 
    }

    @Override
    protected void ajouterAttaques() {
        getAttaques().add(ListeDesAttaques.BALL_OMBRE); 
        getAttaques().add(ListeDesAttaques.CHOC_MENTAL);
        getAttaques().add(ListeDesAttaques.ENTRAVE);
        getAttaques().add(ListeDesAttaques.POTION);
    }
}