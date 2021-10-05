package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrFunctionTest {

    @Test
    public void apply() {


        SqrFunction Test = new SqrFunction();

        System.out.println(Test.apply(4.4));

        System.out.print(" ");

        SqrFunction Test2 = new SqrFunction();

        System.out.println(Test2.apply(-2.1));

        System.out.print(" ");
    }
}

