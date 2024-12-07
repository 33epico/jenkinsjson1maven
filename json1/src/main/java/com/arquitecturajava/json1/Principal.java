package com.arquitecturajava.json1;

public class Principal {

	public static void main(String[] args) {
		String json = "{\"nombre\":\"eduardo\"}";
		LeerJSonPersona leer = new LeerJSonPersona();
		Persona p = leer.getPersona(json);
		System.out.println("leido: "+p.getNombre());

	}

}
