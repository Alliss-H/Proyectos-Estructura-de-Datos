import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Portafolio {
	
	public Map<Integer, Proyecto> proyectos = new HashMap<Integer, Proyecto>();
	
	public void addProyecto(Proyecto proyecto) {
		proyectos.put(proyecto.getId(), proyecto);
	}
	
	public Proyecto getProyecto(int id) {
		// implementar
		return null;
	}
	
	public List<Proyecto> getProyectosTerminados(){
		List<Proyecto> result = new ArrayList<>();
		return result;
	}
	
	public List<Proyecto> getProyectosSinTerminados(){
		List<Proyecto> result = new ArrayList<>();
		return result;
	}

}
