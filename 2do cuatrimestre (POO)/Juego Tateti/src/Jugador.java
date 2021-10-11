import javax.swing.JOptionPane;

public class Jugador {
	public String nombre;
	public int f,c;
	public Ficha ficha;
	public Jugador(String nombre,String ficha) {
		this.nombre=nombre;
		this.ficha=new Ficha(ficha);
	}
	
	public boolean jugada() {
		int x;
		//int f=3,c=3;
		x=Integer.parseInt(JOptionPane.showInputDialog(null, nombre + " ingrese la posición de la ficha en base al numpad"));
		
		switch (x) {
		case 7: f=0; c=0; break;
		case 8: f=0; c=1; break;
		case 9: f=0; c=2; break;
		
		case 4: f=1; c=0; break;
		case 5: f=1; c=1; break;
		case 6: f=1; c=2; break;
		
		case 1: f=2; c=0; break;
		case 2: f=2; c=1; break;
		case 3: f=2; c=2; break;

		default: return(false);
		}
		return(true);
	}
	
	public int[] posicionJugada() {
		int array[]=new int[2];
		if (jugada()) {
			array[0]=f;
			array[1]=c;
			return array;
		} else {
			array[0]=-1; //devuelvo un número que no este en la matriz para invalidar la jugada
			array[1]=-2;
			return array;
		}
	}
	
}
