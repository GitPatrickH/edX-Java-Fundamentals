import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowTest {

    @Test
    void testNullInput() {
        Assertions.assertThrows(NullPointerException.class, () -> ControlFlow.onlyEvens(null, null));
    }

    @Test
    void testEmptyInput() {
        List<Short> result = ControlFlow.onlyEvens();
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(49, result.size());
    }

    @Test
    void testOnlyEvens() {
        List<Short> result = ControlFlow.onlyEvens((short) 1, (short) 1);
        Assertions.assertTrue(result.isEmpty());
        result = ControlFlow.onlyEvens((short) 1, (short) 99);
        Assertions.assertFalse(result.isEmpty());
    }
}