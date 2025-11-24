public class Main {
    public static void main(String[] args) {

        // --- 4. Créer deux instances distinctes de quadrilatères ---

        // Instance 1 : à partir du constructeur par défaut
        // Longueur = 1.0, Largeur = 1.0
        Quadrilatere quad1 = new Quadrilatere();

        // Instance 2 : à partir du constructeur avec paramètres
        // Longueur = 5.0, Largeur = 3.5
        Quadrilatere quad2 = new Quadrilatere(5.0, 3.5);

        System.out.println("\n--- Affichage des résultats ---");

        // --- 5. Afficher les surfaces et périmètres de chaque quadrilatère ---

        // Affichage du Quadrilatère 1 (par défaut)
        System.out.println("\nQuadrilatère 1 (Défaut) :");
        System.out.println("  Surface : " + quad1.calculerSurface());
        System.out.println("  Périmètre : " + quad1.calculerPerimetre());

        // Affichage du Quadrilatère 2 (personnalisé)
        System.out.println("\nQuadrilatère 2 (Personnalisé) :");
        System.out.println("  Surface : " + quad2.calculerSurface());
        System.out.println("  Périmètre : " + quad2.calculerPerimetre());
    }
}