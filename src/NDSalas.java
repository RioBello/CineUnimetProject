import java.util.*;

public class NDSalas {
    Scanner sc = new Scanner(System.in);
    
    private NDSalas prox;
    private NDSalas anterior;
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
            System.out.println("1 Formato\n2 Capacidad");
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
            }
            
            System.out.println("Desea realizar otra modificacion? si/no");
            resp=sc.next().toUpperCase();
        }while (resp=="SI");
        
        
    }
    
    public void mostrarAsientos() throws Exception{
        PilaAsientos aux = asientos;
        while(aux.peek()!=null){
            aux.pop().mostrar();
        }
    }
    
    public void OcuparAsiento(NBoleto nuevo) throws Exception{
        int num = sc.nextInt();
        PilaAsientos aux = new PilaAsientos();
        PilaAsientos rec = asientos;
        
        while(rec.peek().getNum()!=num){
            aux.push(rec.pop());
        }
        if(!rec.peek().isOcupado()){
            rec.peek().setBoleto(nuevo);
            while(aux.peek()!=null){
                rec.push(aux.pop());
            }
            
        }else{
            Exception ex = new Exception("Asiento Ocupado");
            throw ex;
        } 
    }
    
    
}
