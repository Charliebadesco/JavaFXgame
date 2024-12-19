package groupprojet;

public class Main {
    public static void main(String[] args) {
        
        Pokemon pikachu = new Pikachu();
        Pokemon mewtwo = new Mewtwo();
        
        
        CombatStyle combat = new CombatStyle(pikachu, mewtwo);
        combat.lancerCombat();
    }
}