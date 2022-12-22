package ConversorMonedasTemperatura;

import javax.swing.*;

public class OpcionesDeConversion {
	
	ConversorMonedas monedas = new ConversorMonedas();	
	
	public void ConvertirMonedas(double valorRecibido) {
		String opciones = (JOptionPane.showInputDialog(null,"Elije la moneda a convertir", "Monedas", JOptionPane.INFORMATION_MESSAGE,
				null, new Object[] {"De pesos a Dolar", "De pesos a Euros", "De pesos a Libras", "De pesos a Yen", "De pesos a Won Koreano"}, "Seleccion")).toString();
		switch(opciones) {
		case "De pesos a Dolar":
			monedas.ConvertirPesosADolar(valorRecibido);
			break;
		case "De pesos a Euros":
			monedas.ConvertirPesosAEuro(valorRecibido);
			break;
	}
  }
}
