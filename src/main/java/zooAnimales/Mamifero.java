package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
    this.pelaje = pelaje;
    this.patas = patas;
    listado.add(this);
    }
    public Mamifero (){
        listado.add(this);
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
    caballos++;
    return caballo;
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones++;
        return leon;
    }
    public static int cantidadMamiferos(){
        return listado.size();
    }
    public boolean getPelaje() {
        return pelaje;
    }
    public boolean isPelaje() {
        return pelaje;
    }
    public int getPatas() {
        return patas;
    }
}
