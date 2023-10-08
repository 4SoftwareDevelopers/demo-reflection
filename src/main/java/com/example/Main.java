package com.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
	
	public static void main(String[] args) {
		try {
            Class<?> cls = Class.forName("com.example.Persona");
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
            
            Object newInstance = constructor.newInstance("4SD");
            
            System.out.println("Metodos de la clase");
            for (Method method: cls.getDeclaredMethods()) {
				System.out.println(method.getName());
			}
            
            Method privateMethod = cls.getDeclaredMethod("mostrarMensajePrivado");
            
            privateMethod.setAccessible(true);
            privateMethod.invoke(newInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
