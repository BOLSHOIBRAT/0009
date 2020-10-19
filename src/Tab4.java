public class Tab4 extends  Tab3 {
    int tugriki;
    Tab4(){
        tugriki = 0;
    }
    Tab4(String fio, String type_oplaty, int summa, boolean in_chields) {
        int nalog;
        int clear_summa;
        super.setFio(fio);
        super.setType_oplaty(type_oplaty);
        super.setSumma(summa);
        if (type_oplaty == "ставка" || type_oplaty == "почасовая") {
            nalog = 20;
        } else if (type_oplaty == "сдельная") {
            nalog = 15;
        } else {
            nalog = 100;
        }
        if (in_chields == false) {
            nalog += 5;
        }
        super.setNalog(nalog);
        clear_summa = summa - (summa * nalog) / 100;
        if(type_oplaty=="почасовая"){
            tugriki = (clear_summa/2)*8;
            clear_summa /=2;
            System.out.println("clear = " + clear_summa + " tugriki = " + tugriki);
        }
        super.setClear_summa(clear_summa);
    }


}
