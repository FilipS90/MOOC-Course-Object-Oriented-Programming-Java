package validation;

public class Calculator {

    public int multiplication(int fromInteger) {

        int m = 1;
        if(fromInteger<0){
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= fromInteger; i++) {
            m *= i;
        }

        return m;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if(setSize<0 || subsetSize<0)
            throw new IllegalArgumentException();
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
