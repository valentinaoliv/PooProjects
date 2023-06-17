
public class Propietario extends Residente
{
    private String numPropiedad;
    private Casa[]propiedades;
    private int numDeCasas=1;
    private Casa c;

    public Propietario(String nombre,String numIdentificacion,int edad, String mail,String numCelular, int numCasa, int numManzana,boolean autorizacion,Casa c,String numPropiedad){
        super(nombre, numIdentificacion, edad, mail, numCelular, numCasa, numManzana,autorizacion);
        this.c=c;
        this.numPropiedad=numPropiedad;
        propiedades= new Casa[10];
        propiedades[0]=c;
    }

    public Propietario(){}

    public void agregarCasa(Casa c) {
        propiedades[numDeCasas] = c;
        numDeCasas ++;
    }

    @Override
    public void imprimirRegistro(){
        super.imprimirRegistro();
        System.out.println("Número de propiedades : " +numDeCasas);
        System.out.println("Número certificado de propiedad en la que reside : " +numPropiedad);
    }

}
