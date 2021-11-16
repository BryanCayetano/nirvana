package Nirvana;

import java.io.IOException;
import java.util.Random;

public class NIRVANA {
	
	Random random;
	Posicion posicion;
	Mapa mapa;
	int alto;
	int ancho;
	
	public NIRVANA(int alto, int ancho) {
		
		this.random = new Random();
		this.ancho = ancho;
		this.alto = alto;
		Posicion[] entradas = {new Posicion(0,3), new Posicion(0,4)};
		
		//TODO: lo haces tú
		Posicion[] salidas = {};
		Posicion[] obstaculos = {};
		this.mapa = new Mapa(alto, ancho, entradas, salidas, obstaculos);
		
		
	}


	public Random getRandom() {
		return random;
	}


	public void setRandom(Random random) {
		this.random = random;
	}


	public Posicion getPosicion() {
		return posicion;
	}


	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}


	public Mapa getMapa() {
		return mapa;
	}


	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public static void main(String[] args) throws IOException {
		/******************
		 * //var
		 *****************/
		boolean salida = false;
		
		NIRVANA juego = new NIRVANA(9, 8);
		
		//TODO imprimir el mapa a ver si está ok y depsués continuar
		System.out.println(juego.getMapa().toString());


//		/******************
//		 * //Bucle rincipal TODO GORDO
//		 *****************/
//		while (salida == false) {
//
//			System.out.println("\n");
//
//			/******************
//			 * //calculo movimiento aleatorio
//			 *****************/
//
//			probabilidad = r.nextInt(3);
//
//			switch (probabilidad) {
//			// El PJ va hacia la izquerida
//			case 0:
//
//				if (x > 1) {
//					// Si choco contra una torre o es camino ya recorrido me quedo en la misma
//					// posiciOn
//					if (mapa[x - 1][y] =='·') {
//						x--;
//						ruta[paso] = "(" + x + "," + y + ")";
//						paso++;
//					}
//
//				}
////				else {
////					x++;
////					// No puedo ir a la izquierda 
////					if (mapa [x][y]=='T' || mapa [x][y]=='$'){
////						x--;
////					}
////				}
//				break;
//
//			case 1:
//				// El PJ va hacia la derecha
//				if (x < 6) {
//					// Si choco contra una torre o es camino ya recorrido me quedo en la misma
//					// posiciOn
//					if (mapa[x + 1][y] =='·') {
//						x++;
//						ruta[paso] = "(" + x + "," + y + ")";
//						paso++;
//					}
//				}
////				else
////					x--;
////					if (mapa [x][y]=='T' || mapa [x][y]=='$'){
////						x++;
////					}
//				break;
//
//			default:
//				// El PJ va hacia abajo
//				if (y < 7) {
//					if (mapa[x][y + 1] =='·') {
//						y++;
//						ruta[paso] = "(" + x + "," + y + ")";
//						paso++;
//					} else {
//
//					}
//				}
//				break;
//			}
//
//			if (y == 7 && x == 3 || y == 7 && x == 4) {
//				salida = true;
//			}
//
//			/******************
//			 * //Cambio mapa Poner montruo
//			 *****************/
//
//			mapa[y][x] = '#';
//
//			/******************
//			 * //dilay
//			 *****************/
//
//			try {
//
//				Thread.sleep(1 * 1000);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//
//			/******************
//			 * //"clear"
//			 *****************/
//			// System.out.print("\u001b[2J");
//			for (int i = 0; i < 30; ++i)
//				System.out.println();
//
//			/******************
//			 * //Bucle rincipal
//			 *****************/
//
//			System.out.println("\n ------------------------------------------------------ ");
//			for (int i = 0; i < mapa.length; i++) {
//
//				for (int a = 0; a < mapa[i].length; a++)
//					System.out.print(" | " + mapa[i][a] + " | ");
//				System.out.println("\n ------------------------------------------------------ ");
//			}
//			mapa[y][x] = '$';
//
//			for (int i = 0; i < ruta.length; i++) {
//				System.out.print(ruta[i] + " ");
//			}
//		}
	}


	
	
}
