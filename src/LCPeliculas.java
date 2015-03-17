import java.util.*;

public class LCPeliculas {
    Scanner sc = new Scanner(System.in);
    
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
                do{
                 aux.mostrar();
                 aux=aux.getProx();
                }while (aux!=cabeza);
            }
        }else
            System.out.println("No hay peliculas disponibles");
    }
    
    public void insertarPeli(NCPelicula nuevo){
        if(cabeza==null){
            cabeza=nuevo;
            cabeza.setProx(cabeza);
        }else{
            NCPelicula aux = cabeza;
            while(aux.getProx()!=cabeza)
                aux = aux.getProx();
            
            nuevo.setProx(cabeza);
            aux.setProx(nuevo);
        }   
    }
    
    public void modificar()
    {
        BuscarPeli().modificar();
    }
    
    public int ContarPeliculas()
    {
        NCPelicula aux = cabeza;
        int cont = 0;
        while(aux.getProx()!=cabeza)
        {
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }
    
    
    public void CrearPelicula(){
        NCPelicula nuevo = new NCPelicula();
        System.out.println("Ingrese el Titulo: ");
        nuevo.setTitulo(sc.nextLine().toUpperCase());
        System.out.println("Ingrese el director: "); 
        nuevo.setDirector(sc.nextLine());
        System.out.println("Ingrese el ano del filme: ");
        nuevo.setAno(sc.nextLine());
        System.out.println("Ingrese el formato del filme");
        nuevo.setFormato(sc.nextLine().toUpperCase());
        insertarPeli(nuevo);
    }
    
    public NCPelicula BuscarPeli(){
        NCPelicula aux = cabeza;
        mostrar();
        System.out.println("Ingrese el nombre a BUSCAR: ");
        String nom=sc.nextLine().toUpperCase();
        while(!aux.getTitulo().equals(nom)){
            aux=aux.getProx();
        }
        return aux;
    }

    public NCPelicula EliminarPeli(){
        
        NCPelicula aux = cabeza;
        NCPelicula elim;
        System.out.println("METODO ELIMINAR");
        mostrar();
        System.out.println("Ingrese la pelicula a eliminar");
        String nom=sc.nextLine().toUpperCase();
        if(cabeza.getTitulo().equals(nom)){
            if(cabeza.getProx()==null)
                return cabeza;
            else{
                elim=cabeza;
                cabeza=cabeza.getProx();
                elim.setProx(null);
            }
                
        }else{
            
            while(!aux.getProx().getTitulo().equals(nom))
                aux=aux.getProx();

            elim=aux.getProx();
            aux.setProx(aux.getProx().getProx());
            elim.setProx(null);
            
        }
       
       mostrar();
       return elim;
    }

}
