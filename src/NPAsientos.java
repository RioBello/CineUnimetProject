
public class NPAsientos {
    private int num;
    private NPAsientos prox;
    private boolean ocupado = false;

    
    public NPAsientos()
    {
        
    }
    
    public NPAsientos getProx() {
        return prox;
    }

    public void setProx(NPAsientos prox) {
        this.prox = prox;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public NPAsientos(int num, boolean ocupado) {
        this.num = num;
        this.ocupado = ocupado;
    }
    
    
    
    
}
