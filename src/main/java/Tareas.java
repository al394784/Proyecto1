import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        this.titulo=titulo;
        System.out.println("Introduce una descripcion de la tarea\n");
        this.descripcion=sc.next();
        System.out.println("Introduce las personas que van a participar en la tarea\n");
        Personas per = new Personas();
        this.personas= new ArrayList<Personas>();
        this.responsable=responsable;
        System.out.println("Que prioridad tiene la tarea(entre 1: muy baja, y 5: muy alta)\n");
        this.prioridad=sc.nextInt();
        this.fechaCreacion=new Date();
        this.finalizada=false;
        System.out.println("Introduce el resultado esperado de la tarea:\n");
        this.resultado=resultado;
        this.etiqueta = new ArrayList<String>();
    }
    public void tareafin(){
        finalizada=true;
        this.fechafin= new Date();
    }

    public void addPersona(Personas per){
        this.personas.add(per);
    }

    public void rmPersona(Personas per){
        this.personas.remove(per);
    }


    public void MostrarPersonas(){
        System.out.println("Las personas asignadas a  este proyecto son:\n");
        for (int i=0; i<this.personas.size();i++){
            if (this.personas.get(i).correo.equals(responsable.correo)){
                System.out.println("\tResponsable: "+this.personas.get(i).nombre+"\n");
            }
            String per= this.personas.get(i).nombre;
            System.out.println("\t"+per+"\n");
        }
    }

}
