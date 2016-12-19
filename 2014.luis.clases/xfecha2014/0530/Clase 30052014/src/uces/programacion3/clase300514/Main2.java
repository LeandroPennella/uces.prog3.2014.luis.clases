package uces.programacion3.clase300514;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Archivo de entrada binario
		//Archivo de salida binario
		//Copiar con buffered inputStream y buffered outputStream
		InputStream leoFoto = null;
		OutputStream escriboFoto = null;
		int uno = 1;
		try {									
			leoFoto=new BufferedInputStream(new FileInputStream("X:\\Alumno\\Documents\\Lbravo\\antes\\foto.jpg")); 
			escriboFoto = new BufferedOutputStream(new FileOutputStream("X:\\Alumno\\Documents\\Lbravo\\despues\\foto.jpg"));
			int a = leoFoto.read();
			while (a>=0) {
				escriboFoto.write(a);
				a = leoFoto.read();
			}
			escriboFoto.flush();
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			if(leoFoto !=null){
				try{
					leoFoto.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			} 
			if (escriboFoto != null){
				try{
					escriboFoto.close();
				}catch (IOException e){
					e.printStackTrace();				}
			}
			// Un bloque if preguntando por cada uno de las operaciones sobre archivos.
		}
		
	}

}
