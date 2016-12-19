package uces.programacion3.clase300514;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream tres=null;
		
		try{
			tres=new DataInputStream(new BufferedInputStream(new FileInputStream("X:/Alumno/Documents/Lbravo/despues/bits")));
			ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();
			boolean a = true; 
			while (a){
				try{
					Alumnos.add(new Alumno(tres.readUTF(),tres.read(),tres.readDouble()));
				}catch (IOException w){
					a = false;
				}
			}
			
			for (Alumno alumno : Alumnos) {
				System.out.println(alumno.getNombre()+" "+alumno.getEdad()+" "+alumno.getPromedio());
			}
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
