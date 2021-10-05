package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroFunctionTest {

    @Test
    public void zeroFunction() {
        ZeroFunction ZeroExample = new ZeroFunction();

        System.out.println(ZeroExample.apply());
    }
}