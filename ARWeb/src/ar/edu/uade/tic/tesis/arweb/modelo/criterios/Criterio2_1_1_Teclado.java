package ar.edu.uade.tic.tesis.arweb.modelo.criterios;

import java.util.LinkedList;
import java.util.List;

import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.CategoriaTecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.Tecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.generales.TecnicaG202;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.html.TecnicaH91;

public class Criterio2_1_1_Teclado extends Criterio {

	public Criterio2_1_1_Teclado() {
		super(
				"2.1.1",
				"Teclado.",
				"Toda funcionalidad del contenido es operable a trav�s de una interfaz de teclado sin que exista un l�mite de tiempo espec�fico para realizar las pulsaciones de las teclas, excepto para cuando la funcionalidad subyacente requiere una interacci�n del usuario para la que es relevante no s�lo los puntos finales de su movimiento sino tambi�n la ruta que traza el mismo.",
				NivelAccesibilidad.A);
	}

	public List<Tecnica> getTecnicasAAgregar() {
		List<Tecnica> listaTecnicas = new LinkedList<Tecnica>();
		listaTecnicas.add(new TecnicaG202(CategoriaTecnica.SUFICIENTE));
		listaTecnicas.add(new TecnicaH91(CategoriaTecnica.SUFICIENTE));
		return listaTecnicas;
	}

}