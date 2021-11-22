package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {
    @Test
    public void filter1(){
        DivisibleByFilter filterer = new DivisibleByFilter(3);
        Assertions.assertEquals(filterer.accept(9), true);
        Assertions.assertEquals(filterer.accept(0), true);
        Assertions.assertEquals(filterer.accept(13), false);
        Assertions.assertEquals(filterer.accept(-3), true);
    }
}
