package groupprojet;

public class Mew extends Pokemon {
    public Mew() {
        super("Mew", 80, 10, 5, 20);
        ajouterAttaques(); 
    }

    @Override
    protected void ajouterAttaques() {
        getAttaques().add(ListeDesAttaques.PSYKO);
        getAttaques().add(ListeDesAttaques.VAGUE_PSYKO);
        getAttaques().add(ListeDesAttaques.ONDE_FOLLIE);
        getAttaques().add(ListeDesAttaques.POTION);
    }
}