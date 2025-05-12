package src.questao15;

public class Main {
    public static void main(String[] args) {
        SistemaAutonomo sistema = new SistemaAutonomo();

        ControleCarro controleCarro = new ControleCarro();
        System.out.println("--- Carro Autônomo ---");
        System.out.println(sistema.navegar(controleCarro, "Shopping", 60.0));
        System.out.println(sistema.navegar(controleCarro, "", -10.0));

        ControleDrone controleDrone = new ControleDrone();
        System.out.println("\n--- Drone Autônomo ---");
        System.out.println(sistema.navegar(controleDrone, "Pico da Montanha", 30.0));
        System.out.println(sistema.navegar(controleDrone, null, 40.0));

        ControleNavio controleNavio = new ControleNavio();
        System.out.println("\n--- Navio Autônomo ---");
        System.out.println(sistema.navegar(controleNavio, "Ilha Deserta", 15.0));
        System.out.println(sistema.navegar(controleNavio, "Porto Seguro", -5.0));
    }
}
