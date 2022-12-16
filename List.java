import java.util.Scanner;

	//CRUD: Create, Read, Update, Delete-----------------------------
public interface List {
	public void add(int value);
	
	public void remove(int value);
	
	public String show();
	
	public void update(int position, int value);
	
	public int size();

	//Método de Busca-------------------------------------------------------/

	public boolean search(int value);

}
