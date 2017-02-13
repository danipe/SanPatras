import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
	//Array lists de ingresos,medicos y pacientes
	static ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();
	static ArrayList<Medico> medicos = new ArrayList<Medico>();
	static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	//Llamamos a las otras clases
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bucleMenu();
	}
	
	/**
	 * Menu para elegir la opciÃ³n al usuario 
	 * @return la opcion del usuario
	 */
	//MENÚ INSERTAR
	public static int menuInsertar(){
		Scanner menu = new Scanner(System.in);
		System.out.println("-------------------------");
        System.out.println("Elige una de estas opciones: ");
        System.out.println("-------------------------");
        System.out.println("1 - Insertar paciente");
        System.out.println("2 - Insertar medico");
        System.out.println("3 - Insertar ingreso");
        System.out.println("4 - Salir");
		System.out.print(">");
		int opcion = menu.nextInt();
		System.out.println("-------------------------");
		return opcion;
	}
	public static void bucleMenuInsertar(){
		int op=0;
		do{
			op=menuInsertar();
			switch(op){
			case 1:
				pacientes.add(new Paciente(pacientes.size()));
				break;
			case 2: 
				medicos.add(new Medico(medicos.size()));
				break;
			case 3:
				ingresos.add(new Ingreso(ingresos.size()));
				break;
			case 4:
				
				break;
			default:
				System.out.println("Introduce un numero válido");
			}
		}while(op!=4);
	}
	
	//MENÚ MOSTRAR
	public static int menuMostrar(){
		Scanner menu = new Scanner(System.in);
		System.out.println("-------------------------");
        System.out.println("Elige una de estas opciones: ");
        System.out.println("-------------------------");
        System.out.println("1 - Mostar pacientes");
        System.out.println("2 - Mostar medicos");
        System.out.println("3 - Mostar ingresos");
        System.out.println("4 - Salir");
		System.out.print(">");
		int opcion = menu.nextInt();
		System.out.println("-------------------------");
		return opcion;
	}
	public static void bucleMenuMostrar(){
		int op=0;
		do{
			op=menuMostrar();
			switch(op){
			case 1:
				for(Paciente paciente : pacientes){
					System.out.println("Codigo paciente: "+paciente.getCodPaciente());
					System.out.println("Nombre paciente: "+paciente.getNombrePaciente());
					System.out.println("Apellidos paciente: "+paciente.getApedilloPaciente());
					System.out.println("Fecha nacimiento paciente: "+paciente.getFechaNacimientoPaciente());
					System.out.println("Telefono paciente: "+paciente.getTelefPaciente());
					System.out.println("");
				}
				break;
			case 2: 
				for(Medico medico: medicos){
					System.out.println("Codigo medico: "+medico.getCodigoMedico());
					System.out.println("Nombre medico: "+medico.getNombre());
					System.out.println("Apellidos medico: "+medico.getApellidos());
					System.out.println("Especialidad medico: "+medico.getEspecialidad());
					System.out.println("Telefono medico: "+medico.getTelefono());
					System.out.println("");
				}
				break;
			case 3:
				for(Ingreso ingreso: ingresos){
					System.out.println("Codigo ingreso: "+ingreso.getCodIngreso());
					System.out.println("Paciente ingreso: "+ingreso.getCodPaciente());
					System.out.println("Medico ingreso: "+ingreso.getCodMedico());
					System.out.println("Habitacion ingreso: "+ingreso.getNumHabitacion());
					System.out.println("Cama ingreso: "+ingreso.getNumCama());
					System.out.println("Fecha ingreso: "+ingreso.getFechaIngreso());
					System.out.println("");
				}
				break;
			case 4:
				System.out.println("Hasta la próxima");
				break;
			default:
				System.out.println("Introduce un numero válido");
			}
		}while(op!=4);
	}
	
	
	//MENÚ MODIFICAR
	public static int menuModificar(){
		Scanner menu = new Scanner(System.in);
		System.out.println("-------------------------");
        System.out.println("Elige una de estas opciones: ");
        System.out.println("-------------------------");
        System.out.println("1 - Modificar paciente");
        System.out.println("2 - Modificar medico");
        System.out.println("3 - Modificar ingreso");
        System.out.println("4 - Salir");
		System.out.print(">");
		int opcion = menu.nextInt();
		System.out.println("-------------------------");
		return opcion;
	}
	public static void bucleMenuModificar(){
		int op=0;
		do{
			op=menuModificar();
			switch(op){
			case 1:
				
				break;
			case 2: 
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				System.out.println("Introduce un numero válido");
			}
		}while(op!=4);
	}
	
	
	//MENÚ
	public static int menu(){
		Scanner menu = new Scanner(System.in);
		System.out.println("-------------------------");
        System.out.println("Elige una de estas opciones: ");
        System.out.println("-------------------------");
        System.out.println("1 - Insertar");
        System.out.println("2 - Mostrar");
        System.out.println("3 - Modificar");
        System.out.println("4 - Salir");
		System.out.print(">");
		int opcion = menu.nextInt();
		System.out.println("-------------------------");
		return opcion;
	}
	public static void bucleMenu(){
		int op=0;
		do{
			op=menu();
			switch(op){
			case 1:
				bucleMenuInsertar();
				break;
			case 2: 
				bucleMenuMostrar();
				break;
			case 3:
				bucleMenuModificar();
				break;
			case 4:
				System.out.println("Hasta la próxima");
				break;
			default:
				System.out.println("Introduce un numero válido");
			}
		}while(op!=4);
	}

}

