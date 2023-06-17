
public class Arrendatario extends Residente
{
    private String numContrato;
    
    public Arrendatario(){}
    

    public Arrendatario(String nombre,String numIdentificacion,int edad, String mail, String numCelular, int numCasa, int numManzana,boolean autorizacion,String numContrato){
        super(nombre, numIdentificacion, edad, mail, numCelular, numCasa, numManzana,autorizacion);
        this.numContrato=numContrato;
    }
    
    @Override
    public void imprimirRegistro(){
        super.imprimirRegistro();
        System.out.println("Numero contrato arriendo : " + numContrato);

    }

}
