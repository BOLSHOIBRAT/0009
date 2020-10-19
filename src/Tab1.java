public class Tab1 {
    private String fio;
    private String type_oplaty;
    private int summa;
    public Tab1(String fio, String type_oplaty, int summa){
        this.fio = fio;
        if(type_oplaty == "ставка" || type_oplaty == "почасовая" || type_oplaty == "сдельная") {
            this.type_oplaty = type_oplaty;
        }
        else this.type_oplaty = "ошибка!";
        this.summa = summa;
    }
    public Tab1(){
        fio = "";
        type_oplaty = "ставка";
        summa = 0;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getType_oplaty() {
        return type_oplaty;
    }

    public void setType_oplaty(String type_oplaty) {
        this.type_oplaty = type_oplaty;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    @Override
    public String toString() {
        return "Tab1{" +
                "fio='" + fio + '\'' +
                ", type_oplaty='" + type_oplaty + '\'' +
                ", summa=" + summa +
                '}';
    }
}
