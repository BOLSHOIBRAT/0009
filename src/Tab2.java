public class Tab2 extends Tab1 {
    private int nalog;
    private int clear_summa;
    public Tab2(){
        nalog = 0;
        clear_summa = 0;
    }
    public Tab2(String fio, String type_oplaty, int summa){
        super.setFio(fio);
        super.setType_oplaty(type_oplaty);
        super.setSumma(summa);
        if(type_oplaty == "ставка" || type_oplaty == "почасовая"){
            nalog = 20;
        }
        else if (type_oplaty == "сдельная"){
            nalog = 15;
        }
        else{
            nalog = 100;
        }
        clear_summa = summa-(summa*nalog)/100;
    }

    public int getNalog() {
        return nalog;
    }

    public void setNalog(int nalog) {
        this.nalog = nalog;
    }

    public int getClear_summa() {
        return clear_summa;
    }

    public void setClear_summa(int clear_summa) {
        this.clear_summa = clear_summa;
    }

    @Override
    public String toString() {
        return "Tab2{" +
                "nalog=" + nalog +
                ", clear_summa=" + clear_summa +
                '}';
    }
}
