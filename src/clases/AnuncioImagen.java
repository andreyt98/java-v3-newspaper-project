package clases;

public class AnuncioImagen extends Anuncio{
    
    //Atributos
    private double milimetroCuadrado;
    private double costoConMilimetro;
    private double costoConMilimetroIva;

    public AnuncioImagen(double milimetroCuadrado, double costoConMilimetro, double costoConMilimetroIva, String seccion, String titulo, String fecha, String descripcion, double costo, double costoIva) {
        super(seccion, titulo, fecha, descripcion, costo, costoIva);
        this.milimetroCuadrado = milimetroCuadrado;
        this.costoConMilimetro = costoConMilimetro;
        this.costoConMilimetroIva = costoConMilimetroIva;
    }

    public AnuncioImagen(){
        super();
        this.milimetroCuadrado = 0;
        this.costoConMilimetro = 0;
        this.costoConMilimetroIva = 0;
    }

    //setters y getters   
    //cantidad de milimetros de la imagen
    public void setMilimetros(double milimetroCuadrado){           
        this.milimetroCuadrado = milimetroCuadrado; 
    }
    
    public double getMilimetros(){      
        return milimetroCuadrado;        
    }

    @Override
    public double getCosto() {
        return costoConMilimetro;
    }

    @Override
    public void setCosto(double costoConMilimetro) {
        this.costoConMilimetro = costoConMilimetro;
    }
 
    @Override
    public double getCostoIva() {
        return costoConMilimetroIva;
    }

    @Override
    public void setCostoIva(double costoConMilimetroIva) {
        this.costoConMilimetroIva = costoConMilimetroIva;
    }
   
    //métodos de costo
    public double costo(double costo, double milimetroCuadrado) {

        costoConMilimetro = costo + (25*milimetroCuadrado);

        return costoConMilimetro;
    }
   
    public double costoIva(double costoConMilimetro, double milimetroCuadrado) {

        costoConMilimetroIva = costoConMilimetro + (costoConMilimetro*0.13);

        return costoConMilimetroIva;
    }    
}
