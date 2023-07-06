package br.jus.tjes;

public class App {

    public static void main(String[] args) {
        //Log.getLogger().info("Hello World Log");
        System.out.println("Antes da chamada do Log e exceção");
        Controller controller = new Controller();

        controller.iniciar();

        System.out.println("Depois da chamada do Log e exceção");
    }
}
