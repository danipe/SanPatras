
public class estetica {

	String titulo = "San Patras";
	
	public void limpiar(int lineas){
		for(int i=0; i<lineas; i++){
			System.out.print("-");
		}
	}
	
	public void limpiarln(int lineas){
		for (int i=0; i<lineas; i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	
	public void titulo(){
		limpiarln(25);
		System.out.println(titulo);
	}
}
