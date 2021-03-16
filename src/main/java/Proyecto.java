import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proyecto {
    String titulo;
    List<Tareas> tareas;
    List<Personas> personas;

    public void Proyecto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el título del proyrcto");
        this.titulo=sc.next();
        this.tareas=new ArrayList<Tareas>();
        this.personas=new ArrayList<Personas>();
    }

    public void addPersonas(){
        Personas per = new Personas();
        this.personas.add(per);
    }
    public void MostrarPersonas(){
        System.out.println("Las personas asignadas a  este proyecto son:\n");
        for (int i=0; i<this.personas.size();i++){
            String per= this.personas.get(i).nombre;
            System.out.println("\t"+per+"\n");
        }
    }

    public void MostrarTareas(){
        System.out.println("Las tareras del proyecto "+this.titulo+"son:\n");
        for (int i=0; i<this.tareas.size();i++){
            Tareas tarea=this.tareas.get(i);
            System.out.println("Título"+tarea.titulo+"\n\t");
            tarea.MostrarPersonas();
            if (tarea.finalizada){
                System.out.println("La tarea está finalizada\n");
            }
            else{
                System.out.println("La tarea no está finalizada\n");
            }
            System.out.println("El resultado es: "+tarea.resultado);
        }
    }
}
