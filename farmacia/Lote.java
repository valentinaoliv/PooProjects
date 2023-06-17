
public class Lote
{
    private Producto [] Refrigerados;
    private Producto [] noRefrigerados;
    private int cantidadRe;
    private int cantidadNoRe;

    public Lote(){
        Refrigerados = new Producto [100];
        noRefrigerados = new Producto [100];  
    }

    public void agregarProducto(Producto p){
        if(p.getTemperatura()<=20){
            Refrigerados [cantidadRe] = p;
            cantidadRe++;
        }else{
            noRefrigerados [cantidadNoRe] = p;
            cantidadNoRe++;
        }
    }

    public void imprimirValorLote(){
        double valorRefri=cantidadRe*150;
        double valorNoRefri=cantidadNoRe*100;        
        System.out.println("Lote productos refrigerados, Valor: $"+valorRefri+", Cantidad de productos: "+cantidadRe);
        System.out.println("Lote productos no refrigerados, Valor: $"+valorNoRefri+", Cantidad de productos: "+cantidadNoRe);
    }

}
