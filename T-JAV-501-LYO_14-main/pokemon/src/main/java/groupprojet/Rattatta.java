package groupprojet;

public class Rattatta extends Pokemon {
    public Rattatta() {
        super("Rattatta", 30, 10, 2, 10);
        ajouterAttaques(); 
    }

    @Override
    protected void ajouterAttaques() {
        getAttaques().add(ListeDesAttaques.BANG_SONIC);
        getAttaques().add(ListeDesAttaques.CROC);
        getAttaques().add(ListeDesAttaques.MIMIE_QUEUE);
        getAttaques().add(ListeDesAttaques.POTION);
    }
}