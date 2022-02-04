public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 10;
        int intOperandB = 5;

        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum + ".");

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct + ".");

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference + ".");

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient + ".");

        intModulo = intOperandA % intOperandB;
        System.out.println("The remainder of " + intOperandA + " and " + intOperandB + " is " + intModulo + ".");

    }
}
