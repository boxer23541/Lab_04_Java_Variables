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

        double doubleOperandA = 2.5;
        double doubleOperandB = 9.75;

        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

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

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum + ".");

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct + ".");

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference + ".");

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient + ".");

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The remainder of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo + ".");

    }
}
