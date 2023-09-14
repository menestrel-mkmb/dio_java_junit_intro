import org.example.BancoDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTest {


    @BeforeAll
    static void configuraConexao() {
        BancoDados.iniciarConexao();

        System.out.println("Fim da configuração dos testes");
    }

    @Test
    void consultarDados() {
        Assertions.assertTrue(true);
    }

    @Test
    void invalidarDados() {
        Assertions.assertFalse(false);
    }

    @AfterAll
    public static void finalizarConexao() {
        BancoDados.finalizarConexao();
        System.out.println("Finalizou testes");
    }

    @BeforeEach
    public void insereDadosTeste() {
        BancoDados.insereDados(new Pessoa("João", LocalDateTime.of(2000,1,1,12,0)));
    }

    @AfterEach
    public void removeDadosTeste() {
        BancoDados.removeDados(new Pessoa("João", LocalDateTime.of(2000,1,1,12,0)));
    }
}
