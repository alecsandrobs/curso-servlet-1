package br.com.alecsandro.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Long id = 1L;

	static {
		lista.add(new Empresa(id++, "Motorola"));
		lista.add(new Empresa(id++, "Xiaomi"));
		lista.add(new Empresa(id++, "Samsung"));
		lista.add(new Empresa(id++, "Apple"));
		lista.add(new Empresa(id++, "JBL"));
		lista.add(new Empresa(id++, "Lenovo"));
		lista.add(new Empresa(id++, "Canon"));
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(id++);
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return lista;
	}

	public void remove(Long id) {

		Iterator<Empresa> iterator = lista.iterator();

		while (iterator.hasNext()) {
			Empresa empresa = iterator.next();
			if (empresa.getId() == id) {
				iterator.remove();
			}
		}
	}

	public Empresa getById(Long id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

}
