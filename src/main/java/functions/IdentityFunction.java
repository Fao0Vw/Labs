package functions;

public class IdentityFunction implements MathFunction {

    public double apply(double x) {
        return x;
    }

    public static void main(String[] args) {
        IdentityFunction example = new IdentityFunction();
        System.out.println(example.apply(4.4));

    }
}








