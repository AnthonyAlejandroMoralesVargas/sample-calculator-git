package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("🚀🚀  CALCULATOR EXECUTION STARTED  🚀🚀");
        System.out.println("========================================\n");

        Calculator c = new Calculator();

        // Realizamos la suma y mostramos el resultado con una salida llamativa
        int addition = c.addition(4, 7);
        System.out.println("🔢 Resultado de c.addition(4, 7): " + addition);

        // Realizamos la resta y mostramos el resultado con una salida llamativa
        int subtraction = c.subtraction(7, 1);
        System.out.println("🔢 Resultado de c.subtraction(7, 1): " + subtraction);

        // Línea impactante haciendo referencia a un cambio
        System.out.println("\n****************************************");
        System.out.println("✨💡 ¡Cambio Exitoso! El cálculo es ahora SUPER eficiente 💡✨");
        System.out.println("****************************************\n");

        System.out.println("========================================");
        System.out.println("🚀🚀  CALCULATOR EXECUTION FINISHED  🚀🚀");
        System.out.println("========================================");
    }
}
