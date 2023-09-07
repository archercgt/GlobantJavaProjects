/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Archer
 */
public abstract class ExtraHotelero extends Alojamiento{
    protected boolean privado;
    protected int metros_cuadrados;

    public ExtraHotelero() {
    }
    
    public ExtraHotelero(boolean privado, int metros_cuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros_cuadrados = metros_cuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(int metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }
    
    
    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("Indique si se trata de un alojamiento privado s/n ");
        String respuesta = leer.next().toLowerCase();
        if(respuesta.equals("s"))
            privado = true;
        if(respuesta.equals("n"))
            privado = false;
        System.out.println("Ingrese la cantidad de metros cuadrados");
        metros_cuadrados = leer.nextInt();
    }
    
}
