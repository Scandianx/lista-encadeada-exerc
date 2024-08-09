package pilhaGenerics;

public interface PilhaGenerics <T> {
    public boolean empilharElemento(T num);
    public boolean desempilharElemento();
    public T obterTopo();
    public boolean estaVazia();
    
}
