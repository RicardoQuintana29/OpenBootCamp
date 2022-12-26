
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche miCoche = new Coche();
		miCoche.MasPuerta();
		System.out.println(miCoche.puertas);

	}
	
}
class Coche{
	public int puertas=4;
	
	public void MasPuerta() {
		this.puertas++;
	}
}
