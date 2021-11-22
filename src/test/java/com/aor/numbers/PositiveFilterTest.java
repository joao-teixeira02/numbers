package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {
    @Test
    public void filter1(){
        PositiveFilter filterer = new PositiveFilter();
        Assertions.assertEquals(filterer.accept(-1), false);
        Assertions.assertEquals(filterer.accept(2), true);
        Assertions.assertEquals(filterer.accept(0), false);
        Assertions.assertEquals(filterer.accept(20), true);
    }
}
