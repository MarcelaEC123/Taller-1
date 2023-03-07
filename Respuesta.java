public class Respuesta{ //clase principal que contiene el metodo constructor
    
    
    public static void main(String[] args){ // metodo constructor que sirve como medio para iniciar el programa
          //jugador pasa a ser objeto de la clase persona  
         FutbolistaReal jugador3 = new FutbolistaReal();  /
         Arquero arqueros = new Arquero(); //Crear objeto de la clase futnolistaReal
         jugador3.identificacion("Marcela", 18, 54, 156, "Femenino", "Delantero", 300);
         System.out.println(arqueros.Correr());
         System.out.println(jugador3.Correr());
         System.out.println("El numero de la camisa del jugador es: " + jugador3.getNumcamisa());
         jugador3.setEquip("River Plate");
         System.out.println("El equipo al que pertenece el jugador: " + jugador3.getEquip());
         
    } 
       
}