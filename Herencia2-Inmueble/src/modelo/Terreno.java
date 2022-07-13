package modelo;

public class Terreno extends Inmueble {
	private boolean urbano;
	private double ha;
	private double precio_ha;

	// COnstructor vacio que inicialice urbano a true y ha a 0
	public Terreno() {
		super();
		this.urbano = true;
		this.ha = 0;
	}

	// Constructor parametrizado que invoque al constructor con parámetros de la
	// superclase
	public Terreno(String num_ref, double superficie_m2, double valorInmueble, String descripcion, double precio_m2,
			boolean urbano, double ha, double precio_ha) {
		super(num_ref, superficie_m2, valorInmueble, descripcion, precio_m2);
		this.urbano = urbano;
		this.ha = ha;
		this.precio_ha = precio_ha;
	}

	// Redefine el método toString para mostrar los detalles del Terreno/inmueble
	@Override
	public String toString() {
		return "Terreno [num_ref=" + num_ref + ", superficie_m2=" + superficie_m2 + ", valorInmueble=" + valorInmueble
				+ ", descripcion=" + descripcion + ", precio_m2=" + precio_m2 + ", urbano=" + urbano + ", ha=" + ha
				+ ", precio_ha=" + precio_ha + "]";
	}

	// Crea los getters y setter de la clase
	public boolean isUrbano() {
		return urbano;
	}

	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
	}

	public double getHa() {
		return ha;
	}

	public void setHa(double ha) {
		this.ha = ha;
	}

	public double getPrecio_ha() {
		return precio_ha;
	}

	public void setPrecio_ha(double precio_ha) {
		this.precio_ha = precio_ha;
	}

	// Implementa el método calcula IBI de tal manera que devuelva el valor
	// catastral multiplicado por coefRustico si el terrenos es rústico y por
	// coefUrbano si es urbano.
	@Override
	public double calculaIBI() {
		double IBI = 0;
		if(this.urbano) 
			IBI=this.valorInmueble * coef_urb;
		else 
			IBI = this.valorInmueble * coef_rus;
		return IBI;
	}

	// Implementa el método calculaPrecioVenta. Se calcula mediante el precio del m2
	// por el número de metros que tiene terreno si es rústico. Si es urbano al
	// precio de venta anterior le sumamos el precio que valen las hectáreas de
	// terreno.
	@Override
	public double calculaPrecioVenta() {
		double precio=0;
		if (this.urbano)
			precio=this.precio_m2*this.superficie_m2;
		precio=precio+(this.precio_ha*this.ha);
		return precio;
	}
}
