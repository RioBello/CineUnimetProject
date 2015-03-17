import java.util.*;

public class Aplicacion {
    Scanner sc = new Scanner(System.in);
    arbolPaises Pa = new arbolPaises();
    
    public void xxxxx(){
       LCPeliculas listaP = new LCPeliculas();
       
       for(int i=0; i<4;i++)
           listaP.CrearPelicula();
           
       listaP.EliminarPeli().mostrar();
       
      
        
    }
    
    
    public static void main(String[] args) throws Exception {
        Aplicacion app = new Aplicacion();
        app.xxxxx();
    }
    
}
