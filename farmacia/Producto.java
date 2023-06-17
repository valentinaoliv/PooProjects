
public class Producto
{
    private String nombre;
    private String codigo;
    private double temperatura;

    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public void setCodigo (String codigo){
        this.codigo=codigo;
    }

    public void setTemperatura (double temperatura){
        this.temperatura=temperatura;
    }

    public String getNombre(){
        return nombre;   
    }

    public String getCodigo(){
        return codigo;   
    }

    public double getTemperatura(){
        return temperatura;   
    }
}
