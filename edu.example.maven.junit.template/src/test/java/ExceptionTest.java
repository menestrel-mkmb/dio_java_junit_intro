import org.example.Conta;

import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {
    @Test
    void validarCenarioExcecaoTransferencia() {
        Conta contaO = new Conta("12345", 0);
        Conta contaD = new Conta("23456", 100);

        TransferenciaEntreContas t = new TransferenciaEntreContas();
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                t.transfere(contaO, contaD, -1)
        );

        Assertions.assertDoesNotThrow( () ->
                t.transfere(contaD, contaO, 20)
        );
    }
}
