import org.example.Pessoa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionTest {
    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10};

        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetosNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosTiposDiferentes() {
        int valor = 5;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
