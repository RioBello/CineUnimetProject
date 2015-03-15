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
    private NDSalas anterior;
    private String formato;
    private int capacidad;
    private PilaAsientos asientos;
    private String numSala;

    public NDSalas getAnterior() {
        return anterior;
    }

    public void setAnterior(NDSalas anterior) {
        this.anterior = anterior;
    }

    public String getNumSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }
    
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
    
    public void mostrar(){
        System.out.println("La sala: "+numSala+" tiene un formto: "+formato+" y una capacidad de: "+capacidad);
    }
    
    
    
    
}
