public class Ingreso {
	private int codIngreso;
	private int codMedico;
	private int codPaciente;
	private String numHabitacion;
	private int numCama;
	private String fechaIngreso;

	public Ingreso(){
		this.codIngreso = 0;
		this.codMedico = 0;
		this.codPaciente = 0;
		this.numHabitacion = "";
		this.numCama = 0;
		this.fechaIngreso = "";
	}

	/*
	 * Getter & Setters
	 */
	public int getCodIngreso() {
		return codIngreso;
	}

	public void setCodIngreso(int codIngreso) {
		this.codIngreso = codIngreso;
	}

	public int getCodMedico() {
		return codMedico;
	}

	public void setCodMedico(int codMedico) {
		this.codMedico = codMedico;
	}

	public int getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}

	public String getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(String numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public int getNumCama() {
		return numCama;
	}

	public void setNumCama(int numCama) {
		this.numCama = numCama;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}	
}
