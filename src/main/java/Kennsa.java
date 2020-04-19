public class Kennsa {
    public static boolean Siryoku(Kanjya p){
        if((p.getHidariSiryoku() < 0.2) || (p.getMigisiryoku() < 0.2)){
            return true;
        } else {
            return false;
        }
    }
}
