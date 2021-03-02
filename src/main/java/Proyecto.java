import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    String titulo;
    List<Tareas> tareas;
    List<Personas> personas;

    public void Proyecto(String nombre){
        this.titulo=nombre;
        this.tareas=new ArrayList<Tareas>();
        this.personas=new ArrayList<Personas>();
    }

    public void ListaPersonas(ArrayList<Personas> personas){
        this.personas=personas;
    }
    public void addPersonas(Personas per){
        this.personas.add(per);
    }
}
