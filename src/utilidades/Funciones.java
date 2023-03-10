package utilidades;

import excepciones.AnioDebeSerPositivoException;
import excepciones.DatosDebenSerPositivosException;

public class Funciones {
	
	public static boolean esBisiesto (int anio) throws AnioDebeSerPositivoException {
		if (anio< 0 ) {
			throw new AnioDebeSerPositivoException();
		}
		if (anio%4 !=0) {
			return false;
		} else {
			if (anio%100 ==0 && anio%400 !=0 ) {
				return false;
			}else {
				return true;
			}
		}
	}
	
	public static String getDiagnostico(float imc) throws DatosDebenSerPositivosException {
		if (imc<= 0 ) {
			throw new DatosDebenSerPositivosException();
		}

		String diagnostico = "";

		if (imc < 18.5) {
			diagnostico = "Bajo Peso";
		} else if (imc <= 24.9) {
			diagnostico = "Peso normal (saludable)";
		} else if (imc <= 29.9) {
			diagnostico = "Sobrepeso";
		} else if (imc <= 40) {
			diagnostico = "Obesidad premórbida";
		} else {
			diagnostico = "Obesidad mórbida";
		}

		return diagnostico;
	}
}
