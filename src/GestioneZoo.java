import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestioneZoo {
    private List<Leone> leoni;
    private List<Tigre> tigri;
    private List<Aquila> aquile;

    public GestioneZoo() {
        this.leoni = new ArrayList<>();
        this.tigri = new ArrayList<>();
        this.aquile = new ArrayList<>();
    }

    public void addLeone(Leone leone){
        leoni.add(leone);
    }

    public void addTigre(Tigre tigre){
        tigri.add(tigre);
    }

    public void addAquila(Aquila aquila){
        aquile.add(aquila);
    }

    public Leone leoneAlto() {
        return leoni.stream().max(Comparator.comparing(Leone::getAltezza)).orElse(null);
    }

    public Leone leoneBasso() {
        return leoni.stream().min(Comparator.comparing(Leone::getAltezza)).orElse(null);
    }

    public Tigre tigreAlto() {
        return tigri.stream().max(Comparator.comparing(Tigre::getAltezza)).orElse(null);
    }

    public Tigre tigreBasso() {
        return tigri.stream().min(Comparator.comparing(Tigre::getAltezza)).orElse(null);
    }

    public Aquila aquilaAlto() {
        return aquile.stream().max(Comparator.comparing(Aquila::getAltezza)).orElse(null);
    }

    public Aquila aquilaBasso() {
        return aquile.stream().min(Comparator.comparing(Aquila::getAltezza)).orElse(null);
    }


    public Animale animaleConCodaLunga() {
        Leone leoneConCodaLunga = leoni.stream().max(Comparator.comparing(Leone::getLunghezzaCoda)).orElse(null);
        Tigre tigreConCodaLunga = tigri.stream().max(Comparator.comparing(Tigre::getLunghezzaCoda)).orElse(null);

        if(leoneConCodaLunga.getLunghezzaCoda() > tigreConCodaLunga.getLunghezzaCoda()){
            return leoneConCodaLunga;
        }else{
            return tigreConCodaLunga;
        }
    }

    public Aquila aquilaConMaggioreAperturaAlare() {
        return aquile.stream().max(Comparator.comparing(Aquila::getAperturaAlare)).orElse(null);
    }
}
