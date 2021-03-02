
import java.util.ArrayList;
import java.util.List;

public class Personas {
    String nombre;
    String correo;
    List<Tareas> tareas = new ArrayList<Tareas>();

    public void Personas(){

    }
    public void Personas(String nombre,String correo,ArrayList<Tareas> tareas){
        this.nombre=nombre;
        this.correo=correo;
        this.tareas=tareas;
    }

    public  void addTarea(Tareas tarea){
        this.tareas.add(tarea);
    }
    public void rmTarea(Tareas tarea){
        this.tareas.remove(tarea);
    }
}
