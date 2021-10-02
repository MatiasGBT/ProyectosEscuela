package tp2;

import javax.swing.*;

class Tp2 {

	public static void main(String[] args) {
		String res,repite;
		int n, cantv=0,cantd=0,maq,apuinicial,apufinal=0,apu=0,emp=0;
		
		JOptionPane.showMessageDialog(null,"Juego de piedra, papel, tijeras, lagarto o Spock\nJugador vs Maquina", "Piedra, papel, tijeras, lagarto y Spock", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Tp2.class.getResource("/img/inicio.jpg")));
		
		do {
			apuinicial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a apostar (de 10 a 100 dolares)"));
			if (apuinicial>=10 && apuinicial<=100) {
				for (int j = 1; j <= 5; j++) {
					res=(String)JOptionPane.showInputDialog(null, "Elija que quiere hacer:\n1 - Piedra\n2 - Papel\n3 - Tijera\n4 - Lagarto\n5 - Spock", "Piedra, papel, tijeras, lagarto y Spock", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Tp2.class.getResource("/img/pptls.jpg")), null, null);		
					n=Integer.parseInt(res);
					
					maq=(int)(Math.random()*5+1);
					JOptionPane.showMessageDialog(null, "La máquina eligió", "Piedra, papel, tijeras, lagarto y Spock", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Tp2.class.getResource("/img/accion" + maq + ".jpg")));
					
					switch (n) {
					case 1:
						if (maq==2) {
							JOptionPane.showMessageDialog(null, "Papel envuelve a piedra, usted pierde");
							cantd++;
						} else if (maq==3) {
							JOptionPane.showMessageDialog(null, "Piedra aplasta tijeras, usted gana");
							cantv++;
						} else if (maq==4) {
							JOptionPane.showMessageDialog(null, "Piedra aplasta lagarto, usted gana");
							cantv++;
						} else if (maq==5) {
							JOptionPane.showMessageDialog(null, "Spock vaporiza piedra, usted pierde");
							cantd++;
						} else {
							JOptionPane.showMessageDialog(null, "Empate, la apuesta se mantiene");
							emp++;
						}
						break;
						
					case 2:
						if (maq==1) {
							JOptionPane.showMessageDialog(null, "Papel envuelve a piedra, usted gana");
							cantv++;
						} else if (maq==3) {
							JOptionPane.showMessageDialog(null, "Tijera corta papel, usted pierde");
							cantd++;
						} else if (maq==4) {
							JOptionPane.showMessageDialog(null, "Lagarto devora papel, usted pierde");
							cantd++;
						} else if (maq==5) {
							JOptionPane.showMessageDialog(null, "Papel desautoriza Spock, usted gana");
							cantv++;
						} else {
							JOptionPane.showMessageDialog(null, "Empate, la apuesta se mantiene");
							emp++;
						}
						break;
						
					case 3:
						if (maq==1) {
							JOptionPane.showMessageDialog(null, "Piedra aplasta tijeras, usted pierde");
							cantd++;
						} else if (maq==2) {
							JOptionPane.showMessageDialog(null, "Tijera corta papel, usted gana");
							cantv++;
						} else if (maq==4) {
							JOptionPane.showMessageDialog(null, "Tijera decapita lagarto, usted gana");
							cantv++;
						} else if (maq==5) {
							JOptionPane.showMessageDialog(null, "Spock rompe tijera, usted pierde");
							cantd++;
						} else {
							JOptionPane.showMessageDialog(null, "Empate, la apuesta se mantiene");
							emp++;
						}
						break;
						
					case 4:
						if (maq==1) {
							JOptionPane.showMessageDialog(null, "Piedra aplasta lagarto, usted pierde");
							cantd++;
						} else if (maq==2) {
							JOptionPane.showMessageDialog(null, "Lagarto devora papel, usted gana");
							cantv++;
						} else if (maq==3) {
							JOptionPane.showMessageDialog(null, "Tijera decapita lagarto, usted pierde");
							cantd++;
						} else if (maq==5) {
							JOptionPane.showMessageDialog(null, "Lagarto envenena Spock, usted gana");
							cantv++;
						} else {
							JOptionPane.showMessageDialog(null, "Empate, la apuesta se mantiene");
							emp++;
						}
						break;
						
					case 5:
						if (maq==1) {
							JOptionPane.showMessageDialog(null, "Spock vaporiza piedra, usted gana");
							cantv++;
						} else if (maq==2) {
							JOptionPane.showMessageDialog(null, "Papel desautoriza Spock, usted pierde");
							cantd++;
						} else if (maq==3) {
							JOptionPane.showMessageDialog(null, "Spock rompe tijera, usted gana");
							cantv++;
						} else if (maq==4) {
							JOptionPane.showMessageDialog(null, "Lagarto envenena Spock, usted pierde");
							cantd++;
						} else {
							JOptionPane.showMessageDialog(null, "Empate, la apuesta se mantiene");
							emp++;
						}
						break;

					default:
						JOptionPane.showMessageDialog(null, "Error en el ingreso");
						break;
									
					}
				}
				
				if ((emp>=3 && cantv==cantd) || cantv==cantd) {
					apu=apuinicial;
					apufinal=apufinal+apu;
					JOptionPane.showMessageDialog(null,"Ganó " + cantv + " de 5 partidas y perdió " + cantd + "\nEmpató " + emp + "\nSe quedo con un total de " + apufinal + " dolares", "EMPATE", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Tp2.class.getResource("/img/empate.gif")));
				} else if (cantv>cantd) {
					apu=apuinicial*2;
					apufinal=apufinal+apu;
					JOptionPane.showMessageDialog(null,"Ganó " + cantv + " de 5 partidas y perdió " + cantd + "\nEmpató " + emp + "\nSe quedo con un total de " + apufinal + " dolares", "VICTORIA", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Tp2.class.getResource("/img/victoria.gif")));
				} else {
					apu=apuinicial-(apuinicial*2);
					apufinal=apufinal+apu;
					JOptionPane.showMessageDialog(null,"Ganó " + cantv + " de 5 partidas y perdió " + cantd + "\nEmpató " + emp + "\nSe quedo con un total de " + apufinal + " dolares", "DERROTA", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Tp2.class.getResource("/img/derrota.gif")));
				}
				
			} else {
			JOptionPane.showMessageDialog(null, "Error en el ingreso, por favor seleccione una apuesta válida.");
			}
			
			cantv=0;
			cantd=0;
			emp=0;
			apu=0;
			apufinal=0;
			
			repite=JOptionPane.showInputDialog("¿Quiere volver a jugar?");		
		} while (repite.equalsIgnoreCase("si"));

	}

}
