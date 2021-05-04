package reserva;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Reserva {
	
	public boolean dateIsNotEmpty(Date fecha) {
		if(fecha != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean stringIsNotEmpty(String valor) {
		if(valor.trim().length() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean numeroHabitacionIsValid(Integer numeroHabitacion) {
		try {
			if(numeroHabitacion >= 100 && numeroHabitacion <= 399) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean nombreClienteIsValid(String nombreCliente) {
		if(Pattern.matches("[a-zA-ZñáéíóúüÁÉÍÓÚÜ]+", nombreCliente)) {
			if(nombreCliente.length() >= 4) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean fechaReservaIsValid(Date fechaReserva) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date hoy = sdf.parse(sdf.format(new Date()));
			if(fechaReserva.compareTo(hoy) > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	public String registrarNuevaReserva(Integer numeroHabitacion, String nombreCliente, Date fechaReserva) {
		String mensaje = "";
		
		if(stringIsNotEmpty(nombreCliente)) {
			
			if(numeroHabitacionIsValid(numeroHabitacion) && nombreClienteIsValid(nombreCliente) && fechaReservaIsValid(fechaReserva)) {
				mensaje = "El registro ha sido exitoso";
			} else {
				
				if(!numeroHabitacionIsValid(numeroHabitacion)) {
					mensaje = "Ingrese una habitación válida";
				}
				
				if(numeroHabitacion == null) {
					mensaje = "Debe ingresar los datos requeridos";
				}
				
				if(!nombreClienteIsValid(nombreCliente)) {
					mensaje = "Recuerde que el nombre del cliente debe contener al menos 4 caracteres";
				}
				
				if(!fechaReservaIsValid(fechaReserva)) {
					mensaje = "Debe ingresar una fecha válida";
				}
				
				if(fechaReserva == null) {
					mensaje = "Debe ingresar los datos requeridos";
				}
			}
			
		} else {
			mensaje = "Debe ingresar los datos requeridos";
		}
		
		return mensaje;
	}
	
}
