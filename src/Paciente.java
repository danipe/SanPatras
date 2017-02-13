import java.util.Scanner;

public class Paciente {
	
	private int codPaciente;
	private String nombrePaciente;
	private String apedilloPaciente;
	private String direccionPaciente;
	private String poblacionPaciente;
	private String provinciaPaciente;
	private int cpPaciente;
	private String telefPaciente;
	private String fechaNacimientoPaciente;

	
	public Paciente(int codigo){
		this.setNombrePaciente();
		this.setApedilloPaciente();
		this.setFechaNacimientoPaciente();
		this.setTelefPaciente();
		this.setPoblacionPaciente();
		this.setProvinciaPaciente();
		this.setDireccionPaciente();
		this.setCpPaciente();
		this.setCodPaciente(codigo);		
	}
	
	/*
	 * Getters & Setters
	 */
	public String getNombrePaciente(){
		return nombrePaciente;
	}
	public void setNombrePaciente(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del paciente");
		System.out.print(">");
		this.nombrePaciente = sc.nextLine();
	}
	public String getApedilloPaciente() {
		return apedilloPaciente;
	}

	public void setApedilloPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los apellidos del paciente");
		System.out.print(">");
		this.apedilloPaciente = sc.nextLine();
	}

	public String getDireccionPaciente() {
		return direccionPaciente;
	}

	public void setDireccionPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la direccion del paciente");
		System.out.print(">");
		this.direccionPaciente = sc.nextLine();
	}

	public String getPoblacionPaciente() {
		return poblacionPaciente;
	}

	public void setPoblacionPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la poblacion del paciente");
		System.out.print(">");
		this.poblacionPaciente = sc.nextLine();
	}

	public String getProvinciaPaciente() {
		return provinciaPaciente;
	}

	public void setProvinciaPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la provincia del paciente");
		System.out.print(">");
		this.provinciaPaciente = sc.nextLine();
	}

	public int getCpPaciente() {
		return cpPaciente;
	}

	public void setCpPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el codigo postal del paciente");
		System.out.print(">");
		this.cpPaciente = sc.nextInt();
	}

	public String getTelefPaciente() {
		return telefPaciente;
	}

	public void setTelefPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el telefono del paciente");
		System.out.print(">");
		this.telefPaciente = sc.nextLine();
	}

	public String getFechaNacimientoPaciente() {
		return fechaNacimientoPaciente;
	}

	public void setFechaNacimientoPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la fecha de nacimiento del paciente");
		System.out.print(">");
		this.fechaNacimientoPaciente = sc.nextLine();
	}
	public int getCodPaciente(){
		return codPaciente;
	}
	public void setCodPaciente(int codigo){
		this.codPaciente=codigo;		
	}
}
