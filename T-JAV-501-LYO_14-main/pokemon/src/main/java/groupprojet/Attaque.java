package groupprojet;
import java.util.function.Consumer;


public class Attaque {
    private String nom;
    private int puissance;
    private Consumer<Pokemon> effetSpecial;

    
    public Attaque(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }

    public Attaque(String nom, int puissance, Consumer<Pokemon> effetSpecial) {
        this.nom = nom;
        this.puissance = puissance;
        this.effetSpecial = effetSpecial;
    }

    
    public String getNom() {
        return nom;
    }

    public int getPuissance() {
        return puissance;
    }

    public Consumer<Pokemon> getEffetSpecial() {
        return effetSpecial;
    }
}