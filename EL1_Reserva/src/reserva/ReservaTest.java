package reserva;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReservaTest {
	
	private final Reserva reserva = new Reserva();

	@Test
	@DisplayName("Escenario 1")
	void testEscenario1() throws ParseException {
		String expected = "El registro ha sido exitoso";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaReserva = sdf.parse("06/06/2021");
		
		String actual = reserva.registrarNuevaReserva(103, "Luis", fechaReserva);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Escenario 2")
	void testEscenario2() throws ParseException {
		String expected = "El registro ha sido exitoso";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaReserva = sdf.parse("07/07/2021");
		
		String actual = reserva.registrarNuevaReserva(206, "María", fechaReserva);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Escenario 3")
	void testEscenario3() throws ParseException {
		String expected = "El registro ha sido exitoso";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaReserva = sdf.parse("08/08/2021");
		
		String actual = reserva.registrarNuevaReserva(309, "Paula", fechaReserva);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Escenario 4")
	void testEscenario4() throws ParseException {
		String expected = "Ingrese una habitación válida";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaReserva = sdf.parse("06/06/2021");
		
		String actual = reserva.registrarNuevaReserva(400, "Luis", fechaReserva);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Escenario 5")
	void testEscenario5() throws ParseException {
		String expected = "Recuerde que el nombre del cliente debe contener al menos 4 caracteres";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaReserva = sdf.parse("07/07/2021");
		
		String actual = reserva.registrarNuevaReserva(206, "Ana", fechaReserva);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Escenario 6")
	void testEscenario6() throws ParseException {
		String expected = "Debe ingresar una fecha válida";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaReserva = sdf.parse("08/08/2000");
		
		String actual = reserva.registrarNuevaReserva(309, "Paula", fechaReserva);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Escenario 7")
	void testEscenario7() throws ParseException {
		String expected = "Debe ingresar los datos requeridos";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaReserva = sdf.parse("06/06/2021");
		
		String actual = reserva.registrarNuevaReserva(null, "Luis", fechaReserva);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Escenario 8")
	void testEscenario8() throws ParseException {
		String expected = "Debe ingresar los datos requeridos";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaReserva = sdf.parse("07/07/2021");
		
		String actual = reserva.registrarNuevaReserva(206, "", fechaReserva);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Escenario 9")
	void testEscenario9() throws ParseException {
		String expected = "Debe ingresar los datos requeridos";
		String actual = reserva.registrarNuevaReserva(209, "Paula", null);
		assertEquals(expected, actual);
	}
	
}
