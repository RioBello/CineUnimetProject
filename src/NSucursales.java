import java.util.*;

public class NSucursales {
    Scanner sc = new Scanner(System.in);
    
    private  NSucursales proximo;

    private String nombre;
    private String direccion;
    private LCPeliculas pelis;
    private LDSalas salas;
    private CBoletos entradas;
    private int contSalas=1;

    public NSucursales getProximo() {
        return proximo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public LCPeliculas getPelis() {
        return pelis;
    }

    public LDSalas getSalas() {
        return salas;
    }

    public void setProximo(NSucursales proximo) {
        this.proximo = proximo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public void setPelis(LCPeliculas pelis) {
        this.pelis = pelis;
    }

    public void setSalas(LDSalas salas) {
        this.salas = salas;
    }

    public void modificarSucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    
    public void mostrar(){
        System.out.println("Sucursal: "+nombre);
        System.out.println("Direccion: "+direccion+"/n");
    }
    
    public void CrearSala(){
        NDSalas sala = new NDSalas();
        System.out.println("Ingrese el formato de la sala: ");
        sala.setFormato(sc.next());
        System.out.println("Indique la capacidad de la sala: ");
        sala.setCapacidad(sc.nextInt());
        sala.setNumSala(Integer.toString(contSalas));
        contSalas++;
        salas.insertarSala(sala);
    }        
        
    
    
    
}
