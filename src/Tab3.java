public class Tab3 extends  Tab2{
    private boolean in_chields;
    public Tab3(){
        in_chields = false;
    }
    public Tab3(String fio, String type_oplaty, int summa, boolean in_chields){
        int nalog;
        int clear_summa;
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
        if (in_chields == false){
            nalog+=5;
        }
        super.setNalog(nalog);
        clear_summa = summa-(summa*nalog)/100;
        super.setClear_summa(clear_summa);
    }

}
