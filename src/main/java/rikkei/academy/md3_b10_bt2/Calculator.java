package rikkei.academy.md3_b10_bt2;

public class Calculator {
    public static float calculate(float firstOperand, float secondOperand, char operator) {
        switch (operator) {
            case '+': return firstOperand +secondOperand;
            case '-': return firstOperand -secondOperand;
            case '*': return firstOperand * secondOperand;
            case '/': 
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can't dicide by zero");
            default:
                throw new RuntimeException("Invalid operator");
        }
    }
}
