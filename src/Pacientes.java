public class Pacientes {
	
	private String nombrePaciente;
	private String apedilloPaciente;
	private String direccionPaciente;
	private String poblacionPaciente;
	private String provinciaPaciente;
	private int cpPaciente;
	private int telefPaciente;
	private String fechaNacimientoPaciente;
	/*
	 * Constructor
	 */
	public Pacientes(){
		this.codPaciente = 0;
		this.nombrePaciente = "";
		this.apedilloPaciente = "";
		this.direccionPaciente = "";
		this.poblacionPaciente = "";
		this.provinciaPaciente = "";
		this.cpPaciente = 0;
		this.telefPaciente = 0;
		this.fechaNacimientoPaciente = "";
	}
	
	/*
	 * Getters & Setters
	 */
	private int codPaciente;
	public String getApedilloPaciente() {
		return apedilloPaciente;
	}

	public void setApedilloPaciente(String apedilloPaciente) {
		this.apedilloPaciente = apedilloPaciente;
	}

	public String getDireccionPaciente() {
		return direccionPaciente;
	}

	public void setDireccionPaciente(String direccionPaciente) {
		this.direccionPaciente = direccionPaciente;
	}

	public String getPoblacionPaciente() {
		return poblacionPaciente;
	}

	public void setPoblacionPaciente(String poblacionPaciente) {
		this.poblacionPaciente = poblacionPaciente;
	}

	public String getProvinciaPaciente() {
		return provinciaPaciente;
	}

	public void setProvinciaPaciente(String provinciaPaciente) {
		this.provinciaPaciente = provinciaPaciente;
	}

	public int getCpPaciente() {
		return cpPaciente;
	}

	public void setCpPaciente(int cpPaciente) {
		this.cpPaciente = cpPaciente;
	}

	public int getTelefPaciente() {
		return telefPaciente;
	}

	public void setTelefPaciente(int telefPaciente) {
		this.telefPaciente = telefPaciente;
	}

	public String getFechaNacimientoPaciente() {
		return fechaNacimientoPaciente;
	}

	public void setFechaNacimientoPaciente(String fechaNacimientoPaciente) {
		this.fechaNacimientoPaciente = fechaNacimientoPaciente;
	}
}
