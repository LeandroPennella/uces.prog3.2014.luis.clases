package uces.programacion3.clase27052014;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader leoArchivo=null;
		long tiempo = System.currentTimeMillis();
		try{
			File pepe = new File("X:\\Mis Documentos\\lbravo\\lbravo.txt");
			leoArchivo = new FileReader(pepe);
			
			for (int e = leoArchivo.read(); e >= 0;e=leoArchivo.read()) {
				System.out.print((char)e);
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
