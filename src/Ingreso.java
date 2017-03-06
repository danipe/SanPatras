import java.util.Scanner;

public class Ingreso {
	private int codIngreso;
	private int codMedico;
	private int codPaciente;
	private String numHabitacion;
	private int numCama;
	private String fechaIngreso;

	public Ingreso(int codigo){
		setCodPaciente();
		setCodMedico();
		setNumHabitacion();
		setNumCama();
		setFechaIngreso();
		setCodIngreso(codigo);
		
	}

	/*
	 * Getter & Setters
	 */
	public int getCodIngreso() {
		return codIngreso;
	}

	public void setCodIngreso(int codigo) {
		this.codIngreso=codigo;
	}

	public int getCodMedico() {
		return codMedico;
	}

	public void setCodMedico() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el codigo del medico para el ingreso");
		System.out.print(">");
		this.codMedico = sc.nextInt();
	}

	public int getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el codigo del paciente para el ingreso");
		System.out.print(">");
		this.codPaciente = sc.nextInt();
	}

	public String getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de habitacion para el ingreso");
		System.out.print(">");
		this.numHabitacion = sc.nextLine();
	}

	public int getNumCama() {
		return numCama;
	}

	public void setNumCama() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de cama para el ingreso");
		System.out.print(">");
		this.numCama = sc.nextInt();
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la fecha de ingreso");
		System.out.print(">");
		this.fechaIngreso = sc.nextLine();
	}	
}
