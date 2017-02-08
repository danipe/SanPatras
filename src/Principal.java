import java.util.ArrayList;
public class Principal {
	//Array lists de ingresos,medicos y pacientes
	static ArrayList<String> ingresos = new ArrayList<String>();
	static ArrayList<String> medicos = new ArrayList<String>();
	static ArrayList<String> pacientes = new ArrayList<String>();
	//Llamamos a las otras clases
	Ingresos i = new Ingresos();
	Medicos m = new Medicos();
	Pacientes p = new Pacientes();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
