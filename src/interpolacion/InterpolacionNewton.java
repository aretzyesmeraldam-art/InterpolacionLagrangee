package interpolacion;

public class InterpolacionNewton {

    private static void validarDatos(double[] x, double[] y) {
        if (x == null || y == null || x.length == 0 || y.length == 0) {
            throw new IllegalArgumentException("Los arreglos no pueden ser nulos ni estar vacíos.");
        }
        if (x.length != y.length) {
            throw new IllegalArgumentException("Los arreglos x y y deben tener el mismo tamaño.");
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    throw new IllegalArgumentException("Nodos de x repetidos: " + x[i]);
                }
            }
        }
    }

    public static double interpolacionNewton(double[] x, double[] y, double xEval) {
        validarDatos(x, y);
        int n = x.length;
        double[][] tabla = new double[n][n];

        // Inicializar la primera columna con los valores de y
        for (int i = 0; i < n; i++) {
            tabla[i][0] = y[i];
        }

        // Construir la matriz de diferencias divididas
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                tabla[i][j] = (tabla[i + 1][j - 1] - tabla[i][j - 1]) / (x[i + j] - x[i]);
            }
        }

        // Mostrar la matriz de diferencias divididas en consola (Requerido para la rúbrica)
        System.out.println("\n=== MATRIZ DE DIFERENCIAS DIVIDIDAS (NEWTON) ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf("%10.4f ", tabla[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // Evaluación del polinomio usando los coeficientes de la diagonal principal
        double resultado = tabla[0][0];
        double productoTermino = 1.0;

        for (int i = 1; i < n; i++) {
            productoTermino *= (xEval - x[i - 1]);
            resultado += tabla[0][i] * productoTermino;
        }

        return resultado;
    }
}