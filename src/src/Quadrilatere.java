public class Quadrilatere {

    // Attributs : on utilise la longueur et la largeur (pour simplifier la surface)
    private double longueur;
    private double largeur;

    // --- 2. Créer les deux constructeurs ---

    // 1. Constructeur par défaut (met les valeurs par défaut)
    public Quadrilatere() {
        this.longueur = 1.0; // Valeur par défaut
        this.largeur = 1.0;  // Valeur par défaut
        System.out.println("Création d'un quadrilatère avec les valeurs par défaut (carré 1x1).");
    }

    // 2. Constructeur avec paramètres (accepte les propriétés)
    public Quadrilatere(double longueur, double largeur) {
        // On pourrait ajouter une vérification ici pour s'assurer que les valeurs sont positives
        this.longueur = longueur;
        this.largeur = largeur;
        System.out.println("Création d'un quadrilatère de " + longueur + "x" + largeur + ".");
    }

    // --- 3. Définir les comportements (Méthodes) ---

    // Méthode pour calculer la surface (Surface d'un rectangle = Longueur * Largeur)
    public double calculerSurface() {
        return this.longueur * this.largeur;
    }

    // Méthode pour calculer le périmètre (Périmètre d'un rectangle = 2 * (Longueur + Largeur))
    public double calculerPerimetre() {
        return 2 * (this.longueur + this.largeur);
    }
}