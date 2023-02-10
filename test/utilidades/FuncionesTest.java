package utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.AnioDebeSerPositivoException;
import excepciones.DatosDebenSerPositivosException;

class FuncionesTest {

	@Test
	void testEsBisiesto() throws AnioDebeSerPositivoException {
		assertFalse(Funciones.esBisiesto(2023), "El test ha fallado: 2023 no es bisiesto");
		//si pasandole el año 2023 la funcion es bisiesto devuelve falso, lo hace bien
//		assert false cofirma que si lo que le meto entre paréntesis es falso, es correcto.
//		si es verdadero, el test fallará
		
		assertTrue(Funciones.esBisiesto(2024), "El test ha fallado: 2024 es bisiesto");
//		en este caso, le paso el año 2024 y es bisiesto. por eso quiero que lo que le meto entre paréntesis sea true, por ello uso el asserTrue. si el resultado es verdadero, es correcto el test. si es falso, fallará
		
		assertTrue(Funciones.esBisiesto(2000), "El test ha fallado: 2000 es bisiesto");
		assertFalse(Funciones.esBisiesto(2100), "El test ha fallado: 2100 no es bisiesto");
		assertThrows(AnioDebeSerPositivoException.class, 
				()-> Funciones.esBisiesto(-4));
//		assertThrows(AnioDebeSerPositivoException.class, new Executable {
//					public void execute() throws Throwable {
//						Funciones.esBisiesto(-4);
//					}});

	}
	
	@Test
	void testGetDiagnostico() throws DatosDebenSerPositivosException {
		assertEquals("Bajo Peso", Funciones.getDiagnostico(10.2f), "El test ha fallado: debería devolver 'bajo peso'");
		assertEquals("Peso normal (saludable)", Funciones.getDiagnostico(24.9f), "El test ha fallado: debería devolver 'peso normal'");
		assertEquals("Sobrepeso", Funciones.getDiagnostico(25.0f), "El test ha fallado: debería devolver 'sobrepeso'");
		assertEquals("Obesidad premórbida", Funciones.getDiagnostico(30.0f), "El test ha fallado: debería devolver 'obesidad premórbida'");
		assertEquals("Obesidad mórbida", Funciones.getDiagnostico(44.8f), "El test ha fallado: debería devolver 'obesidad mórbida'");
		assertThrows(DatosDebenSerPositivosException.class, ()-> Funciones.getDiagnostico(-1.5f));
	}

}
