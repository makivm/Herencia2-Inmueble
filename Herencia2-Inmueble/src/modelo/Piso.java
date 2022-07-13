package modelo;

public class Piso extends Inmueble {

	// definicion de atributos propios del piso
	private int numHabitaciones;
	private boolean vpo;
	private boolean atico;
	private int antiguedad;

	// Constructor sin par�metros, que establece el numero de habitaciones a 0 y vpo
	// a false
	public Piso() {
		super();
		this.numHabitaciones = 0;
		this.vpo = false;
	}

	// Constructor parametrizado que invoque al constructor con par�metros de la
	// superclase
	public Piso(String num_ref, double superficie_m2, double valorInmueble, String descripcion, double precio_m2,
			int numHabitaciones, boolean vpo, boolean atico, int antiguedad) {
		super(num_ref, superficie_m2, valorInmueble, descripcion, precio_m2);
		this.numHabitaciones = numHabitaciones;
		this.vpo = vpo;
		this.atico = atico;
		this.antiguedad = antiguedad;
	}
	
	public Piso(Piso i) {
		super(i);
		this.numHabitaciones = i.numHabitaciones;
		this.vpo = i.vpo;
		this.atico = i.atico;
		this.antiguedad = i.antiguedad;
	}

	// Redefine el m�todo toString para mostrar los detalles del Piso/inmueble
	@Override
	public String toString() {
		return "Piso [num_ref=" + num_ref + ", superficie_m2=" + superficie_m2 + ", valorInmueble=" + valorInmueble
				+ ", descripcion=" + descripcion + ", precio_m2=" + precio_m2 + ", numHabitaciones=" + numHabitaciones
				+ ", vpo=" + vpo + ", atico=" + atico + ", antiguedad=" + antiguedad + "]";
	}
	
	// Getter y setters
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public boolean isVpo() {
		return vpo;
	}

	public void setVpo(boolean vpo) {
		this.vpo = vpo;
	}

	public boolean isAtico() {
		return atico;
	}

	public void setAtico(boolean atico) {
		this.atico = atico;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	// Implementa el m�todo calcula IBI de tal manera que devuelva el valor
	// catastral multiplicado por coefUrbano. Si el inmueble es de tipo VPO hazle un
	// rebaja del 50%
	@Override
	public double calculaIBI() {
		double IBI = super.valorInmueble * coef_urb;
		if (this.vpo)
			return IBI / 2;
		else
			return IBI;
	}

	// Implementa el m�todo calculaPrecioVenta. Se calcula mediante el precio del m2
	// por el n�mero de metros que tiene el piso. Si el piso es un �tico incrementa
	// el valor en un 6%. Si adem�s es un piso de VPO s�lo se puede vender si tiene
	// m�s de 25 a�os de antig�edad, de lo contrario devuelve 0 euros
	@Override
	public double calculaPrecioVenta() {
		double precio=super.getPrecio_m2()*super.superficie_m2;
		if (atico) 
			precio=precio*1.06;			
		if (vpo && this.antiguedad<=25) 
			precio=0;
		return precio;
	}
}
