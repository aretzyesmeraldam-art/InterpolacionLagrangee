package interpolacion;

public class Main {
    public static void main(String[] args) {
        // Nodos de prueba
        double[] x = {1.0, 2.0, 4.0, 5.0};
        double[] y = {1.0, 4.0, 16.0, 25.0};
        double xEval = 3.0;

        System.out.println("=== PRUEBA DE INTERPOLACIÓN ===");
        System.out.println("Punto de evaluación: x = " + xEval + "\n");

        // 1. Ejecución de Lagrange
        double resultadoLagrange = InterpolacionLagrange.interpolacionLagrange(x, y, xEval);
        System.out.println("Resultado con Lagrange: " + resultadoLagrange);

        // 2. Ejecución de Newton (si usas la clase del repositorio)
        // Nota: Asegúrate de tener la clase InterpolacionNewton en este mismo paquete
        double resultadoNewton = InterpolacionNewton.interpolacionNewton(x, y, xEval);
        System.out.println("Resultado con Newton: " + resultadoNewton);
    }
}