import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {
    @Test
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void validarAlgoSomenteAdmin() {
        Assumptions.assumeTrue("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
