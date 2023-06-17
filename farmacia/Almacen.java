
public class Almacen
{
    private Lote lotes;
    private String nombreAlmacen;

    public Almacen(String nombreAlmacen){
        this.nombreAlmacen=nombreAlmacen;
        lotes = new Lote();
    }

    public void agregarProducto(Producto p){
        lotes.agregarProducto(p);

    }

    public String getNombre(){
        return nombreAlmacen;
    }

    public void imprimirValorLote(){
        lotes.imprimirValorLote();
    }
}
