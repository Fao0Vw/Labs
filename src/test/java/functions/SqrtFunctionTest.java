package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtFunctionTest {

    @Test
    public void apply() {
        SqrtFunction Test = new SqrtFunction();

        System.out.println(Test.apply(4.4));

        System.out.print(" ");

        SqrtFunction Test2 = new SqrtFunction();

        System.out.println(Test2.apply(2.1));

        System.out.print(" ");
    }
}