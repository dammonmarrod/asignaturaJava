package actividad04_0485.ejercicio03.vehiculos;

public class Seguro implements IAlquilable{
     double precioAlquiler;
    int numeroDiasAlquier;
    private String nombreSeguro;
    private String descripcion;


    
    @Override
    public double getPrecioTotalAlquilerPorDias() {
        return numeroDiasAlquier*precioAlquiler;
    }
    

    @Override
    public String toString() {
      return "Seguro "+nombreSeguro+" , Descripcion:"+descripcion
      +" precio:"+precioAlquiler+" alquilado: "+this.numeroDiasAlquier
      +" total:"+getPrecioTotalAlquilerPorDias();

    }

    @Override
    public void setNumeroDias(int n) {
       this.numeroDiasAlquier = (n);

    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Seguro(String nombreSeguro, String descripcion, double precioAlquiler) {
        this.nombreSeguro = nombreSeguro;
        this.descripcion = descripcion;
        this.precioAlquiler = precioAlquiler;
    }

    
    
}
