import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcSumTest {

    CalcSum Calcsumtest1 = new CalcSum();

    @Test
    void Calcsumtest1(){
        int a = 4;
        int b = 5;
        Calcsumtest1.sum(a, b);

        assertEquals(Calcsumtest1.sum(a,b),9);
    }

}