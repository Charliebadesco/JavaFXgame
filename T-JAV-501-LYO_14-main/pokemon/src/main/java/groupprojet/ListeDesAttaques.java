package groupprojet;

public class ListeDesAttaques{

    
    public static final Attaque POTION = new Attaque("Potion", 0, lanceur ->{
        lanceur.setPointsDeVie(Math.min(lanceur.getPointsDeVie() + 20, lanceur.getMaxPointsDeVie()));
        System.out.println(lanceur.getNom() + " récupère 20 points de vie !");
    });



    public static final Attaque BANG_SONIC = new Attaque("Bang-sonic", 10);
    public static final Attaque BOND = new Attaque("Bond", 10);
    public static final Attaque CHARGE = new Attaque("Charge", 10);
    public static final Attaque PIC_PIC = new Attaque("Pic-pic", 10);
    public static final Attaque PISTOLET_A_EAU = new Attaque("Pistolet-à-eau", 10);
    public static final Attaque BALLON_BRULANT = new Attaque("Ballon-brulant", 10);
    public static final Attaque ACROBATIE = new Attaque("Acrobatie", 10);
    public static final Attaque TACLE = new Attaque("Tacle", 10);
    public static final Attaque LANCEFLAMME = new Attaque("Lance-flamme", 20);
    public static final Attaque CROC = new Attaque("Croc", 20);
    public static final Attaque MORSURE = new Attaque("Morsure", 20);
    public static final Attaque PIC_VENIN = new Attaque("Pic-venin", 20);
    public static final Attaque HYDROCANNON = new Attaque("Hydrocanon", 20);
    public static final Attaque FOUET_LIANES = new Attaque("Fouet Lianes", 20);
    public static final Attaque TONNERRE = new Attaque("Tonnerre", 20);
    public static final Attaque TORNADE = new Attaque("Tornade", 20);
    public static final Attaque CROCS_ECLAIR = new Attaque("Crocs Éclair", 20);
    public static final Attaque PSYKO = new Attaque("Psyko", 10);
    public static final Attaque BALL_OMBRE = new Attaque("Balle-Ombre", 10);
    public static final Attaque VAGUE_PSYKO = new Attaque("Vague-psyko", 20);
    public static final Attaque CHOC_MENTAL = new Attaque("Choc-mental", 20);


    public static final Attaque CAGE_ECLAIR = new Attaque("Cage Éclair", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Cage Éclair !");
    });

    public static final Attaque SECRETION = new Attaque("Sécrétion", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Sécrétion !");
    });

    public static final Attaque BROUILLARD = new Attaque("Brouillard", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Brouillard !");
    });

    public static final Attaque POUDRE_DODO = new Attaque("Poudre dodo", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Poudre Dodo !");
    });

    public static final Attaque CHAMP_PYRO = new Attaque("Champ-pyro", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Champ-pyro !");
    });

    public static final Attaque CHAMP_HYDRO = new Attaque("Champ-hydro", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Champ-hydro !");
    });

    public static final Attaque VENT_VIOLENT = new Attaque("Vent Violent", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Cage Éclair !");
    });

    public static final Attaque RUGISSEMENT = new Attaque("Rugissement", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Rugissement !");
    });

    public static final Attaque MIMIE_QUEUE = new Attaque("Mimie-queue", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Mimie-queue !");
    });

    public static final Attaque ONDE_FOLLIE = new Attaque("Onde-follie", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Onde-follie !");
    });

    public static final Attaque ENTRAVE = new Attaque("Entrave", 0, defenseur ->{
        defenseur.setVitesse(Math.max(1, defenseur.getVitesse() - 2));
        System.out.println(defenseur.getNom() + " voit sa vitesse réduite par Entrave !");
    });
}
