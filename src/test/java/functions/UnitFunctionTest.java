package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitFunctionTest {

    @Test
    public void zeroFunction() {
        UnitFunction UnitExample = new UnitFunction();

        System.out.println(UnitExample.apply());
    }
}