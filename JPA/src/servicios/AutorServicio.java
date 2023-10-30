/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Autor;
import java.util.Scanner;
import persistencia.AutorDAO;

/**
 *
 * @author Archer
 */
public class AutorServicio extends Servicio {

    private final AutorDAO autorDAO = new AutorDAO();

    @Override
    public void crear(Scanner scanner) throws Exception {
        Autor autor = new Autor();
        System.out.println("Ingrese el nombre del autor a almacenar");
        try {
            String nombre = validarInput(scanner);
            if (autorDAO.validarAutor(nombre)) {
                throw new Exception("Error: El autor ya existe!!!");
            }
            autor.setNombre(nombre);
            autor.setAlta(true);
            autorDAO.guardar(autor);
            System.out.println("Autor almacenado con éxito!!!");
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
                System.out.println(autorDAO.consultarPorId(id));
                System.out.println("");
                break;
            case "2":
                System.out.println("Ingrese el nombre");
                String nombre = validarInput(scanner);
                System.out.println(autorDAO.consultarPorNombre(nombre));
                System.out.println("");
                break;
            default:
                System.out.println("Opción ingresada incorrecta");
                System.out.println("");
        }
    }

    @Override
    public void modificar(Scanner scanner) throws Exception{
        System.out.println("Ingrese el ID del autor a modifcar");
        int id = Integer.valueOf(validarInput(scanner));
        Autor autor = autorDAO.consultarPorId(id);
        final String[] mensaje = {
            "Indique la opción según la modificación que desee hace sobre el autor;",
            "1. Dar de alta/baja",
            "2. Modificar el nombre"
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        String opcion = validarInput(scanner);
        switch (opcion) {
            case "1":
                System.out.println("Seleccione según desee dar de alta o de baja el autor");
                System.out.println("1. Alta");
                System.out.println("2. Baja");
                String opcion2 = validarInput(scanner);
                switch (opcion2) {
                    case "1":
                        autor.setAlta(true);
                        break;
                    case "2":
                        autor.setAlta(false);
                        break;
                }
                break;
            case "2":
                System.out.println("Ingrese el nuevo nombre que tendrá el autor");
                String nombre = validarInput(scanner);
                autor.setNombre(nombre);
                break;
            default:
                System.out.println("La opción ingresada es invalida");
        }
        autorDAO.editar(autor);
        System.out.println("Autor modificado con éxito");
        System.out.println("");
    }

    @Override
    public void eliminar() {
    }

//    public void eliminar(Scanner scanner, EntityManager em) throws Exception {
//        Autor autor = consultar(scanner, em);
//        em.getTransaction().begin();
//        em.remove(autor);
//        em.getTransaction().commit();
//        System.out.println("Autor eliminado con éxito");
//        System.out.println("");
//    }
//
}
