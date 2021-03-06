package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdentityFunctionTest {

    @Test
    public void apply() {
        IdentityFunction Test = new IdentityFunction();

        System.out.println(Test.apply(4.4));

        System.out.print(" ");

        IdentityFunction Test2 = new IdentityFunction();

        System.out.println(Test2.apply(-2.1));

        System.out.print(" ");
    }
}