
class Calculadora implements InterfaceCalculadora {

    @Override
    public int suma(int num1, int num2) {
        return (num1 + num2);
    }

    @Override
    public int resta(int num1, int num2) {
        return (num1 - num2);
    }

    @Override
    public int multiplicacion(int num1, int num2) {
        return (num1 * num2);
    }

    @Override
    public double division(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) num1 / num2;
    }

    @Override
    public double potencia(int num1, int num2) {
        return Math.pow(num1, num2);
    }
}