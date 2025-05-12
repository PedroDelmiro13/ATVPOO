package src.questao11;

public class Main {
    public static void main(String[] args) {
        GestorDeMensagens gestor = new GestorDeMensagens();

        EnviarEmail email = new EnviarEmail();
        gestor.enviarMensagem(email, "Olá por e-mail!");

        System.out.println("\n---");

        EnviarSMS sms = new EnviarSMS();
        gestor.enviarMensagem(sms, "Olá por SMS!");

        System.out.println("\n---");

        EnviarWhatsapp whatsapp = new EnviarWhatsapp();
        gestor.enviarMensagem(whatsapp, "Olá por WhatsApp!");
    }
}
