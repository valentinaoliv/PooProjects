public class AreasComunes extends ZonaResidencial
{
    private Residente[] autorizados; 
    private int numAutorizados;
    
    public AreasComunes(String nombreZona,Persona encargado){
        super(nombreZona,encargado);
        autorizados = new Residente[100];
    }

    public void agregarResidentes(Residente j){
        if(j.getAutorizacion()==true){
            autorizados [numAutorizados]=j;
            numAutorizados++;
        }else{
            System.out.println("La persona con identificación"+j.getNumIdentificacion()+"no está autorizada a ingresar");
        }

    }
}