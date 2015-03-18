import java.util.*;
import java.math.*;

public class arbolPaises {
    Scanner sc = new Scanner(System.in);
    Random rdm = new Random();
    boolean existe=false;
    private NodoPais encontrado = new NodoPais(); 
    
    private NodoPais raiz = new NodoPais();
    
    public arbolPaises(){
        raiz=null;
    }
    
    public arbolPaises(NodoPais raiz){
        this.raiz=raiz;
    }
    
    public void setRaiz(NodoPais raiz){
        this.raiz=raiz;
    }
    
    public NodoPais getRaiz(){
        return raiz;
    }
    
    public boolean vacio(){
        return raiz==null;
    }
    
    // Recorrido Pre-Orden del ABB. Se usa, se va por la izquierda y luego por la derecha
    public void mostrarPreOrden(NodoPais aux){
        if(aux!=null){
            aux.mostrar();
            mostrarPreOrden(aux.getIzq());
            mostrarPreOrden(aux.getDer()); 
        }
    }
    
    // Recorrido En-Orden del ABB. Se va por la izquierda, se usa y luego por la derecha
    public void mostrarEnOrden(NodoPais aux){
        if(aux!=null){
            mostrarEnOrden(aux.getIzq());
            aux.mostrar();
            mostrarEnOrden(aux.getDer()); 
        }
    }
    
    // Recorrido Post-Orden del ABB. Se va por la izquierda, luego por la derecha y se usa
    public void mostrarPostOrden(NodoPais aux){
        if(aux!=null){
            mostrarPostOrden(aux.getIzq());
            mostrarPostOrden(aux.getDer()); 
            aux.mostrar();
        }
    }
    // Metodo que inserta el nodo nuevo recibido por parametro, en el ABB (en su posicion respectiva)
    public void Insertar(NodoPais aux, NodoPais nuevo)
    {
        if (vacio())
            raiz = nuevo;
	else if (nuevo.getPosicion()<aux.getPosicion())
	{
            if (aux.getIzq()== null)
		aux.setIzq(nuevo);
            else
                Insertar(aux.getIzq(), nuevo);   
        }
	else if (nuevo.getPosicion()>aux.getPosicion())
	{
            if (aux.getDer()== null)
		aux.setDer(nuevo);  
            else
		Insertar(aux.getDer(), nuevo);
        }
        else{
            System.out.println("Posicion repetida, ingrese otro numero: ");
            nuevo.setPosicion(sc.nextInt());
        }
    }
    // Metodo que pone en nulo, el hijo izquierdo de aux (subarbol izquierdo)
    public void suprimeHijoIzquierdo(NodoPais aux){
        if(aux!=null){
            aux.setIzq(null);
        }
    }
    // Metodo que pone en nulo, el hijo derecho de aux (subarbol derecho)
    public void suprimeHijoDerecho(NodoPais aux){
        if(aux!=null){
            aux.setDer(null);
        }
    }
    
    // Metodo que retorna la cantidad de nodos presentes en el arbol
    public int contarNodos(NodoPais aux){
        if(aux==null)
            return 0;
        else
            return 1 + contarNodos(aux.getIzq())+contarNodos(aux.getDer());   
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Random getRdm() {
        return rdm;
    }

    public void setRdm(Random rdm) {
        this.rdm = rdm;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public NodoPais getEncontrado() {
        return encontrado;
    }

    public void setEncontrado(NodoPais encontrado) {
        this.encontrado = encontrado;
    }
    
    
    
    public void CompararPos (NodoPais aux, int num){
        
        if(aux!=null){
            CompararPos(aux.getIzq(), num);
            if(num==aux.getPosicion()){
                existe=true;
              //  System.out.println("Numero repetido");
            }
            CompararPos(aux.getDer(), num); 
        }
    }
    
    public void CompararNom(NodoPais aux, String nombre){
        if(aux!=null){
            CompararNom(aux.getIzq(), nombre);
            if(aux.getNombrePais().toUpperCase().equals(nombre.toUpperCase())){
                existe=true;
                System.out.println("-Pais ya existente, intentelo de nuevo-");
            }
            CompararNom(aux.getDer(), nombre); 
        }
    }
    
    
    public void NuevoPais(){
        
        NodoPais aux = new NodoPais();
        NodoPais ra = raiz;
       // System.out.println("Indique el numero del pais: ");
        if(raiz==null)
            aux.setPosicion(100);
        else{
            int num;
            do{
                existe=false;
                num=rdm.nextInt(200);
                CompararPos(ra, num);             
            }while(existe!=false);
            
            aux.setPosicion(num);
        }
        
        System.out.println("Indique el nombre del pais");
        String nom;
        do{
          existe=false;
          nom=sc.next();
          CompararNom(ra, nom);
        }while(existe!=false);
        
        aux.setNombrePais(nom.toUpperCase());
        Insertar(ra , aux);
    }
    
    
    public void BuscarPais(NodoPais aux, int num){
        encontrado=null;
        if(aux!= null){
            BuscarPais(aux.getIzq(), num);
            if(aux.getPosicion()==num)
                encontrado=aux;
            BuscarPais(aux.getDer(), num);
        }
        
    }
    
    public void ElPais(){
        NodoPais ra = raiz;
        System.out.println("Indique el numero del pais: ");
        BuscarPais(ra,sc.nextInt());
        System.out.println("El pais a buscar es: ");
        encontrado.mostrar();
    }
    
}
