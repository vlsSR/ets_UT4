package controller;

import model.Prisma;
import model.PrismaManager;
import view.Console;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Controlador del programa
 */
public class Controller {
    private PrismaManager model;
    private Console view;

    /**
     * Logica principal del programa, primero crea una lista de prismas y la rellena, luego muestra los datos
     * @param model PrismaManager para gestionar los prismas
     * @param view Console para gestionar la vista por consola
     */
    public Controller(PrismaManager model, Console view) {
        this.model = model;
        this.view = view;
        ArrayList<Prisma> prismas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            prismas.add(model.generarPrisma());
        }

        view.mostrarInicio();
        for (Prisma prisma : prismas) {
            view.mostrarPrisma(prisma.getBaseTriangulo(), prisma.getAlturaPrisma(), prisma.areaTotal());
        }
        Collections.sort(prismas);
        for (Prisma prisma : prismas) {
            view.imprimir(prisma.toString());
        }
    }


}
