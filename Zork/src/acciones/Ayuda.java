package acciones;

import Ubicacion.Ubicacion;
import jugadores.Jugador;
import main.Juego;

//public class Ayuda extends Accion {
public class Ayuda extends AccionBase {

	Ubicacion ubicacionActual;
	Juego juego;
	
	public Ayuda(Jugador jugador) {
		this.ubicacionActual = jugador.getUbicacionActual();
		nombre="ayuda";
	}
	
	/**Sacar luego de refactor con patron*/
	public void accionar() {
		String mensaje="estas ubicado en ";
		mensaje += ubicacionActual.getNombreGenero();
		mensaje += ". Puedes interactuar con todos los sitios e items que hay en este lugar\n" + 
				"para poder ver los sitios podes usar MIRAR LUGAR y para ver los items MIRAR 'nombre del sitio' \n" + 
				"tambien podes agarra los items del lugar con AGARRAR 'nombre de item' \n."+
				"recuerda que para pasar por ciertos lugares necesitas items especificos.";
		System.out.println(mensaje);
	}

	@Override
	public void ejecutar(Peticion peticion, Jugador jugador) {
		String mensaje="estas ubicado en ";
		mensaje += ubicacionActual.getNombreGenero();
		mensaje += ". Puedes interactuar con todos los sitios e items que hay en este lugar\n" + 
				"para poder ver los sitios podes usar MIRAR LUGAR y para ver los items MIRAR 'nombre del sitio' \n" + 
				"tambien podes agarra los items del lugar con AGARRAR 'nombre de item' \n."+
				"recuerda que para pasar por ciertos lugares necesitas items especificos.";
		System.out.println(mensaje);
	}
}
