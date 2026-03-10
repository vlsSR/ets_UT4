package controller;

import model.PrismaManager;
import view.Console;

/**
 * Punto de entrada del programa
 */
public class Main {
    /**
     * Funcion main, instancia un PrismaManager y una vista de Console para el controlador
     * @param args
     */
    public static void main(String[] args) {
        PrismaManager model = new PrismaManager();
        Console view = new Console();
        Controller controller = new Controller(model, view);
    }
}
