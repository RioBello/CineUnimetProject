import java.util.*;

public class Aplicacion {
    Scanner sc = new Scanner(System.in);
    arbolPaises Pa = new arbolPaises();
    
    public void xxxxx(){
        for(int i=0; i<4; i++){
            Pa.NuevoPais();
        }
        
        Pa.mostrarEnOrden(Pa.getRaiz());
        
        Pa.ElPais();
    }
    
    
    public static void main(String[] args) throws Exception {
        Aplicacion app = new Aplicacion();
        app.xxxxx();
    }
    
}
