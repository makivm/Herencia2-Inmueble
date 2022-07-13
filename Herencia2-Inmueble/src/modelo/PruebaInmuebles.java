package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaInmuebles {

	public static void main(String[] args) {
		List<Inmueble> lista=new ArrayList<Inmueble>();
		
		System.out.println("------------------------------------------------------------------------------\n				  PISO VPO 20 ANOS\n------------------------------------------------------------------------------");
		Piso VPOantiguedad20=new Piso("2456SA",75,85000,"piso bajo exterior de tres habitaciones y un baño.vpo de 20 años",1200,3,true,false,20);
		lista.add(VPOantiguedad20);
		System.out.println("El IBI asociado al Piso de VPO con antiguedad de 20 años es: "+VPOantiguedad20.calculaIBI());
		System.out.println("El precio de venta asociado al Piso de VPO con antiguedad de 20 años es: "+VPOantiguedad20.calculaPrecioVenta());
		
		System.out.println("\n------------------------------------------------------------------------------\n				ATICO 5 DORMITORIOS\n------------------------------------------------------------------------------");
		Piso Atico = new Piso("4546548QE", 150, 220000, "atico de 5 dormitorios con terraza de 50m2 y cochera en parking",1800 , 4, false, true, 12);
		lista.add(Atico);
		System.out.println("El IBI asociado al Atico de 4 dormitorios es : "+Atico.calculaIBI());
		System.out.println("El precio de venta asociado al Atico de 4 dormitorios es : "+Atico.calculaPrecioVenta());
		
		System.out.println("\n------------------------------------------------------------------------------\n				ATICO VPO 26 ANOS\n------------------------------------------------------------------------------");
		Piso AticoVPOantiguedad26= new Piso("123489T",60,70000,"atico vpo de 2 dormitorios interior de 26 años",1100,2,true,true,26);
		lista.add(AticoVPOantiguedad26);
		System.out.println("El IBI asociado al Atico de VPO con antiguedad de 26 años es: "+AticoVPOantiguedad26.calculaIBI());
		System.out.println("El precio de venta asociado al Atico de VPO con antiguedad de 26 años es: "+AticoVPOantiguedad26.calculaPrecioVenta());
		
		System.out.println("\n------------------------------------------------------------------------------\n				PISO 4 DORMITORIOS\n------------------------------------------------------------------------------");
		Piso Piso = new Piso("245879JKL", 90, 100000, "Piso de 4 dormitorios centrico. ",1500 , 4, false, false,15);
		lista.add(Piso);
		System.out.println("El IBI asociado al Piso de 4 dormitorios es: "+Piso.calculaIBI());
		System.out.println("El precio de venta asociado al Piso de 4 dormitorios es: "+Piso.calculaPrecioVenta());
		
		System.out.println("\n------------------------------------------------------------------------------\n				TERRENO URBANO\n------------------------------------------------------------------------------");
		Terreno TerrenoUrbano=new Terreno("789645C",150, 60000, "terreno urbano de 150m2 construibles y 2HA de terreno", 500, true, 2, 2500);
		lista.add(TerrenoUrbano);
		System.out.println("El IBI asociado al Terreno Urbano es: "+TerrenoUrbano.calculaIBI());
		System.out.println("El precio de venta asociado al Terreno Urbano es: "+TerrenoUrbano.calculaPrecioVenta());
		
		System.out.println("\n------------------------------------------------------------------------------\n				TERRENO RUSTICO\n------------------------------------------------------------------------------");
		Terreno TerrenoRustico=new Terreno("789645C",0, 40000, "terreno rustico de 5HA", 0, false, 5, 10000);
		lista.add(TerrenoRustico);
		System.out.println("El IBI asociado al Terreno Rustico es: "+TerrenoRustico.calculaIBI());
		System.out.println("El precio de venta asociado al Terreno Rustico es: "+TerrenoRustico.calculaPrecioVenta());

		System.out.println("\n------------------------------------------------------------------------------\n		LISTADO DE INMUEBLES ORDENADOS POR SUPERFICIE\n------------------------------------------------------------------------------");
		Collections.sort(lista);
		for (Inmueble inmueble : lista) {
			System.out.println(inmueble);
		}
		
	}

}
