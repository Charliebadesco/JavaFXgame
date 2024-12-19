package groupprojet;

public class CombatStyle {
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private boolean combatTermine = false;

    public CombatStyle(Pokemon p1, Pokemon p2) {
        
        if (p1.getVitesse() >= p2.getVitesse()) {
            this.pokemon1 = p1;
            this.pokemon2 = p2;
        } else {
            this.pokemon1 = p2;
            this.pokemon2 = p1;
        }
    }

    public void lancerCombat() {
        System.out.println(pokemon1.getNom() + " commence le combat !");

        while (!combatTermine) {
            effectuerTour(pokemon1, pokemon2);
            if (pokemon2.estKO()) {
                terminerCombat(pokemon1, pokemon2);
                break;
            }

            effectuerTour(pokemon2, pokemon1);
            if (pokemon1.estKO()) {
                terminerCombat(pokemon2, pokemon1);
                break;
            }
        }
    }

    private void effectuerTour(Pokemon attaquant, Pokemon defenseur) {
        if (combatTermine) return;

        Attaque attaqueChoisie = attaquant.getAttaques().get(0); 
        int degats = attaquant.calculerDegats(attaqueChoisie, defenseur);
        defenseur.recevoirDegats(degats);

        System.out.println(attaquant.getNom() + " utilise " + attaqueChoisie.getNom() + " !");
        System.out.println(defenseur.getNom() + " reçoit " + degats + " dégâts. PV restants : " + defenseur.getPointsDeVie());
    }

    private void terminerCombat(Pokemon gagnant, Pokemon perdant) {
        combatTermine = true;
        System.out.println("\n=== Fin du Combat ===");
        System.out.println(gagnant.getNom() + " a vaincu " + perdant.getNom() + " !");
        System.out.println(perdant.getNom() + " est KO !");
        System.out.println("Bravo à " + gagnant.getNom() + " pour cette victoire !");

        
        gagnant.gagnerExperience(50); 
    }
}
