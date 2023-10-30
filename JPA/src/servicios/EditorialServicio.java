/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Editorial;
import java.util.Scanner;
import persistencia.EditorialDAO;

/**
 *
 * @author Archer
 */
public class EditorialServicio extends Servicio {

    private final EditorialDAO editorialDAO = new EditorialDAO();

    @Override
    public void crear(Scanner scanner) throws Exception {
        Editorial editorial = new Editorial();
        System.out.println("Ingrese el nombre de la editorial a almacenar");
        try {
            String nombre = validarInput(scanner);
            if (editorialDAO.validarEditorial(nombre)) {
                throw new Exception("Error: La editorial ya existe!!!");
            }
            editorial.setNombre(nombre);
            editorial.setAlta(true);
            editorialDAO.guardar(editorial);
            System.out.println("Editorial almacenado con éxito!!!");
            System.out.println("");
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void consultar(Scanner scanner) throws Exception {
        final String[] mensaje = {
            "Indique la opción para realizar la búsqueda:",
            "1. Buscar por ID",
            "2. Buscar por Nombre",
            ""
        };
        for (String line : mensaje) {
            System.out.println(line);
        }

        String opcion = validarInput(scanner);
        switch (opcion) {
            case "1":
                System.out.println("Ingrese el ID");
                int id = Integer.valueOf(validarInput(scanner));
                System.out.println(editorialDAO.consultarPorId(id));
                System.out.println("");
                break;
            case "2":
                System.out.println("Ingrese el nombre");
                String nombre = validarInput(scanner);
                System.out.println(editorialDAO.consultarPorNombre(nombre));
                System.out.println("");
                break;
            default:
                System.out.println("Opción ingresada incorrecta");
                System.out.println("");
        }
    }

    @Override
    public void modificar(Scanner scanner) throws Exception {
        System.out.println("Ingrese el ID de la editorial que desea validar");
        int id = Integer.valueOf(validarInput(scanner));
        Editorial editorial = editorialDAO.consultarPorId(id);
        final String[] mensaje = {
            "Indique la opción según la modificación que desee hace sobre la editorial;",
            "1. Dar de alta/baja",
            "2. Modificar el nombre"
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        String opcion = validarInput(scanner);
        switch (opcion) {
            case "1":
                System.out.println("Seleccione según desee dar de alta o de baja la editorial");
                System.out.println("1. Alta");
                System.out.println("2. Baja");
                String opcion2 = validarInput(scanner);
                switch (opcion2) {
                    case "1":
                        editorial.setAlta(true);
                        break;
                    case "2":
                        editorial.setAlta(false);
                        break;
                }
                break;
            case "2":
                System.out.println("Ingrese el nuevo nombre que tendrá la editorial");
                String nombre = validarInput(scanner);
                editorial.setNombre(nombre);
                break;
            default:
                System.out.println("La opción ingresada es invalida");
        }
        editorialDAO.editar(editorial);
        System.out.println("Editorial modificada con éxito");
        System.out.println("");
    }
    

//    public void eliminar(Scanner scanner) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
