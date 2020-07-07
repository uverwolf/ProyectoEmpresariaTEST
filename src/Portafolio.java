import java.util.ArrayList;
import java.util.Iterator;
public class Portafolio<Proyect>  implements Iterable<Proyect> {
 ArrayList<Proyect> portafolio = new ArrayList<Proyect>();
 public void agregar(Proyect array) {
	 portafolio.add(array);
	 
 }
	 public  Iterator<Proyect> iterator(){
		 return portafolio.iterator();
	 }
	 	public void show() {
			for(Proyect o : portafolio) {
				if (o instanceof Proyectos) {
					Proyectos  proyecto= (Proyectos) o;
					String x =proyecto.elevatorPitch();
					int total = getPortafolioCost();
					System.out.println(x+"\nCosto total= "+total);
					
				  
				}
			}
	 	}
 
	public int getPortafolioCost() {
		int suma =0 ;
		for(Object o : portafolio) {
			if (o instanceof Proyectos) {
				Proyectos  proyecto= (Proyectos) o;
				
				suma +=proyecto.getInitialCost();
				
			}
		}
		return suma;
	}

}
