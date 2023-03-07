class FutbolistaReal extends Persona{
    
    String posicion;
    int numca;
    String equip;
    
    public void identificacion(String Nombre, int Edad, int Peso, int Estatura, String Genero,String posicion, int numca){
        super.Persona(Nombre, Edad, Peso, Estatura, Genero);
        this.posicion = posicion;
        this.numca = numca;
        System.out.println("Nombre: " + Nombre + "\n"+ "Edad: " + Edad + "\n" + "Estatura: " + Estatura + "\n" + 
                           "Genero: " + Genero + "\n" + "Posicion: " + posicion + "\n");
        
        }
        
    
    public String Correr(){
        return("Jugador Corriendo");
    }
      
    public void Pase(){
        System.out.println("Hacer pase ");
    }
    
    public void Centrar(){
        System.out.println("Hacer un centre");
    }
    
    public void Cabecear(){
        System.out.println("Cabecear el balon");
    }
    
    public int getNumcamisa(){ 
        return this.numca; 
    }
    
    public void setEquip(String equipos){
        this.equip = equipos;
    }
    
    public String getEquip(){ 
        return this.equip;
    }
    
}
