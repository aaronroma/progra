import javax.swing.JOptionPane;

public class carcelono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Dame la edad"));
		
		if(edad<18) {
			System.out.println("Se va a centro de menores");
		}
		if (edad>18 && edad<=70) {
			System.out.println("Se va a la carcel");
		}
		if(edad>70) {
			System.out.println("Se va a arresto domiciliario");
		}
		
		
		
		
		
	}
	
}
