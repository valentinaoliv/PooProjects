
public class Visitante extends Persona
{
    private String fechaIngreso;
    
    public Visitante(){}
    
    public Visitante(String nombre,String numIdentificacion,int edad, String mail, String numCelular,String fechaIngreso){
        super(nombre, numIdentificacion, edad, mail, numCelular);
        this.fechaIngreso=fechaIngreso;

    }

}
