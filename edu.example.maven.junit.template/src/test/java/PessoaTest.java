import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class PessoaTest {
    @Test
    void deveRetornarSeMaiorIdade() {
        Pessoa joao = new Pessoa("Joao", LocalDateTime.of(2020,1,1,15,10));
        Assertions.assertFalse(joao.maiorIdade());

        Pessoa marta = new Pessoa("Marta", LocalDateTime.of(1995,1,1,15,10));
        Assertions.assertTrue(marta.maiorIdade());

        List<Pessoa> pessoas = List.of(
                new Pessoa("Julia", LocalDateTime.now()),
                new Pessoa("Maria", LocalDateTime.now()),
                new Pessoa("Jessica", LocalDateTime.of(2000,1,1,15,10))
        );

        Assertions.assertAll( "pessoas",
                () -> Assertions.assertFalse(pessoas.get(0).maiorIdade()),
                () -> Assertions.assertFalse(pessoas.get(1).maiorIdade()),
                () -> Assertions.assertTrue(pessoas.get(2).maiorIdade())
        );
    }

    @Test
    void deveRetornarIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDateTime.of(2020, 1, 1, 15, 10));
        Assertions.assertEquals(3, pessoa.getIdade());
    }
}
