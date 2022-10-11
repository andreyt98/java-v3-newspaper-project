
package clases;


public class DatosAnuncio {
    
    //Atributos
    int idCliente;
    String titulo;
    String descripcion;
    String seccion;
    String datoExtra;
    String fecha;
    double costo;
    double costoIva;

    //constructores
    public DatosAnuncio(String titulo, String descripcion, String seccion, String datoExtra, String fecha, double costo, double costoIva) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.seccion = seccion;
        this.datoExtra = datoExtra;
        this.fecha = fecha;
        this.costo = costo;
        this.costoIva = costoIva;
    }

    public DatosAnuncio() {
        this.idCliente = 0;
        this.titulo = "";
        this.descripcion = "";
        this.seccion = "";
        this.datoExtra = "";
        this.fecha = "";
        this.costo = 0;
        this.costoIva = 0;
    }
    
    
    
    //setter y getters
    public int getIdCliente() {    
        return idCliente;
    }

    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDatoExtra() {
        return datoExtra;
    }

    public void setDatoExtra(String datoExtra) {
        this.datoExtra = datoExtra;
    }

    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Double getCostoIva() {
        return costoIva;
    }

    public void setCostoIva(double costoIva) {
        this.costoIva = costoIva;
    }
    
  
    
   
    public String toString(int id ){
        
        String datos =  id +
                        "-" + this.getTitulo() + 
                        "-" + this.getDescripcion() +
                        "-" +this.getSeccion() +
                        "-" + this.getFecha()+
                        "-" + this.getDatoExtra()+
                        "-" + this.getCosto()+
                        "-" + this.getCostoIva()+ "\n";
   
        return datos;
   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


