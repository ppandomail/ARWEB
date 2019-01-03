package ar.edu.uade.tic.tesis.arweb.modelo.criterios;

import java.util.LinkedList;
import java.util.List;

import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.CategoriaTecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.Tecnica;
import ar.edu.uade.tic.tesis.arweb.modelo.tecnicas.generales.TecnicaG96;

public class Criterio1_3_3_CaracteristicasSensoriales extends Criterio {

	public Criterio1_3_3_CaracteristicasSensoriales() {
		super(
				"1.3.3",
				"Caracter�sticas sensoriales.",
				"Las instrucciones que se proporcionan para comprender y operar con un contenido no dependen solamente de las caracter�sticas sensoriales de los componentes, tales como forma, tama�o, ubicaci�n visual, orientaci�n o sonido.",
				NivelAccesibilidad.A);
	}

	public List<Tecnica> getTecnicasAAgregar() {
		List<Tecnica> listaTecnicas = new LinkedList<Tecnica>();
		listaTecnicas.add(new TecnicaG96(CategoriaTecnica.SUFICIENTE));
		return listaTecnicas;
	}

}