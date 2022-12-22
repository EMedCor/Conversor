package ConversorMonedasTemperatura;

import javax.swing.JOptionPane;

public class ConversorMonedas {

	public void ConvertirPesosADolar(double valorRecibido) {//3
		double monedaDolar = valorRecibido / 4801.53;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son $ "  + monedaDolar + " Dolares.");
	}
	public void ConvertirPesosAEuro(double valorRecibido) {//4
		double monedaEuro = valorRecibido / 5068.89;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son $ "  + monedaEuro + " Euros.");
	
	}
}
