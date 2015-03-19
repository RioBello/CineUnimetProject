import java.util.*;

public class NDSalas {
    Scanner sc = new Scanner(System.in);
    
    private NDSalas prox;
    private NDSalas anterior    ;
    private String formato;
    private int capacidad;
    private PilaAsientos asientos = new PilaAsientos();
    private int numSala;
    private NCPelicula pelicula = new NCPelicula();
    private boolean disponible =true;
    
    public NDSalas(){
        
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    

    public NDSalas(String formato, int capacidad) {
        this.formato = formato;
        this.capacidad = capacidad;
    }
    
    

    public NCPelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(NCPelicula pelicula) {
        this.pelicula = pelicula;
    }

    
    public NDSalas getAnterior() {
        return anterior;
    }

    public void setAnterior(NDSalas anterior) {
        this.anterior = anterior;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
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
        CrearAsientos();
    }

    public PilaAsientos getAsientos() {
        return asientos;
    }

    public void setAsientos(PilaAsientos asientos) {
        this.asientos = asientos;
    }
    
    
    public void CrearAsientos(){
        for(int i=capacidad; i>0; i--){
            NPAsientos aux = new NPAsientos(i,false);
            //aux.mostrar();
            asientos.push(aux);
        }      
    }
    
    public void mostrar(){
        System.out.println("La sala: "+numSala+" tiene un formto: "+formato+" y una capacidad de: "+capacidad);
        pelicula.mostrar();
    }
    
    public void modificar(){
        String resp;   
        do{
            System.out.println("Indique lo que desea modificar: ");
            System.out.println("1 Formato\n2 Capacidad\n3 Elminar Pelicula");
            System.out.print("-->");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Nuevo formato: ");
                    formato=sc.next().toUpperCase();
                    mostrar();
                    break;
                case 2:
                    System.out.println("Nueva Capacidad: ");
                    capacidad=sc.nextInt();
                    mostrar();
                    break;
                case 3:
                    NCPelicula nueva = new NCPelicula();
                    pelicula=nueva;
                    mostrar();
                    break;
                    
            }
            
            System.out.println("Desea realizar otra modificacion? si/no");
            resp=sc.next().toUpperCase();
        }while (resp=="SI");
        
        
    }
    
    public void mostrarAsientos() throws Exception{
        PilaAsientos aux = new PilaAsientos();
        
        while(asientos.peek()!=null){
            asientos.peek().mostrar();
            aux.push(asientos.pop());
        }
        while(aux.peek()!=null){
            asientos.push(aux.pop());
        }
        
    }
    
    public void OcuparAsiento(NBoleto nuevo) throws Exception{
        if(asientos!=null){
            System.out.print("Asiento-->");
            int num = sc.nextInt();
            int cont=1;
            
            PilaAsientos aux = new PilaAsientos();
            mostrarAsientos();
            cont=1;
            
            while(asientos.peek().getNum()!=num){
                aux.push(asientos.pop());
            }
            
            if(!asientos.peek().isOcupado()){
                asientos.peek().setBoleto(nuevo);
                asientos.peek().setOcupado(true);
                while(aux.peek()!=null){
                    asientos.push(aux.pop());
                }
            }else{
                Exception ex = new Exception("Asiento Ocupado");
                throw ex;
            } 
            
        }else
            System.out.println("NO HAY ASIENTOS!!");
    }
    
    
}
