package groupprojet;
import java.util.ArrayList;
import java.util.List;


public abstract class Pokemon{
    private String nom;
    private int pointsDeVie;
    private int attaque;
    private int defense;
    private int vitesse;
    private int niveau;
    private int experience;

    private List<Attaque> attaques = new ArrayList<>();

    public Pokemon(String nom, int pointsDeVie, int attaque, int defense, int vitesse){
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.attaque = attaque;
        this.defense = defense;
        this.vitesse = vitesse;
        this.niveau = 5; 
        this.experience = 0;
    }

    
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getMaxPointsDeVie() {
        
        return pointsDeVie; 
    }


    public void gagnerExperience(int points){
        experience += points;
        System.out.println(nom + " gagne " + points + " points d'expérience !");

        
        while (experience >= 100){ 
            experience -= 100;
            monterDeNiveau();
        }
    }

    private void monterDeNiveau(){
        niveau++;
        pointsDeVie++;
        attaque++;
        defense++;
        vitesse++;

        System.out.println(nom + " monte au niveau " + niveau + " !");
        System.out.println("Ses statistiques augmentent !");
        System.out.println("PV: " + pointsDeVie + ", Attaque: " + attaque + ", Défense: " + defense + ", Vitesse: " + vitesse);
    }

    public int calculerDegats(Attaque attaque, Pokemon defenseur){
        
        int baseDegats = attaque.getPuissance();
        return Math.max(0, baseDegats - defenseur.getDefense());
    }

    public void recevoirDegats(int degats){
        pointsDeVie -= degats;
        if (pointsDeVie < 0) pointsDeVie = 0;
    }

    public boolean estKO(){
        return pointsDeVie <= 0;
    }

    
    public String getNom(){return nom;
    }
    public int getPointsDeVie(){return pointsDeVie;
    }
    public int getAttaque(){return attaque;
    }
    public int getDefense(){return defense;
    }
    public int getVitesse(){return vitesse;
    }
    public int getNiveau(){return niveau;
    }
    public int getExperience(){return experience;
    }
    public List<Attaque> getAttaques(){return attaques;
    }
    protected abstract void ajouterAttaques();
    
    }

