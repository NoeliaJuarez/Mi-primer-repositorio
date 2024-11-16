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

class Cliente extends Persona{
int numero;

Cliente(int numero,String sexo, int edad,String nombre){
super (nombre,sexo,edad);
this.numero=numero;
}
}
class Banco{
    String nombre;
    Cliente  clientes[];

    Banco(int cantidadClientes,String nombre){
        clientes = new Cliente[cantidadClientes];
        this.nombre=nombre;
    }
    Cliente crearCliente(String nombre, String sexo, int edad, int numero){
        System.out.println("Creando cliente.....");
        Cliente cliente=new Cliente(numero, sexo, edad, nombre);

        for(int i=0; i < clientes.length;i++){
            if(clientes[i]==null){
                clientes[i]=cliente;
                System.out.println("Cliente creado exitosamente");
                break;
            }
        }
        return cliente;
    }
    void listarClientes(){
        for(int i =0; i < clientes.length;i++){
            if(clientes[i] !=null){
                Cliente cliente = clientes[i];
                System.out.println("Cliente "+ cliente.nombre+"No: " + cliente.numero);
                
            }
        }
    }
}

class Programa{
    public static void main(String[] args){
       System.out.println("Welcome to the bank"); 

    }
}
