package com.example;

public class Persona {

	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	private void mostrarMensajePrivado() {
		System.out.println("¡Hola, soy un método privado!");
	}
}
