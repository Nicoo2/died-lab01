package died.lab01.problema02;

public class Temperatura {
	
	
	private double grados;
	private Escala escala;
	
	
	public Temperatura() {
		this.grados=0;
		this.escala= Escala.CELCIUS;
	}
	public Temperatura(double g, Escala e) {
		this.grados = g;
		this.escala = e;
	}
	
	public String toString() {
		String s= new String();
		Escala key= this.escala;
		switch (key) {
		case CELCIUS :
			s = this.grados + "C°" ;
			break;
		case FAHRENHEIT :
			s = this.grados + "F°" ;
			break;
		default:
			break;
		}
		return s;
	}
	
	public double asCelcius() {
		if(this.escala == Escala.CELCIUS) {
			return this.grados;
		}

		double res= this.grados - 32.0;
		res = (res * 5) /9;
		return res;
		
	}
	
	public double asFahrenheit() {
		
		if(this.escala == Escala.FAHRENHEIT) {
			return this.grados;
		}

		double res= (this.grados  * 9) /5;
		res +=32.0;
		return res;
	}
	
	public void aumentar(Temperatura temp) {	
		if(this.escala == temp.escala) {
			this.grados =this.grados + temp.grados;
		}
		else {
			if(this.escala == Escala.CELCIUS) {
				this.grados = this.grados + temp.asCelcius(); 
			}
			else {
				this.grados = this.grados + temp.asFahrenheit();
			}
		}	
			
	}
		
	public void disminuir(Temperatura temp) {	
		if(this.escala == temp.escala) {
			this.grados =this.grados - temp.grados;
		}
		else {
			if(this.escala == Escala.CELCIUS) {
				this.grados = this.grados- temp.asCelcius(); 
			}
			else {
				this.grados = this.grados- temp.asFahrenheit();
			}
		}	
			
	}
	public double getGrados() {
		return grados;
	}
	public void setGrados(double grados) {
		this.grados = grados;
	}
	public Escala getEscala() {
		return escala;
	}
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	
	
	
}
