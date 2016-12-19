package uces.programacion3.clase03062014;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EscritorPersona {
	public void escribir(List<Persona> personas, String path) {
		FileOutputStream foo = null;
		ObjectOutputStream oos = null;
		try {
			foo = new FileOutputStream(path);
			oos = new ObjectOutputStream(foo);
			for (Persona persona : personas) {
				oos.writeObject(persona);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (foo != null) {
					foo.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public double promediar(String path) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<Persona> ps = new ArrayList<Persona>();
		int acumulador = 0;
		int cantidad = 0;
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);			
			boolean eof = false;
			while (!eof) {
				try {
					Persona p = (Persona) ois.readObject();
					ps.add(p);
					acumulador+=p.getPromedio();
					cantidad++;
					} catch (EOFException e) {
					eof = true;
					}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return acumulador/cantidad;
	}

}
