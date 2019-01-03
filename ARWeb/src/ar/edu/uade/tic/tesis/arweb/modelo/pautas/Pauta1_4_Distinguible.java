package ar.edu.uade.tic.tesis.arweb.modelo.pautas;

import java.util.LinkedList;
import java.util.List;

import ar.edu.uade.tic.tesis.arweb.modelo.criterios.Criterio;
import ar.edu.uade.tic.tesis.arweb.modelo.criterios.Criterio1_4_1_UsoColor;
import ar.edu.uade.tic.tesis.arweb.modelo.criterios.Criterio1_4_2_ControlAudio;

public class Pauta1_4_Distinguible extends Pauta {

	public Pauta1_4_Distinguible() {
		super(
				"1.4", 
				"Distinguible.", 
				"Haga m�s f�cil para los usuarios ver y o�r el contenido, incluyendo la separaci�n entre primer plano y fondo.");
	}

	public List<Criterio> getCriteriosAAgregar() {
		List<Criterio> listaCriterios = new LinkedList<Criterio>();
		listaCriterios.add(new Criterio1_4_1_UsoColor());
		listaCriterios.add(new Criterio1_4_2_ControlAudio());
		return listaCriterios;
	}

}