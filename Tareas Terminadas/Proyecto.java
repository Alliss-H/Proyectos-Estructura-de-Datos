import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	
	private int id;
	
	public Proyecto(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	private List<Tarea> tareas = new ArrayList<Tarea>();
	
	public void addTarea(Tarea tarea) {
		tareas.add(tarea);
	}
	
	public Tarea getTarea(int id) {
		for(Tarea t: tareas) {
			if(t.getId() == id)
				return t;
		}
		return null;
	}
	
	public void terminarTarea(int id) {
		// implementar
	}
	
	public boolean esTerminado() {
		// implementar
		return false;
	}
	
	public List<Tarea> getTareasSinTerminar(){
		// implementar
		List<Tarea> result = new ArrayList<>();
		return result;
	}
	
	public List<Tarea> getTareasTerminadas(){
		// implementar
		List<Tarea> result = new ArrayList<>();
		return result;
	}
}
