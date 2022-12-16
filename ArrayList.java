import java.util.Scanner;

public class ArrayList implements List {

	// Declarando um Array e o seu tamanho.
	int[] data = new int[1000];

	//Variável inteira do indice ou posição.
	int quantity = 0;

	//Método Inserir ou adicionar um valor no Array.
	public void add(int value) {//Declarando o método e o seu retorno.
		data[quantity] = value;//Declarando que value vai ser 0 assim como o valor da posição do Array
		quantity++;//Somando quantity ( quantity = indice ou posição do Array) + 1.
	}

	//Metódo Remover valor do Array
	public void remove(int value) {
		int foundIndex = -1;
		//procurar
		for (int i = 0; i < quantity; i++) {
			if (data[i] == value) {
				foundIndex = i;
				break;
			}
		}

		if (foundIndex == -1) {// se o indice continua -1, então não achou
			return;
		}

		//copia por cima do elemento que queremos remover
		int lastIndex = quantity - 1;
		for (int i = foundIndex; i < lastIndex; i++) {
			data[i] = data[i + 1];
		}

		quantity--;
	}


	public String show() {
		String output = "";
		int i = 0;
		while (i < quantity) {
			output = output + " " + data[i];
			i++;
		}
		return output;
	}

	public void update(int position, int value) {
		int index = position - 1;

		if (index < 0 || index >= quantity) {
			return;
		}

		this.data[index] = value;
	}

	public int size() {
		return quantity;
	}

	public boolean search(int value) {
		for (int i = 0; i < quantity; i++) {
			if (this.data[i] == value) {
				return true;
			}
		}
		return false;
	}






