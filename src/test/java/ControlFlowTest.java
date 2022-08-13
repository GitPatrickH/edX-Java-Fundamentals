import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowTest {

    ControlFlow testSubject;

    @Test
    void isEmpty(){
        List<Short> result = testSubject.onlyEvens((short) 1, (short)1);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void onlyEvensTest(){
        List<Short> result = testSubject.onlyEvens();
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(49, result.size());
    }
}