package tp1;

import javax.swing.*;

class Tp1 {

	public static void main(String[] args) {
		int cant=0;
		String res;
		final String rc="¡Su respuesta es correcta!";
		
		JOptionPane.showMessageDialog(null, "En este divertido juego usted tendra"
				+ " que \nadivinar la película  en base a los\nemojis"
				+ " que aparezcan a la izquierda de la pantalla.", "¡Adivina con emojis!", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Tp1.class.getResource("/img/emoji.jpg")));
		
		
		JOptionPane.showMessageDialog(null, "Las preguntas apareceran en este formato\n¿Estas listo/a?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/pel.jpg")));
			
			//Pregunta 1
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/GVK.jpg")),null,null));
			
			if (res.equalsIgnoreCase("Godzilla vs Kong")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: Godzilla vs Kong");
			}
			
			//Pregunta 2
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/HP.jpg")),null,null));
			
			if (res.equalsIgnoreCase("Harry Potter")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: Harry Potter");
			}
			
			//Pregunta 3
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/H.jpg")),null,null));
			
			if (res.equalsIgnoreCase("El Increible Hulk")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: El Increíble Hulk");
			}
			
			//Pregunta 4
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/ESDLA.jpg")),null,null));
			
			if (res.equalsIgnoreCase("El Señor de los Anillos")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: El Señor de los Anillos");
			}
			
			//Pregunta 5
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/LTN.jpg")),null,null));
			
			if (res.equalsIgnoreCase("Las Tortugas Ninja")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: Las Tortugas Ninja");
			}
			
			//Medio tiempo
			JOptionPane.showMessageDialog(null, "Hasta ahora fácil ¿no?\nVamos a subirle un poco la dificultad", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/mt.jpg")));
			
			//Pregunta 6
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/eldls.jpg")),null,null));
			
			if (res.equalsIgnoreCase("El libro de la selva")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: El libro de la selva");
			}
			
			//Pregunta 7
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/eldws.jpg")),null,null));
			
			if (res.equalsIgnoreCase("El lobo de Wall Street")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: El lobo de Wall Street");
			}
			
			//Pregunta 8
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/apm.jpg")),null,null));
			
			if (res.equalsIgnoreCase("Alicia en el pais de las maravillas")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: Alicia en el país de las maravillas");
			}
			
			//Pregunta 9
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/ap.jpg")),null,null));
			
			if (res.equalsIgnoreCase("Actividad paranormal")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: Actividad paranormal");
			}
			
			//Pregunta 10
			res=(String)(JOptionPane.showInputDialog(null,"¿Qué película es?", "¡Adivina la película con emojis!", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Tp1.class.getResource("/img/cl.jpg")),null,null));
			
			if (res.equalsIgnoreCase("Chicken Little")) {
				cant=cant+1;
				JOptionPane.showMessageDialog(null, rc);
			} else {
				JOptionPane.showMessageDialog(null, "Su respuesta es incorrecta :(\nRespuesta correcta: Chicken Little");
			}
			
			if (cant>=6) {
				JOptionPane.showMessageDialog(null, "¡Felicidades!, usted contesto correctamente " + cant + " veces!", "¡Ha ganado!", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Tp1.class.getResource("/img/win.gif")));
			} else {
				JOptionPane.showMessageDialog(null, "Lo siento, usted contesto correctamente " + cant + " pregunta/s", "Ha perdido :/", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Tp1.class.getResource("/img/lose.gif")));
			}
		}

	}
