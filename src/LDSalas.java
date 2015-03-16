
public class LDSalas {
    private NDSalas cabeza;
    private NDSalas cola;
    
    public void LDSalas(){
        cabeza=cola=null;
    }
    public NDSalas getCabeza() {
        return cabeza;
    }

    public void setCabeza(NDSalas cabeza) {
        this.cabeza = cabeza;
    }

    public NDSalas getCola() {
        return cola;
    }

    public void setCola(NDSalas cola) {
        this.cola = cola;
    }
    
    public void mostrar(){
        if(cabeza==null)
            System.out.println("No hay salas disponibles");
        else{
            NDSalas aux = cabeza;
            while(aux!=null){
                aux.mostrar();
                aux=aux.getProx();
            }
        }
    }
    
    public void insertarSala(NDSalas nuevo) {
        if (cabeza==null) {
            cabeza = cola = nuevo;
        } else {
            if(cabeza==cola){
                nuevo.setProx(cabeza);
                cola = cabeza;
                cabeza = nuevo;
                cola.setAnterior(cabeza);
            }
            else{
                nuevo.setProx(cabeza);
                cabeza.setAnterior(nuevo);
                cabeza = nuevo;
            }   
        }
        

    }
    
}
