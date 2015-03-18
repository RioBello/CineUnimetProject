import java.util.*;

public class Aplicacion {
    Scanner sc = new Scanner(System.in);
    arbolPaises Pa = new arbolPaises();
    
    public void xxxxx() throws Exception{
       NSucursales sucur = new NSucursales();
       for(int i=0; i<3;i++)
       sucur.CrearSala();
       
       // for(int i=0; i<2;i++){
       NCPelicula nuevo = new NCPelicula();
       
       sucur.InsertarPeliculaSala(nuevo.CrearPelicula());
           
       //}
       sucur.CrearColaBoletos();
       
       for(int j=0; j<3; j++)
       sucur.AsignarBoleto();
       
       
       
       
      
        
    }
    
    
    public static void main(String[] args) throws Exception {
        Aplicacion app = new Aplicacion();
        app.xxxxx();
    }
    
}
