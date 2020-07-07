import java.util.ArrayList;
import java.util.Iterator;
public class Portafolio<T>  implements Iterable<T> {
 ArrayList<T> portafolio = new ArrayList<T>();
 public void agregar(T array) {
	 portafolio.add(array);
	 
 }
	 public  Iterator<T> iterator(){
		 return portafolio.iterator();
	 }
	 	public void show() {
			for(Object o : portafolio) {
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
