import javax.swing.JOptionPane;

public class Tateti {
	Ficha [][] tablero=new Ficha[3][3];
	boolean gan=false;

	public int hayGanador() {//0 no, 1 gana j1, 2 gana j2
		//tateti diagonal descendiente
		if (tablero[0][0]!=null && tablero[1][1]!=null && tablero[2][2]!=null) {
			if (tablero[0][0].ficha.equalsIgnoreCase(tablero[1][1].ficha)
					&&tablero[1][1].ficha.equalsIgnoreCase(tablero[2][2].ficha)) {
					if (tablero[0][0].ficha.equalsIgnoreCase("X")) {
						return (1);
					} else {
						return (2);
					}
			}
		}
		
		//tateti diagonal ascendente
		if (tablero[2][0]!=null && tablero[1][1]!=null && tablero[0][2]!=null) {
			if (tablero[2][0].ficha.equalsIgnoreCase(tablero[1][1].ficha)
					&&tablero[1][1].ficha.equalsIgnoreCase(tablero[0][2].ficha)) {
					if (tablero[2][0].ficha.equalsIgnoreCase("X")) {
						return (1);
					} else {
						return (2);
					}
			}
		}
		
		//tateti filas
		for (int f = 0; f < tablero.length; f++) {
			if (tablero[f][0]!=null && tablero[f][1]!=null && tablero[f][2]!=null) {
				if (tablero[f][0].ficha.equalsIgnoreCase(tablero[f][1].ficha)
						&&tablero[f][1].ficha.equalsIgnoreCase(tablero[f][2].ficha)) {
						if (tablero[f][0].ficha.equalsIgnoreCase("X")) {
							return (1);
						} else {
							return (2);
						}
				}
			}
		}
		
		//tateti de columnas
		for (int c = 0; c < tablero.length; c++) {
			if (tablero[0][c]!=null && tablero[1][c]!=null && tablero[2][c]!=null) {
				if (tablero[0][c].ficha.equalsIgnoreCase(tablero[1][c].ficha)
						&&tablero[1][c].ficha.equalsIgnoreCase(tablero[2][c].ficha)) {
						if (tablero[0][c].ficha.equalsIgnoreCase("X")) {
							return (1);
						} else {
							return (2);
						}
				}
			}
		}
		return (0);
	}
	
	public boolean ponerFicha(int f, int c, Ficha fi) {
		if (tablero[f][c]==null) {
			tablero[f][c]=fi;
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrarTablero() {
		System.out.println(" ");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j]==null) {
					System.out.print("_" + " ");
				} else {
					System.out.print(tablero[i][j].ficha + " ");
				}
			}
			System.out.println(" ");
		}
	}
	
	public void juego(Jugador j) {
		int arr[]=j.posicionJugada();
		if (arr[0]>=0 && arr[1]>=0) {
			ponerFicha(arr[0],arr[1],j.ficha);
		} else {
			JOptionPane.showMessageDialog(null, "Jugada invalida");
		}
	}
	
	public void iniciarJuego() {
		Jugador j1=new Jugador("Manuel","X");
		Jugador j2=new Jugador("Roberto","O");
		
		do {
			juego(j1);
			mostrarTablero();
			if (hayGanador()!=0) {
				System.out.println("El ganador es el jugador " + hayGanador());
				gan=true;
			} else {
				juego(j2);
				mostrarTablero();
				if (hayGanador()!=0) {
					System.out.println("El ganador es el jugador " + hayGanador());
					gan=true;
				}	
			}
		} while (gan==false);
	}
}
