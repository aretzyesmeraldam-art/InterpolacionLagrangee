# Práctica: Interpolación de Lagrange y Diferencias Divididas de Newton

Proyecto desarrollado en Java que implementa, evalúa y compara dos de los métodos numéricos de interpolación polinomial.



##  Estructura del Proyecto
Los archivos se encuentran organizados dentro del paquete `interpolacion`:
* `InterpolacionLagrange.java`: Implementación del cálculo del polinomio mediante la productoria base $L_i(x)$.
* `InterpolacionNewton.java`: Construcción de la matriz de diferencias divididas y evaluación del polinomio.
* `Main.java`: Clase principal para la ejecución de las pruebas numéricas.



##  Resultados en Consola
```text
=== PRUEBA DE INTERPOLACIÓN ===
Punto de evaluación: x = 3.0

Resultado con Lagrange: 9.0

=== MATRIZ DE DIFERENCIAS DIVIDIDAS (NEWTON) ===
    1.0000     3.0000     1.0000     0.0000 
    4.0000     6.0000     1.0000 
   16.0000     9.0000 
   25.0000 

Resultado con Newton: 9.0