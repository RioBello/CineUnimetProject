import java.util.*;

public class Aplicacion {
    Scanner sc = new Scanner(System.in);
    arbolPaises Pa = new arbolPaises();
    
    public void xxxxx(){
        Pa.NuevoPais();

        Pa.mostrarEnOrden(Pa.getRaiz());
        
        Pa.ElPais();
        
        for(int j=0; j<2; j++)
        Pa.getEncontrado().CrearSucursal();
        
        Pa.getEncontrado().getSucursales().mostrar();
        
        Pa.getEncontrado().BuscarSucursal();
        Pa.getEncontrado().getEncontrado().mostrar();
    }
    
    
    public static void main(String[] args) throws Exception {
        Aplicacion app = new Aplicacion();
        app.xxxxx();
    }
    
}
