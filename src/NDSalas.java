/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndrésEduardo
 */
public class NDSalas {
    private NDSalas prox;
    private String formato;
    private int capacidad;
    private PilaAsientos asientos;

    public NDSalas getProx() {
        return prox;
    }

    public void setProx(NDSalas prox) {
        this.prox = prox;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public PilaAsientos getAsientos() {
        return asientos;
    }

    public void setAsientos(PilaAsientos asientos) {
        this.asientos = asientos;
    }
    
    
    public void CrearAsientos(){
        for(int i=0; i<capacidad; i++){
            NPAsientos aux = new NPAsientos(i,false);
            asientos.push(aux);
        }       
    }
    
    
    
    
}
