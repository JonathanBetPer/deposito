package RefactoringGuru;

/**
 * @author JonathanBetPer
 * @since 03/06/2023
 * @version v1
 *
 * Clase CalcularArea.
 * Ejercicio ETS con algún 'code smell'
 * La clase tiene métodos que calculan el área de distintas figuras planas
 */
public abstract class calcularArea {
    /**
     * Método que devuelve el área de un circunferencia
     * @param radio de la circunferencia (double)
     * @return área de la circunferencia (double)
     */
    public double calcularCirculo(double radio) {
        return calculoGeneral(3.14,radio,radio);
    }

    /**
     * Método que devuelve el área de un rectángulo
     * @param base del rectángulo (double)
     * @param altura del rectángulo (double)
     * @return área del rectángulo (double)
     */
    public double calcularRectangulo(double base, double altura) {
        return calculoGeneral(1,base,altura);
    }

    /**
     * Método que devuelve el área de un triángulo
     * @param base del triángulo (double)
     * @param altura del triángulo (double)
     * @return área del triángulo (double)
     */
    public double calcularTriangulo(double base, double altura) {
        return calculoGeneral(0.5,base,altura);
    }

    /**
     * Método que calcula el área de cualquier figura plana
     * @param factor de la figura (double)
     * @param medida1 de la figura (double)
     * @param medida2 de la figura (double)
     * @return área de la figura (double)
     */
    private double calculoGeneral(double factor, double medida1, double medida2) {
        return factor * medida1 * medida2;
    }
}
