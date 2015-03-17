import java.util.*;

public class Aplicacion {
    Scanner sc = new Scanner(System.in);
    arbolPaises Pa = new arbolPaises();
    
    public void xxxxx(){
       NSucursales sucur = new NSucursales();
       for(int i=0; i<3;i++){
       sucur.CrearSala();
       sucur.getSalas().mostrar();
       NDSalas sala = sucur.getSalas().BuscarSala(sc.nextInt());
       sala.CrearAsientos();
       sala.mostrarAsientos();
       }
       sucur.CrearColaBoletos();
       
       
       
      
        
    }
    
    
    public static void main(String[] args) throws Exception {
        Aplicacion app = new Aplicacion();
        app.xxxxx();
    }
    
}
