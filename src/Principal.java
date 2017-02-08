import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
	//Array lists de ingresos,medicos y pacientes
	static ArrayList<String> ingresos = new ArrayList<String>();
	static ArrayList<String> medicos = new ArrayList<String>();
	static ArrayList<String> pacientes = new ArrayList<String>();
	//Llamamos a las otras clases
	Ingreso i = new Ingreso();
	Paciente p = new Paciente();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medico m = new Medico(0);
	}
	
	/**
	 * Menu para elegir la opción al usuario 
	 * @return la opcion del usuario
	 */
	public static int menu(){
		Scanner menu = new Scanner(System.in);
        System.out.println("Elige una de estas opciones: ");
        System.out.println("-------------------------\n");
        System.out.println("1 - Insertar paciente");
        System.out.println("2 - Insertar medico");
        System.out.println("3 - Nuevo ingreso");
        System.out.println("4 - Salir");
		System.out.println(">");
		int opcion = menu.nextInt();
		return opcion;
	}

}

