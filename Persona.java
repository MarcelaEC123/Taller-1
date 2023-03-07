abstract class Persona{
    String Nombre;
    int Edad;
    int Peso;
    int Estatura;
    String Genero;

       
    public void Persona(String Nombre, int Edad, int Peso, int Estatura, String Genero){ 
         this.Nombre = Nombre;
         this.Edad = Edad;
         this.Peso = Peso;
         this.Estatura  = Estatura; 
         this.Genero = Genero;    
    }
    
    public abstract String Correr();
 
  }