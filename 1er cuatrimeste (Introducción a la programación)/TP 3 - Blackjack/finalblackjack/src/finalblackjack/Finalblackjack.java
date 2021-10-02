package finalblackjack;

import javax.swing.*;

class Finalblackjack {

	public static void main(String[] args) {
		int [][]car=new int[2][5];
		int tot=0,totc=0,n,apu;
		String res,res2;
		
		JOptionPane.showMessageDialog(null,"¡Bienvenido al casino!\nLas reglas del blackjack son las siguientes:"
				+ "\n-Se reparte 1 carta para cada jugador, ambas estarán a la vista.\n"
				+ "Tendrá que elegir si quiere agarrar otra carta, agarrar otra carta y duplicar la apuesta\n(solo en las"
				+ " primeras dos elecciones) o plantarse.\n-El Croupier agarrara cartas hasta tener 16 o más de puntaje"
				+ " (con un máximo de 5 cartas)."
				+ "\n-Gana el jugador que llegue a 21 o más cerca de 21 sin pasarse, si ambos"
				+ " obtienen la misma\npuntuación es empate y la apuesta se mantiene."
				+ "\n-Si ganas por Blackjack (21) ganaras la apuesta por 3. Si pierdes por Blackjack, perderas la apuesta por 3."
				+ "\n-Las figuras valen todas 10 y el As solo vale 1.", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Finalblackjack.class.getResource("/img/inicio.jpg")));
		
		do {	
		apu=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la apuesta a realizar"));
		
		for (int i = 0; i <=1; i++) {
			for (int j = 0; j <=4; j++) {
				car[i][j]=(int)(Math.random()*12+1);
				switch (car[i][j]) {
				case 11:
				case 12:
					car[i][j]=10;
					break;
				default:
					break;
				}
				System.out.print(" " + car[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		tot=tot+car[0][0];
		totc=totc+car[1][0];
		JOptionPane.showMessageDialog(null, "Su carta es: " + car[0][0] + "\nY la del Croupier es: " + car[1][0], "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Finalblackjack.class.getResource("/img/carta" + car[0][0] + ".png")));
		
		res2=(String)JOptionPane.showInputDialog(null, "¿Qué desea hacer?\n1-Pedir otra carta\n2-Duplicar apuesta\nCualquier otro número-Plantarse", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Finalblackjack.class.getResource("/img/preg.jpg")), null, null);		
		n=Integer.parseInt(res2);
		if (n==1) {
			tot=tot+car[0][1];
			JOptionPane.showMessageDialog(null, "Su carta es: " + car[0][1] + 
					"\nLa suma es: " + tot, "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/carta" + car[0][1] + ".png")));
			res2=(String)JOptionPane.showInputDialog(null, "¿Qué desea hacer?\n1-Pedir otra carta\n2-Duplicar apuesta\nCualquier otro número-Plantarse", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/preg.jpg")), null, null);		
			n=Integer.parseInt(res2);
			if (n==1) {
				tot=tot+car[0][2];
				JOptionPane.showMessageDialog(null, "Su carta es: " + car[0][2] + 
						"\nLa suma es: " + tot, "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Finalblackjack.class.getResource("/img/carta" + car[0][2] + ".png")));
				if (tot<=20) {
					res2=(String)JOptionPane.showInputDialog(null, "¿Qué desea hacer?\n1-Pedir otra carta\nCualquier otro número-Plantarse", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Finalblackjack.class.getResource("/img/preg.jpg")), null, null);		
					n=Integer.parseInt(res2);
					if (n==1) {
						tot=tot+car[0][3];
						JOptionPane.showMessageDialog(null, "Su carta es: " + car[0][3] + 
								"\nLa suma es: " + tot, "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Finalblackjack.class.getResource("/img/carta" + car[0][3] + ".png")));
						if (tot<=20) {
							res2=(String)JOptionPane.showInputDialog(null, "¿Qué desea hacer?\n1-Pedir otra carta\nCualquier otro número-Plantarse\nADVERTENCIA: Solo puede pedir una carta más", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Finalblackjack.class.getResource("/img/preg.jpg")), null, null);		
							n=Integer.parseInt(res2);
							if (n==1) {
								tot=tot+car[0][4];
								JOptionPane.showMessageDialog(null, "Su carta es: " + car[0][4] + 
										"\nLa suma es: " + tot, "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
										new ImageIcon(Finalblackjack.class.getResource("/img/carta" + car[0][4] + ".png")));
							}
						}	
					}
				}
				
			} else if (n==2) {
				apu=apu*2;
				tot=tot+car[0][2];
				JOptionPane.showMessageDialog(null, "Su carta es: " + car[0][2] + 
						"\nLa suma es: " + tot, "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Finalblackjack.class.getResource("/img/carta" + car[0][2] + ".png")));
			}
			
		} else if (n==2) {
			apu=apu*2;
			tot=tot+car[0][1];
			JOptionPane.showMessageDialog(null, "Su carta es: " + car[0][1] + 
					"\nLa suma es: " + tot, "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/carta" + car[0][1] + ".png")));
		}
		
		if (totc<16) {
			totc=totc+car[1][1];
			if (totc<16) {
				totc=totc+car[1][2];
				if (totc<16) {
					totc=totc+car[1][3];
				}
				if (totc<16) {
					totc=totc+car[1][4];
				}
			}
		}
		
		
		if (tot==21 && totc!=21) {
			apu=apu*3;
			JOptionPane.showMessageDialog(null,"¡Ganó con Blackjack!\nSumo " + tot + " y el Croupier " + totc + "\nSe quedo con " + apu + " dolares.", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/win_bj.gif")));
		} else if (tot!=21 && totc==21) {
			apu=apu-apu*3;
			JOptionPane.showMessageDialog(null,"Perdió con Blackjack\nSumo " + tot + " y el Croupier " + totc + "\nSe quedo con " + apu + " dolares.", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/lose_bj.gif")));
		} else if ((tot<=20 && tot>totc) || (tot<=20 && totc>21)) {
			apu=apu*2;
			JOptionPane.showMessageDialog(null,"Ganó\nSumo " + tot + " y el Croupier " + totc + "\nSe quedo con " + apu + " dolares.", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/win.jpg")));
		} else if ((totc<=20 && totc>tot) || (totc<=20 && tot>21)) {
			apu=apu-apu*2;
			JOptionPane.showMessageDialog(null,"Perdió\nSumo " + tot + " y el Croupier " + totc + "\nSe quedo con " + apu + " dolares.", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/lose.jpg")));
		} else if (tot>21 && totc>21 && tot!=totc) {
			JOptionPane.showMessageDialog(null,"Empate" + "\nAmbos sumaron más de 21" + "\nJugador: " + tot + "\nCroupier: " + totc + "\nLa apuesta se mantiene.", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/draw.jpg")));
		} else {
			JOptionPane.showMessageDialog(null,"Empate" + "\nAmbos sumaron " + tot + "\nLa apuesta se mantiene.", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Finalblackjack.class.getResource("/img/draw.jpg")));
		}
		
		tot=0;
		totc=0;
		res=(String)JOptionPane.showInputDialog(null, "¿Quiere volver a jugar? el Croupier ya esta mezclando las cartas ;)", "Blackjack - Jugador vs máquina", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Finalblackjack.class.getResource("/img/tenor.gif")), null, null);;
		} while (res.equalsIgnoreCase("si"));
	}

}
