public class SiryokuKennsaService {

    public boolean SiryokuKennsa(){
        Kanjya p = new Kanjya("hogehoge","R2.4.19");
        p.setHidariSiryoku((float)0.1);
        p.setMigisiryoku((float)1.0);

        System.out.println("Name:" + p.Name);
        System.out.println("BirthDay:" + p.BirthDay);

        System.out.printf("視力検査結果は %b\n",Kennsa.Siryoku(p));

        return Kennsa.Siryoku(p);

    }
}
