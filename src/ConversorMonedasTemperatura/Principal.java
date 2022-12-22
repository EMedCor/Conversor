package ConversorMonedasTemperatura;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		OpcionesDeConversion monedas = new OpcionesDeConversion();
		
		String opciones = (JOptionPane.showInputDialog(null,"Seleccione una opcion de conversor", "Menu", JOptionPane.INFORMATION_MESSAGE,
				null, new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Seleccion")).toString();	//1
		switch (opciones) {//2
		case "Conversor de Monedas": {
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
			double valorRecibido = Double.parseDouble(input);	
			monedas.ConvertirMonedas(valorRecibido);
			
			int seleccion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
			if(JOptionPane.OK_OPTION == seleccion) {
				System.out.println("Selecciona opcion afirmativa");
			} else {
				JOptionPane.showMessageDialog(null, "Programa Terminado");
			}
		}
		
	}
  }
}
