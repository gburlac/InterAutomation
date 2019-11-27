package junittask;

public class JunituTasku {


    public double multiply(double firstNumber, double secondNumber) {

        if (firstNumber >= 0 && firstNumber <= 100 && secondNumber >= 0 && secondNumber <= 100) {
            return firstNumber * secondNumber;
        }
        return 0;
    }


    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > 0 && secondNumber > 0 && firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        }
        return -1;
    }


    public double divide(double numberToBeDivided, double divisor) {
        if (numberToBeDivided > 0 && divisor > 0 && numberToBeDivided > divisor) {
            return numberToBeDivided / divisor;
        }
        return 0;
    }
}
