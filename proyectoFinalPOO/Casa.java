
public class Casa extends ZonaResidencial
{
    private Residente [] residentes;
    private Visitante[] visitantes;
    private int numHabitaciones, numResidentes, numVisitantes;

    public Casa(int numHabitaciones, String nombreZona,Persona encargado){
        super(nombreZona,encargado);
        this.numHabitaciones=numHabitaciones;
        residentes= new Residente[8];
        visitantes= new Visitante[12];
    }

    public void agregarResidente(Residente r) {
        residentes[numResidentes] = r;
        numResidentes ++;
    }

    public void agregarVisitante(Visitante v) {
        visitantes[numVisitantes] = v;
        numVisitantes ++;
    }

}
