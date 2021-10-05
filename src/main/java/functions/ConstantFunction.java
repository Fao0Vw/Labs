package functions;

public class ConstantFunction implements MathFunction {
    int a = 0;

    public ConstantFunction(int a) {
        this.a = a;
    }
    public ConstantFunction() {

    }

    public double apply(double x) {
        return a;
    }
    public double GetA(){
        return a;
    }


}








