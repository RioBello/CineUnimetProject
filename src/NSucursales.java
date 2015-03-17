 import java.util.*;

public class NSucursales {
    Scanner sc = new Scanner(System.in);
    
    private  NSucursales proximo;

    private String nombre;
    private String direccion;
    private LCPeliculas pelis = new LCPeliculas();
    private LDSalas salas = new LDSalas();
    private CBoletos entradas = new CBoletos();
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
    
    
    public void mostrar(){
        System.out.println("Sucursal: "+nombre);
        System.out.println("Direccion: "+direccion);
    }
    
    public void CrearSala(){
        NDSalas sala = new NDSalas();
        System.out.println("Ingrese el formato de la sala: ");
        sala.setFormato(sc.next().toUpperCase());
        System.out.println("Indique la capacidad de la sala: ");
        sala.setCapacidad(sc.nextInt());
        sala.setNumSala(contSalas);
        contSalas++;
        salas.InsertarSala(sala);
    }        
   
    
    
    public void modificar(){
        String resp;
        do{
            System.out.println("Que desea modificar: ");
            System.out.println("1 Nombre\n2 Direccion\n3 Peliculas\n4 Salas");
            System.out.print("-->");
            int i=sc.nextInt();
            switch(i){
              case 1:
                  System.out.print("Ingrese el nuevo nombre:");
                  sc.nextLine();
                  nombre=sc.nextLine().toUpperCase();
                  System.out.println("!Nombre Cambiado!");
                  mostrar();
                  break;
              case 2: 
                  System.out.println("Ingrese la nueva direccion: ");
                  sc.nextLine();
                  direccion=sc.nextLine();
                  System.out.println("!Direccion cambiada!");
                  mostrar();
                  break;
              case 3:
                  pelis.modificar();
                  break;
              case 4:
                  salas.modificar();
                  break;
            }
            
           System.out.println("Desea modificar algo mia: si/no ");
           resp=sc.nextLine().toUpperCase();
           
        }while(resp.equals("SI"));
    }
   
    public void AsignarPeliculaSala(NCPelicula pelicula)
    {
         NDSalas nodo = salas.getCabeza();
         int resp=0;
         while(nodo.getProx()!=null && resp==0)
         {
             if(nodo.getFormato().equals(pelicula.getFormato()) && nodo.getPelicula()==null)
             {
                 nodo.setPelicula(pelicula);
                 resp=1;
             }
             else if(nodo.getPelicula()!=null)
             {
                 System.out.println("La sala ya posee una pelicula");
                 resp = 0;
             }
             else if (nodo.getProx()==null)
             {
                 System.out.println("El formato de pelicula no coincide.");
                 
             }
             nodo = nodo.getProx();
         }
         
    }
     
    public void CrearColaBoletos()
    {
        NDSalas aux =salas.getCabeza();
        int cont=0;
         
        while(aux!=null){
            for(int j=0; j<aux.getCapacidad();j++){
                NBoleto nuevo = new NBoleto();
                cont++;
                nuevo.setNum(cont);
                
                entradas.encolar(nuevo); 
            }
                 
            aux=aux.getProx();
            
        }
        System.out.println("TOTAL DE : "+cont);
        
        NBoleto cab = entradas.getCabeza();
         
        for(int i=0;i<cont;i++){
            System.out.println("~"+cab.getNum()+"~");
            cab = cab.getProx();
        }
        
    }
        
    
    
    
}
