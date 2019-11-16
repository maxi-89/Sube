package sube;

public class Sube {
	//declaracion de atributos
	private double saldo;
	private long id;
	private double sNegativo;
	
	//declaracion de contructor con parametros
	public Sube() {
		
		this.setSaldo(0);
		this.setId((long)(Math.random()*1e16));
		this.setsNegativo(-50);
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
	public void setId(long id) {
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
	
	//metodo mostrar  saldo
	public void  mostrarSaldo() {
		
		System.out.println(this.getSaldo()); 
	}
	//metodo cargar saldo
	
	public  double cargar(double importeACargar) {
		this.saldo=this.getSaldo()+importeACargar;
		this.setSaldo(saldo);
		return  saldo;
	}
	
	//metodo viajar
	public void viajar(double tarifa) {
		
	if(this.saldo-tarifa >=this.getsNegativo()) {
		
		
		this.setSaldo(this.saldo=this.getSaldo()-tarifa);
		System.out.println("buen viaje");
		System.out.println("su saldo es : "+this.saldo);
	}
	else {
		System.out.println("no posee saldo suficiente");
	}
	}
//
}
