import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Flat> flats = new ArrayList<>();

    public void add (Flat flat){
        flat.print();
        flats.add(flat);
    }
    public void remove (Flat flat){
        for (int i = 0; i < flats.size(); i++){
            Flat flat1 = flats.get(i);
            if (flat1.getNumberHouse() == flat.getNumberHouse() && flat1.getNumberFlat() == flat.getNumberFlat() &&
                    flat1.getNumberStructure() == flat.getNumberStructure() && flat1.getNumberKorpus().equals(flat.getNumberKorpus())){
                flats.remove(i);
            }
        }
    }

    public void check(Flat flat){
        for (Flat flat1: flats){
            if (flat1.getNumberHouse() == flat.getNumberHouse() && flat1.getNumberFlat() == flat.getNumberFlat() &&
                    flat1.getNumberStructure() == flat.getNumberStructure() && flat1.getNumberKorpus().equals(flat.getNumberKorpus())){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    public void getAll(){
        for (Flat flat: flats) {
            flat.print();
        }
    }

}
