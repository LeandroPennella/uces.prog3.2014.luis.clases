package uces.programacion3.ordenar;

public class Ordenador {
	public void ordenar(Ordenables[] lista){
	for (int i = 0; i < lista.length-1; i++) {
		for (int j = i+1; j < lista.length; j++) {
			if (lista[j].esMenor(lista[i])){
				Ordenables aux=lista[i];
				lista[i]=lista[j];
				lista[j]=aux;
			}
		}
	}
	}

}
