package Nirvana;

import java.util.Arrays;
import java.util.List;

public class Mapa {
	int ancho;
	int alto;
	Posicion[] entradas;
	Posicion[] salidas;
	Posicion[] obstaculos;
	Casilla[][] casillas;
	
	
	public Mapa(int alto, int ancho, Posicion[] entradas, Posicion[] salidas, Posicion[] obstaculos) {
		this.ancho = ancho;
		this.alto = alto;
		this.entradas = entradas;
		this.salidas = salidas;
		this.obstaculos = obstaculos;
		this.casillas = inicializarCasillas();
		
	}
	
	
	public int getAncho() {
		return ancho;
	}




	public void setAncho(int ancho) {
		this.ancho = ancho;
	}




	public int getAlto() {
		return alto;
	}




	public void setAlto(int alto) {
		this.alto = alto;
	}




	public Posicion[] getEntradas() {
		return entradas;
	}




	public void setEntradas(Posicion[] entradas) {
		this.entradas = entradas;
	}




	public Posicion[] getSalidas() {
		return salidas;
	}




	public void setSalidas(Posicion[] salidas) {
		this.salidas = salidas;
	}




	public Posicion[] getObstaculos() {
		return obstaculos;
	}




	public void setObstaculos(Posicion[] obstaculos) {
		this.obstaculos = obstaculos;
	}




	public Casilla[][] getCasillas() {
		return casillas;
	}




	public void setCasillas(Casilla[][] casillas) {
		this.casillas = casillas;
	}




	private Casilla[][] inicializarCasillas() {
		Casilla[][]  casillas = new Casilla[this.alto][this.ancho];
		
		// Se crea un mapa vacio con los muros de al rededor
		for (int i = 0; i < this.alto; i++) {
			for (int j = 0; j < this.alto; j++) {
				if (i == 0 || i == this.alto-1 || j == 0 || j== this.ancho -1) {
					casillas[i][j] = new Casilla(Casilla.MURO);
				}else {
					casillas[i][j] = new Casilla(Casilla.BLACO);
				}
			}
		}
		//DEFINIMOS LAS ENTRADAS
		for (int i = 0; i < this.entradas.length; i++) { 
			casillas[this.entradas[i].getY()][this.entradas[i].getX()] = new Casilla(Casilla.ENTRADA);
		}
		//DEFINIMOS LAS SALIDAS
		for (int i = 0; i < this.salidas.length; i++) { 
			casillas[this.salidas[i].getY()][this.salidas[i].getX()] = new Casilla(Casilla.SALIDA);
		}
		
		//DEFINIMOS LOS OBSATCULOS
		for (int i = 0; i < this.obstaculos.length; i++) { 
			casillas[this.obstaculos[i].getY()][this.obstaculos[i].getX()] = new Casilla(Casilla.OBSTACULO);
		}
		crearPisicionIncialPersonaje();
		return casillas;
	}
	
	public void crearPisicionIncialPersonaje() {

		//TODO
		/*una array de entradas (posiciones)
			coger una de las posicions del array, aleatorias
		*/
		this.casillas[this.entradasnumAleatorio[]] = new Casilla(Casilla.PERSONAJE);
	}


	@Override
	public String toString() {
		//TODO:
		return "";
	}
	
	
}
