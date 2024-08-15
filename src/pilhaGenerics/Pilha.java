package pilhaGenerics;

public interface Pilha <TIPO_GENERICO>{
	
	void push(TIPO_GENERICO dado);
	
	public TIPO_GENERICO pop();
	
	public TIPO_GENERICO getTop();
	
	public boolean isEmpty();
	
	@Override
	public String toString();

}

