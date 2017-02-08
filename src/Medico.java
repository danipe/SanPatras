import java.util.Scanner;

public class Medico {
	private int codigoMedico;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String especialidad;
	
	public Medico(int codigo){
		setNombre();
		setApellidos();
		setTelefono();
		setEspecialidad();		
		setCodigoMedico(codigo);
		
	}

	public int getCodigoMedico() {
		return codigoMedico;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getEspecialidad() {
		return especialidad;
	}

	
	public void setEspecialidad() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la especialidad del medico");
		System.out.print(">");
		this.especialidad = sc.nextLine();
	}
	public void setTelefono() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el telefono del medico");
		System.out.print(">");
		this.telefono =sc.nextLine();
	}
	public void setApellidos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce los apellidos del medico");
		System.out.print(">");
		this.apellidos = sc.nextLine();
	}
	public void setNombre() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el nombre del medico");
		System.out.print(">");
		this.nombre =sc.nextLine();
	}
	public void setCodigoMedico(int codigoMedico) {
		//para definir el codigo le pasaremos el codigo del medico anterior y le añadiremos el siguiente
		this.codigoMedico = codigoMedico++;
	}
	
	
}
