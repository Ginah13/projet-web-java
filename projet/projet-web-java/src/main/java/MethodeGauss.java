
public class MethodeGauss {
//	public double[][] matrice;
//	public double[] vecteur;
	
    public MethodeGauss() {
		 }

    /**
     * Méthode pour transformer la matrice A en matrice triangulaire supérieure.
     * matriceA La matrice A à transformer.
     * vecteurB Le vecteur B du système d'équations.
     */
    public void triangulaire(double[][] matrice, double[] vecteur) {
        int n = matrice.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double facteur = matrice[j][i] / matrice[i][i];
                for (int k = 0; k < n; k++) {
                   matrice[j][k] -= facteur * matrice[i][k];
                }
                vecteur[j] -= facteur * vecteur[i];
            }
        }
    }

    /**
     * Méthode pour résoudre le système d'équations linéaires A*x = B en utilisant la matrice triangulaire supérieure.
     * matriceA La matrice A triangulaire supérieure.
     * vecteurB Le vecteur B du système d'équations.
     * Le vecteur X solution du système.
     */
    public double[] resolution(double[][] matrice, double[] vecteur) {
        int n = matrice.length;
        double[] solution = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double somme = 0;
            for (int j = i + 1; j < n; j++) {
                somme += matrice[i][j] * solution[j];
            }
            solution[i] = (vecteur[i] - somme) / matrice[i][i];
        }
        return solution;
    }
}


