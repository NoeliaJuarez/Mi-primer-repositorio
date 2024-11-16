package BancoTonyStark;
class Persona{
    String nombre;
    String sexo;
    int edad;


    Persona(String nombre, String sexo, int edad){
this.nombre=nombre;
this.edad=edad;
this.sexo=sexo;

}
void hablar(){
    System.out.println("Hola soy una persona");
    
}
}

class Programa{
    public static void main(String[] args){
       System.out.println("Hello world"); 
    }
}
