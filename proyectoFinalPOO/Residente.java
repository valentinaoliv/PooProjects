
public class Residente extends Persona 
{  
    private int numManzana,numCasa;
    private boolean autorizacion;

    public Residente(String nombre,String numIdentificacion,int edad, String mail, String numCelular, int numCasa, int numManzana, boolean autorizacion){
        super(nombre,numIdentificacion, edad, mail, numCelular);  
        this.numCasa=numCasa;
        this.numManzana=numManzana;
        this.autorizacion=autorizacion;
    }

    public Residente(){}

    @Override
    public void imprimirRegistro(){
        super.imprimirRegistro();
        System.out.println("Casa : " +numCasa );
        System.out.println("Manzana : " +numManzana);
    }

    public void pagoAdministracion(){
        double saldo=Math.random();
        if(saldo <0.5){
            autorizacion=true;
        }
        else{
            autorizacion=false;
        }

    }

    public boolean getAutorizacion(){
        return autorizacion;

    }

}
