
public class PilaAsientos {
    private NPAsientos cabeza = new NPAsientos();
    
    public PilaAsientos(){
        cabeza=null;
    }
    public NPAsientos peek(){
        return cabeza;
    }
    
    public void push(NPAsientos nuevo){
        if(cabeza==null)
            cabeza=nuevo;
        else{
            nuevo.setProx(cabeza);
            cabeza=nuevo;
        }
    }
    
    public NPAsientos pop(){
        NPAsientos eliminado = null;
        if(cabeza!=null){
            eliminado=cabeza;
            cabeza=cabeza.getProx();
            eliminado.setProx(null);
        }
        return eliminado;
    }
    
    public void mostrar(){
        
    }
    
    
}
