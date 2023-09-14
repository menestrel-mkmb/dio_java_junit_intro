import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrderDisplayNameTest {
    @DisplayName("usuarioExiste")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("usuarioTemPermissao")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("usuarioTransfere")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("usuarioValidado")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
