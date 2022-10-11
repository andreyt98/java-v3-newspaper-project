package clases;

public class DatosCliente{
    
    //Atributos
    int id;
    String nombre;
    String primerApellido;
    String segundoApellido;
    int edad;
    
    //constructores
    public DatosCliente(int id, String nombre, String primerApellido, String segundoApellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
    }
   
    public DatosCliente(){
        this.id = 0;
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.edad = 0;
    
    }
  
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    
 @Override
    public String toString(){
        
        return this.getId() + "-" + this.getNombre() + "-" + this.getPrimerApellido() +"-" + this.getSegundoApellido() +"-" + this.getEdad() + "\n";
   
        
    }

}
