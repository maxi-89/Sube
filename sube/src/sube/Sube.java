package sube;

public class Sube {
	//declaracion de atributos
	private double saldo;
	private double id;
	private double sNegativo;
	
	//declaracion de contructor con parametros
	public Sube(double saldo, double id, double sNegativo) {
		
		this.setSaldo(saldo);
		this.setId(id);
		this.setsNegativo(sNegativo);
	}

	//getters and setters
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getId() {
		return id;
	}


	public void setId(double id) {
		this.id = id;
	}


	public double getsNegativo() {
		return sNegativo;
	}


	public void setsNegativo(double sNegativo) {
		this.sNegativo = sNegativo;
	}
	
	//metodo to string
	
	public  String toString() {
		return "[SALDO:"+this.getSaldo()+"]";
	}
	
	//metodo ver saldo
	public double saldo() {
		
		return this.getSaldo();
	}
	//metodo cargar saldo
	
	public  double cargar(double saldo) {
		saldo=this.getSaldo()+saldo;
		this.setSaldo(saldo);
		return  saldo;
	}
	
	//metodo viajar
	public void viajar(double Saldo, double tarifa) {
		
	if(saldo >this.getsNegativo()) {
		
		
		this.setSaldo(saldo=this.getSaldo()-tarifa);
		System.out.println("buen viaje");
		System.out.println("su saldo es : "+saldo);
	}
	else {
		System.out.println("no posee saldo suficiente");
	}
	}
//
}
