public class Tab6 extends Tab5 {
    int premia;
    int hours;
    public Tab6(String fio, String type_oplaty, int summa, boolean in_chields, int hours, int premia) {
        int nalog;
        int clear_summa;
        super.setFio(fio);
        super.setType_oplaty(type_oplaty);
        super.setSumma(summa);
        if (type_oplaty == "ставка" || type_oplaty == "почасовая") {
            nalog = 20;
        } else if (type_oplaty == "сдельная") {
            nalog = 15;
        } else if (type_oplaty == "офшор"){
            nalog = 0;
        }
        else {
            nalog = 10000;
        }
        if (in_chields == false && type_oplaty!="офшор") {
            nalog += 5;
        }
        super.setNalog(nalog);
        clear_summa = summa - (summa * nalog) / 100;
        if(type_oplaty=="почасовая"){
            tugriki = (clear_summa/2)*8;
            clear_summa /=2;
            System.out.println("clear = " + clear_summa + " tugriki = " + tugriki);
        }
        if(hours> 200 && type_oplaty != "офшор"){
            clear_summa += premia;
        }
        System.out.println(clear_summa);
        super.setClear_summa(clear_summa);
    }
    public Tab6(){
        premia = 0;
        hours = 0;
    }
    public int getPremia() {
        return premia;
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
