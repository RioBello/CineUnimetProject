import java.util.*;

public class Aplicacion {
    Scanner sc = new Scanner(System.in);
    arbolPaises Pa = new arbolPaises();
    
    public void xxxxx(){
       /* Pa.NuevoPais();

        Pa.mostrarEnOrden(Pa.getRaiz());
        
        Pa.ElPais();
        
        for(int j=0; j<3; j++)
        Pa.getEncontrado().CrearSucursal();
        
        Pa.getEncontrado().BuscarSucursal();*/
        NSucursales sucur = new NSucursales();
        for(int j=0; j<3; j++)
        sucur.CrearSala();
        
        sucur.getSalas().mostrar();
        sucur.modificar();
        
        
    }
    
    
    public static void main(String[] args) throws Exception {
        Aplicacion app = new Aplicacion();
        app.xxxxx();
    }
    
}
