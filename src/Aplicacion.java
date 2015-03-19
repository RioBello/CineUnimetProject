import java.util.*;

public class Aplicacion {
    Scanner sc = new Scanner(System.in);
    arbolPaises Pa = new arbolPaises();
    
    public void xxxxx() throws Exception{
       NSucursales sucur = new NSucursales();
       for(int i=0; i<1;i++)
       sucur.CrearSala();
       
       for(int i=0; i<1;i++)
       sucur.CrearPelicula();
      
       sucur.getSalas().modificar();
       
       
       sucur.CrearColaBoletos();
       
        System.out.println("--------------------------------");
        
      for(int j=0; j<4; j++)
       sucur.AsignarBoleto();
       
      
       
    }
    
    
    public static void main(String[] args) throws Exception {
        Aplicacion app = new Aplicacion();
        app.xxxxx();
    }
    
}
