package died.lab01.problema03;


import died.lab01.problema02.*;

public class Registro {

	//max capacidad temperatura
	private static final int MESES = 36;
	
	private String ciudad;
	private Temperatura[] historico;
	private int ultimoReg = 0; // CUIDADO SIEMPRE QUEDA AUMENTADO EN 1 A LOR NORMAL
		
	public Registro() {
		this.ciudad = new String("-");
		this.historico = new Temperatura[MESES];
	}
	
	public Registro(String unaCiudad) {
		this.ciudad = unaCiudad;
		this.historico = new Temperatura[MESES];
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Temperatura[] getHistorico() {
		return historico;
	}

	public void setHistorico(Temperatura[] historico) {
		this.historico = historico;
	}
	
	public void imprimir() {
		System.out.println("Para la localidad de : " + this.ciudad);
		System.out.println("Estas son sus ultimos registros de Temperatura: ");
		int l = this.ultimoReg;
		
		for(int  i = 0; i < l; i++) {
		//	System.out.println("| Registro Nº "+(i+1)+"-> " + this.historico[i].toString() + "|");	
			System.out.println(this.historico[i].toString());
		}
		
		
	}
	
	public void agregar(Temperatura t) {
		this.historico[ultimoReg]=t;
		this.ultimoReg +=1;
	}

	
	public double mediaAsCelcius() {
		double media=0;
		int longi = this.ultimoReg;
		for(int j = 0; j < longi; j++) {
			media += this.historico[j].asCelcius();
		}	
		return media / longi;
	}
	
	public double mediaAsFahrenheit() {
		double media=0;
		int longi = this.ultimoReg;
		for(int j = 0; j < longi; j++) {
			media += this.historico[j].asFahrenheit();
		}
		return media / longi;
	}
	
	public double maximo(){
		double maxTemp;
		
		maxTemp= busquedaMaximoAux(this.historico, 0, this.ultimoReg - 1);

		return maxTemp;
	}
	
	public double busquedaMaximoAux(Temperatura[] temp, double max, int i) {
		if ( i == 0 ) {
			if(max < temp[i].getGrados()) {
				return max;
			}
			return max;
		}
		if(max < temp[i].getGrados()) {
			max = temp[i].getGrados();
		}
		return busquedaMaximoAux(temp, max, --i);
	}
		
}







