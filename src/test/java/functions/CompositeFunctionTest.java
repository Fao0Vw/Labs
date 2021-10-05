package functions;

import org.junit.Test;

import static org.junit.Assert.*;
public final class CompositeFunctionTest {
    @Test


    public void testOfApplyCompositeFunction() {
        SqrFunction firstFunction = new SqrFunction();
        SqrtFunction secondFunction = new SqrtFunction();
        CompositeFunction complexFunction = new CompositeFunction(firstFunction, secondFunction);
        CompositeFunction complex2Function = new CompositeFunction(complexFunction, secondFunction);
        System.out.println(complexFunction.apply(2.1));
        System.out.println(" ");

    }
}