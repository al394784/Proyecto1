
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personas{
    String nombre;
    String correo;
    List<Tareas> tareas;

    public void Personas(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nombre de la persona:\n");
        this.nombre=sc.nextLine();
        System.out.println("Correo de la persona:\n");
        this.correo=sc.nextLine();

        this.tareas=new ArrayList<>();

    }

    public  void addTarea(Tareas tarea){
        this.tareas.add(tarea);
    }
    public void rmTarea(Tareas tarea){
        this.tareas.remove(tarea);
    }
}
