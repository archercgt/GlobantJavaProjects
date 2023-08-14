/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Archer
 */
public class Cine {
    private Pelicula pelicula;
    private double precio;
    private ArrayList<Espectador> espectadores; 
    private ArrayList<ArrayList<Asiento>> sala;
    private static Random random;
    private int asientos_libres;
    private String[] columnas; 

    public Cine() {
        sala = new ArrayList();
        espectadores = new ArrayList();
        precio = 18000;
        random = new Random();
        asientos_libres = 48;
        columnas = new String[] {"A", "B", "C", "E", "F"};
    }

    public Cine(Pelicula pelicula, double precio, ArrayList<Espectador> espectadores, ArrayList<ArrayList<Asiento>> sala, int asientos_libres) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.espectadores = espectadores;
        this.sala = sala;
        this.asientos_libres = asientos_libres;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public ArrayList<ArrayList<Asiento>> getSala() {
        return sala;
    }

    public void setSala(ArrayList<ArrayList<Asiento>> sala) {
        this.sala = sala;
    }

    public int getAsientos_libres() {
        return asientos_libres;
    }

    public void setAsientos_libres(int asientos_libres) {
        this.asientos_libres = asientos_libres;
    }

    
    public void crearEspectadores(){
        String nombre;
        int edad;
        double dinero;
        for(int i = 1; i <= 40; i++){
            nombre = crearNombreAleatorio();
            edad = random.nextInt(76) + 5;
            dinero = random.nextInt(55001) + 5000;
            Espectador espectador = new Espectador(nombre, edad, dinero);
            espectadores.add(espectador);
            System.out.println(espectador);
        }
        System.out.println("");
    }
    
    public static String crearNombreAleatorio() {
        int nameLength = random.nextInt(5) + 5; // Generate a name length between 5 and 10 characters

        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < nameLength; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase letter
            nameBuilder.append(randomChar);
        }
        return nameBuilder.toString();
    }
    
    public void crearSala(){
        for(int i = 8; i > 0; i--){
            ArrayList<Asiento> fila = new ArrayList();
            for(String columna: columnas){
                fila.add(new Asiento(i, columna, " "));
            }
            sala.add(fila);
        }
    }
    
    public void imprimirSala(){
        for(ArrayList<Asiento> fila: sala){
            for(Asiento asiento: fila){
                if(asiento.getColumna().toString().equals("F")){
                    System.out.print("" + asiento.getFila() + asiento.getColumna() + asiento.getEstado());
                }else
                    System.out.print("" + asiento.getFila() + asiento.getColumna() + asiento.getEstado() + "|");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void ubicarEspectadores(){
        for(Espectador espectador: espectadores){
            if(asientos_libres == 0){
                System.out.println("Ya no hay assientos disponibles en la sala");
                break;
            }else{
                if((espectador.getDinero() > precio) && (espectador.getEdad() > pelicula.getEdad_minima())){
                    asignarAsiento();
                }
            }
        }
    }
    
    public void asignarAsiento(){
        int fila_al = random.nextInt(sala.size());
        int colum_al = random.nextInt(sala.get(fila_al).size());
        if(sala.get(fila_al).get(colum_al).getEstado().equals(" ")){
            asientos_libres -= 1;
            sala.get(fila_al).get(colum_al).setEstado("X");
        }else{
            outerLoop: // Label for the outer loop
            for(ArrayList<Asiento> fila: sala){
                for (Asiento asiento: fila){
                    if(asiento.getEstado().equals(" ")){
                        asientos_libres -=1;
                        asiento.setEstado("X");
                        break outerLoop;
                    }
                }
            }
        }
    }
}
