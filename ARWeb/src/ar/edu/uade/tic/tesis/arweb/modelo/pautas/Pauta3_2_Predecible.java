package ar.edu.uade.tic.tesis.arweb.modelo.pautas;

import java.util.LinkedList;
import java.util.List;

import ar.edu.uade.tic.tesis.arweb.modelo.criterios.Criterio;
import ar.edu.uade.tic.tesis.arweb.modelo.criterios.Criterio3_2_1_ConFoco;
import ar.edu.uade.tic.tesis.arweb.modelo.criterios.Criterio3_2_2_ConEntradaDeDatos;

public class Pauta3_2_Predecible extends Pauta {

	public Pauta3_2_Predecible() {
		super(
				"3.2", 
				"Predecible.", 
				"Cree páginas web cuya apariencia y operabilidad sean predecibles.");
	}

	public List<Criterio> getCriteriosAAgregar() {
		List<Criterio> listaCriterios = new LinkedList<Criterio>();
		listaCriterios.add(new Criterio3_2_1_ConFoco());
		listaCriterios.add(new Criterio3_2_2_ConEntradaDeDatos());
		return listaCriterios;
	}

}