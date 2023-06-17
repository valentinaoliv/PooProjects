
public class Persona
{
    private String nombre, mail,numIdentificacion,numCelular;
    private int edad;

    public Persona(String nombre,String numIdentificacion,int edad, String mail, String numCelular){
        this.nombre=nombre;
        this.numIdentificacion=numIdentificacion;
        this.edad=edad;
        this.mail=mail;
        this.numCelular=numCelular;
    }
    
    public Persona(){}
    
    public String getNumIdentificacion(){
        return numIdentificacion;
    }

    public void imprimirRegistro(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Numero identificación : " +numIdentificacion);
        System.out.println("Edad : "+edad);
        System.out.println("Correo electronico : "+mail);
        System.out.println("Numero celular : "+numCelular);
    }

}
