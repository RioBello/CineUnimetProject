/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndrésEduardo
 */
public class CBoletos {
    private NBoleto cabeza;
    
    public CBoletos(){
        cabeza=null;
    }
    
    public NBoleto getCabeza() {
        return cabeza;
    }

    public void setCabeza(NBoleto cabeza) {
        this.cabeza = cabeza;
    }
    
    public void encolar(NBoleto nuevo){
        NBoleto aux = cabeza;
        while(aux.getProx()!=null)
            aux=aux.getProx();
        
        aux.setProx(nuevo); 
    }
    
    public NBoleto desencolar(){
        NBoleto aux= cabeza;
        cabeza=cabeza.getProx();
        aux.setProx(null);
        return aux;  
    }
    
    
    
    
    
    
}
