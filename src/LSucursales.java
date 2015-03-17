import java.util.*;

public class LSucursales {
    Scanner sc = new Scanner(System.in);
   
    private NSucursales cabeza;
    
    public LSucursales(){
        cabeza=null;
    }
    
    public NSucursales getCabeza(){
        return cabeza;
    }
    
    public void mostrar(){
        NSucursales aux = cabeza;
        System.out.println("Las Socursales son:");
        System.out.println("------------------");
        while(aux!= null){
            aux.mostrar();
            aux=aux.getProximo();
        }
    }
    
    public void InsertaSucursal(NSucursales nuevo){
        if(cabeza==null)
            cabeza=nuevo;
        else{
            NSucursales aux = cabeza;
            while(aux.getProximo()!= null){
                aux=aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
    }
    
    public void eliminarSucursal(String eliminar){
        
        if(cabeza!=null){
            NSucursales aux = cabeza;
            if(cabeza.getNombre().equals(eliminar))
                cabeza=cabeza.getProximo();
            else{
                while(!aux.getProximo().getNombre().equals(eliminar)){
                    aux=aux.getProximo();   
                }
            }
            aux.setProximo(aux.getProximo().getProximo());    
        }
    }
    
    public void ModificarSucur(){
        NSucursales aux=cabeza;
        String nombre=sc.nextLine().toUpperCase();
        
        while(!aux.getNombre().equals(nombre)){
            aux=aux.getProximo();
        }
        aux.modificar();
    }
}    
   
    
