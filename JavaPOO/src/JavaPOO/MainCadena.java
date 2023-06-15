/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPOO;

import Entidad.Cadena;
import java.util.Scanner;
import javafx.scene.control.TreeTableView;

/**
 *
 * @author Archer
 */
public class MainCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cadena cad = new Cadena();
        System.out.println("Ingrese una frase");
        cad.setFrase(leer.nextLine());
        cad.setLongitud(cad.getFrase().length());
        System.out.println("La cantidad de vocales en la frase es: " + cad.mostrarVocales());
        System.out.println("La frase invertida es: " + cad.invertirFrase());
        System.out.println("Ingrese una letra");
        String letraString = leer.nextLine();
        char letra = letraString.charAt(0);
        System.out.println("La cantidad de veces que se repite la letra \"" + letra + "\" en la frase es: " + cad.vecesRepetido(letra));
        System.out.println("Ingrese una nueva frase");
        String nueva_frase = leer.nextLine();
        System.out.println(cad.compararLongitud(nueva_frase));
        System.out.println("La union de frases da como resultado: " + cad.unirFrases(nueva_frase));
        System.out.println("La frase reemplazada es: " + cad.reemplazar(letraString));
        System.out.println("Se valida si la letra se encuentra en la frase y se obtiene un resultado: " + cad.contiene(letraString));
    }
    
}
