package org.bulatnig.braces;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    private App app = new App();

    @Test
    public void check() {
        assertTrue(check("a(b)c"));
        assertTrue(check("[(a){b(c)d}]"));
        assertTrue(check(""));
        assertTrue(check("z([{}-(){a}])"));
        assertFalse(check("]["));
        assertFalse(check("[{]}"));
        assertFalse(check("[["));
        assertFalse(check("))"));
    }

    private boolean check(String text) {
        return app.check(text);
    }

}
