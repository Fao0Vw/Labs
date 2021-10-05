package functions;

public class CompositeFunction implements MathFunction{
    private  MathFunction firstFunction;
    private  MathFunction secondFunction;
    public CompositeFunction(MathFunction internalFunction, MathFunction externalFunction) {
        firstFunction = internalFunction;
        secondFunction = externalFunction;
    }

    public double apply(double x) {
        return secondFunction.apply(firstFunction.apply(x));
    }


    }






