public class Flat {
    private int numberHouse;
    private String numberKorpus = "";
    private int numberStructure;
    private int numberFlat;

    public Flat(int numberHouse, String numberKorpus, int numberFlat) {
        this.numberHouse = numberHouse;
        this.numberKorpus = numberKorpus;
        this.numberFlat = numberFlat;
    }

    public Flat(int numberHouse, int numberStructure, int numberFlat) {
        this.numberHouse = numberHouse;
        this.numberStructure = numberStructure;
        this.numberFlat = numberFlat;
    }

    public Flat(int numberHouse, String numberKorpus, int numberStructure, int numberFlat) {
        this.numberHouse = numberHouse;
        this.numberKorpus = numberKorpus;
        this.numberStructure = numberStructure;
        this.numberFlat = numberFlat;
    }

    public Flat(int numberHouse, int numberFlat) {
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
    }

    public void print (){
        System.out.println("д."+ numberHouse + " " + "корп." + numberKorpus + " " + "стр." + numberStructure + " " + "кв." + numberFlat);
    }
    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getNumberKorpus() {
        return numberKorpus;
    }

    public void setNumberKorpus(String numberKorpus) {
        this.numberKorpus = numberKorpus;
    }

    public int getNumberStructure() {
        return numberStructure;
    }

    public void setNumberStructure(int numberStructure) {
        this.numberStructure = numberStructure;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }
}
