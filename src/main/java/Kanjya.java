public class Kanjya {
    public String Name;
    public String BirthDay;
    private float Shincyou;
    private float Taijyuu;
    private float HidariSiryoku;
    private float Migisiryoku;

    Kanjya(String Name, String BirthDay){
        this.Name = Name;
        this.BirthDay = BirthDay;
    }

    public void setHidariSiryoku(float hidariSiryoku) {
        if(hidariSiryoku < 0.0){
            hidariSiryoku = (float)0.0;
        }
        this.HidariSiryoku = hidariSiryoku;
        return;
    }

    public void setMigisiryoku(float migisiryoku){
        if(migisiryoku < 0.0){
            migisiryoku = (float)0.0;
        }
        this.Migisiryoku = migisiryoku;
        return;
    }

    public float getHidariSiryoku(){
        return this.HidariSiryoku;
    }

    public float getMigisiryoku(){
        return this.Migisiryoku;
    }
}

