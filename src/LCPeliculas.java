
public class LCPeliculas {
    private NCPelicula cabeza;

    public NCPelicula getCabeza() {
        return cabeza;
    }

    public void setCabeza(NCPelicula cabeza) {
        this.cabeza = cabeza;
    }
    
    public void mostrar(){
        if(cabeza!=null){
            NCPelicula aux = cabeza;
            if(aux.getProx()==cabeza)
                aux.mostrar();
            else{
                while (aux.getProx()!=cabeza){
                  aux.mostrar();
                 aux=aux.getProx();
                }
        }
        }else
            System.out.println("No hay peliculas disponibles");
    }
    
    public void insertarPeli(NCPelicula nuevo){
        if(cabeza==null){
            cabeza=nuevo;
            cabeza.setProx(cabeza);
            cabeza.setAnterior(cabeza);
        }else{
            NCPelicula aux = cabeza.getAnterior();
            aux.setProx(nuevo);
            nuevo.setProx(cabeza);
            nuevo.setAnterior(aux);
            cabeza.setAnterior(nuevo);
        }
    }
    
    
    
}
