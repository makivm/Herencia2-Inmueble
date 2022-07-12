package modelo;

import java.util.Objects;

abstract class Inmueble {
	// declaracion de atributos
	protected String num_ref;
	protected double superficie_m2;
	protected double valorInmueble;
	protected String descripcion;
	protected double precio_m2;
	public static final double coef_urb = 0.85;
	public static final double coef_rus = 0.45;

	// Constructor vacio
	public Inmueble() {
		this.num_ref = "";
		this.superficie_m2 = 0;
		this.valorInmueble = 0;
		this.descripcion = "";
		this.precio_m2 = 0;
	}

	// Constructor con parametros
	public Inmueble(String num_ref, double superficie_m2, double valorInmueble, String descripcion, double precio_m2) {
		this.num_ref = num_ref;
		setSuperficie_m2(superficie_m2);
		this.valorInmueble = valorInmueble;
		this.descripcion = descripcion;
		setPrecio_m2(precio_m2);
	}

	// COnstructor de copia
	public Inmueble(Inmueble i) {
		this.num_ref = i.num_ref;
		this.superficie_m2 = i.superficie_m2;
		this.valorInmueble = i.valorInmueble;
		this.descripcion = i.descripcion;
		this.precio_m2 = i.precio_m2;
	}

	// Metodos getters y setters
	public String getNum_ref() {
		return num_ref;
	}

	public void setNum_ref(String num_ref) {
		this.num_ref = num_ref;
	}

	public double getSuperficie_m2() {
		return superficie_m2;
	}

	public void setSuperficie_m2(double superficie_m2) {
		if (superficie_m2 >= 0) {
			this.superficie_m2 = superficie_m2;
		} else
			this.superficie_m2 = 0;
	}

	public double getValorInmueble() {
		return valorInmueble;
	}

	public void setValorInmueble(double valorInmueble) {
		this.valorInmueble = valorInmueble;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio_m2() {
		return precio_m2;
	}

	public void setPrecio_m2(double precio_m2) {
		if (precio_m2 >= 0) {
			this.precio_m2 = precio_m2;
		} else
			this.precio_m2 = 0;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Inmueble [num_ref=" + num_ref + ", superficie_m2=" + superficie_m2 + ", valorInmueble=" + valorInmueble
				+ ", descripcion=" + descripcion + ", precio_m2=" + precio_m2 + "]";
	}

	// Métodos hashCode y equals para comparar dos inmuebles a través de sus
	// referencia catastrales
	@Override
	public int hashCode() {
		return Objects.hash(num_ref);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return Objects.equals(num_ref, other.num_ref);
	}
	
	public abstract double calculaIBI();
	public abstract double calculaPrecioVenta();

}
