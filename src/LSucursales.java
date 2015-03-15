import java.util.*;

public class LSucursales {
    Scanner sc = new Scanner(System.in);
   
    private NSucursales cabeza;
    
    public NSucursales getCabeza(){
        return cabeza;
    }
    
    public void mostrar(){
        NSucursales aux = cabeza;
        while(aux!= null){
            aux.mostrar();
            aux=aux.getProximo();
        }
    }
    
    public void InsertaSucursal(NSucursales nuevo){
        NSucursales aux = cabeza;
        while(aux.getProximo()!= null){
            aux=aux.getProximo();
        }
        aux.setProximo(nuevo);
    }
    
    public void eliminarSucursal(String eliminar){
        
        if(cabeza!=null){
            NSucursales aux = cabeza;
            if(cabeza.getNombre()==eliminar)
                cabeza=cabeza.getProximo();
            else{
                while(aux.getProximo().getNombre() != eliminar){
                    aux=aux.getProximo();   
                }
            }
            aux.setProximo(aux.getProximo().getProximo());    
        }
    }
    
    public void ModificarSucur(){
        NSucursales aux=cabeza;
        String nombre=sc.next().toUpper();
        
        while(aux.getNombre())
    }
    
    
}
