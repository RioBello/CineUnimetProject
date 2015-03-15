
public class NPAsientos {
    private int num;
    private NPAsientos prox;
    private boolean acupado;

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

    public boolean isAcupado() {
        return acupado;
    }

    public void setAcupado(boolean acupado) {
        this.acupado = acupado;
    }

    public NPAsientos(int num, boolean acupado) {
        this.num = num;
        this.acupado = acupado;
    }
    
    
    
    
}
