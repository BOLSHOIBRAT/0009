public class Tab5 extends Tab4{
    Tab5(String fio, String type_oplaty, int summa, boolean in_chields) {
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
        System.out.println(clear_summa);
        super.setClear_summa(clear_summa);
    }
    public Tab5(){

    }
}
