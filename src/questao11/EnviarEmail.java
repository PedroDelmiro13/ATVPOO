package src.questao11;

import java.util.Random;

public class EnviarEmail implements EnvioMensagem {
    private String status = "Pendente";

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);

        if (new Random().nextDouble() < 0.1) {
            this.status = "Falha no envio do e-mail.";
            return false;
        }
        this.status = "E-mail enviado com sucesso.";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}
