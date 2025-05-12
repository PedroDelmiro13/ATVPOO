package src.questao11;

public class GestorDeMensagens {
    public void enviarMensagem(EnvioMensagem envio, String mensagem) {
        System.out.println("Tentando enviar mensagem...");
        boolean sucesso = envio.enviar(mensagem);
        System.out.println("Status do envio: " + envio.obterStatus());
        if (sucesso) {
            System.out.println("Mensagem enviada com sucesso por " + envio.getClass().getSimpleName() + ".");
        } else {
            System.out.println("Falha ao enviar mensagem por " + envio.getClass().getSimpleName() + ".");
        }
    }
}