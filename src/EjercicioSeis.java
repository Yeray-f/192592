public class EjercicioSeis {
   public static void main(String[] args){
    Coche miCoche = new Coche("Toyota");
    miCoche.acelerar();
   }

}

class Coche {
    String marca;

    public void acelerar() {
        System.out.println("El " + marca + " esta acelerando.");
    }

    public Coche(String marca){
    this.marca = marca;
    }
    
}
