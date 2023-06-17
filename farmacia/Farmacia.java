
public class Farmacia
{
    private Almacen[] almacenes;

    public Farmacia(String nombreAlmacen){
        almacenes= new Almacen[4];
        almacenes[0]=new Almacen("Oriente");
        almacenes[1]=new Almacen("Occidente");
        almacenes[2]=new Almacen("Norte");
        almacenes[3]=new Almacen("Sur");

    }

    public void agregarProducto(int nAlmacen,Producto p){
        Almacen a= almacenes[nAlmacen];
        a.agregarProducto(p);
    }
    
    public void calcularValorAlmacenamiento(){
        for(int i =0; i<4;i++){
            Almacen al=almacenes[i];
            System.out.println("******Almacen: "+al.getNombre()+"*******");
            al.imprimirValorLote();        
        }
    }
}


