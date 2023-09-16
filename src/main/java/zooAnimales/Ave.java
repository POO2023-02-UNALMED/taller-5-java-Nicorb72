package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    public Ave(){}
    public static Ave crearAguila (String nombre, int edad, String genero){
        Ave aguila = new Ave(nombre, edad, "montañas", genero, "blanco y amarillo" );
        aguilas++;
        return aguila;
    }
    public static Ave crearHalcon (String nombre, int edad, String genero){
        Ave halcon = new Ave(nombre, edad, "montañas", genero, "cafe glorioso" );
        halcones++;
        return halcon;
    }
    public String movimiento (){
        return "volar";
    }
    public static int cantidadAves(){
        return listado.size();
    }

}
