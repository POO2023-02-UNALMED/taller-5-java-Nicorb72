package test;
import zooAnimales.Anfibio;
import zooAnimales.Animal;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;
import gestion.Zona;

public class prueba {
    public static void main(String[] args) {
        Ave an2 = new Ave("paloma", 5, "ciudad", "F", "gris");
        System.out.println(an2.toString());
    }
}
