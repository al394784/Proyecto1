import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tareas {
    String titulo;
    String descripcion;
    List<Personas> personas;
    Personas responsable;
    int prioridad;
    Date fechaCreacion;
    Date fechafin;
    boolean finalizada;
    String resultado;
    List<String> etiqueta;

    public void Tareas(){

    }
    public void Tareas(String titulo, String descripcion,Personas responsable,int prioridad, String resultado){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.personas= new ArrayList<Personas>();
        this.responsable=responsable;
        this.prioridad=prioridad;
        this.fechaCreacion=new Date();
        this.finalizada=false;
        this.resultado=resultado;
        this.etiqueta = new ArrayList<String>();
    }
    public void tareafin(){
        finalizada=false;
        this.fechafin= new Date();
    }

    public void addPersona(Personas per){
        this.personas.add(per);
    }

    public void rmPersona(Personas per){
        this.personas.remove(per);
    }


}
