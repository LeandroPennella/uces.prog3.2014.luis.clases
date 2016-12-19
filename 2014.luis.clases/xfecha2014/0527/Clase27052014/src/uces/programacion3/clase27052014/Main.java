package uces.programacion3.clase27052014;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader leoArchivo=null;
		long tiempo = System.currentTimeMillis();
		try{
			File pepe = new File("X:\\Mis Documentos\\lbravo\\lbravo.txt");
			leoArchivo =new BufferedReader (new FileReader(pepe));
			
			char[] buffer=new char[100];
			int numero=leoArchivo.read(buffer);
			while (numero!=-1){
				String texto = new String(buffer,0,numero);
				System.out.println(texto);
				numero = leoArchivo.read(buffer);
				
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(leoArchivo != null){
				try{
					leoArchivo.close();
					long tiempo2 = System.currentTimeMillis();
					System.out.println("\n"+(tiempo2-tiempo));
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}

}
