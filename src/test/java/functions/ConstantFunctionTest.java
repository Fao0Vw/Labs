package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstantFunctionTest {

    @Test
    public void apply() {
        ConstantFunction example = new ConstantFunction(14);

        System.out.println(example.apply(4.4));
    }
}