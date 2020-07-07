
public class ProyectosTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portafolio<Proyectos> portafolio = new Portafolio<Proyectos>();
		Proyectos casa= new Proyectos("Casa","Proyecto personal");
		Proyectos sauna = new Proyectos("Sauna","Sauna para mi casa");
		Proyectos piscina = new Proyectos("Piscina","Temperada y de 5 metros de profundidad");
		sauna.elevatorPitch();
		piscina.elevatorPitch();
		sauna.setInitialCost(50000);
		piscina.setInitialCost(40000);
		portafolio.agregar(casa);
		portafolio.agregar(sauna);
		portafolio.agregar(piscina);
		
		
		portafolio.show();
		//Costo total
		int total= portafolio.getPortafolioCost();
		System.out.println("Costo total: "+total);
	}

}
