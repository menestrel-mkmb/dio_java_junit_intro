package org.example;

import java.util.logging.Logger;

public class BancoDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());
    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        LOGGER.info("Inseriu dados");
        System.out.println(pessoa.getNome());
    }

    public static void removeDados(Pessoa pessoa) {
        LOGGER.info("Removeu dados");
        System.out.println(pessoa.getNome());
    }
}
