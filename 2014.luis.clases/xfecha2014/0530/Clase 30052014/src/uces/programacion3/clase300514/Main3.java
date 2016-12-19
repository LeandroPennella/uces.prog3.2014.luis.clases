package uces.programacion3.clase300514;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno p1 = new Alumno("Jorge",34,7.5);
		Alumno p2 = new Alumno("Daniel",28,9.5);
		Alumno p3 = new Alumno("Matias",19,5.4);
		
		DataOutputStream dos = null;
		
		
		try{
			dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("X:/Alumno/Documents/Lbravo/despues/bits")));
			dos.writeUTF(p1.getNombre());
			dos.write(p1.getEdad());
			dos.writeDouble(p1.getPromedio());
			dos.writeUTF(p2.getNombre());
			dos.write(p2.getEdad());
			dos.writeDouble(p2.getPromedio());
			dos.writeUTF(p3.getNombre());
			dos.write(p3.getEdad());
			dos.writeDouble(p3.getPromedio());
			dos.flush();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			if (dos !=null){
				try{
				dos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
	}

}
