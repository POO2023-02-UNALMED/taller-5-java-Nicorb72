package zooAnimales;
import gestion.Zona;
public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero) {
        totalAnimales ++;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;

    }
    public Animal(){}

    public static int getTotalAnimales() {
        return totalAnimales;
    }
    public static String totalPorTipo(){
        String cadena ="Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + "Aves: "+  Ave.cantidadAves() + "\n" + "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces() + "\n" + "Anfibios: " + Anfibio.cantidadAnfibios();
        return cadena;
    }
    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String toString() {

        if (zona != null) {
            String salida = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es" + zona.getNombre() + ", en el zoo" + zona.getZoo() + "" ;
            return salida;
        }
        String salida = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
        return salida;
    }
    public String movimiento(){
        return "desplazarse";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitad) {
        this.habitat = habitad;
    }
    public Zona getZona() {
        return zona;
    }
    public void setZona(Zona zona) {
        this.zona = zona;
    }

}

