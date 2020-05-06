public class SiryokuKennsaService {

    public boolean SiryokuKennsa(){
        Patients p = new Patients("hogehoge","R2.4.19");
        p.setLeftSight((float)0.1);
        p.setRightSight((float)1.0);

        System.out.println("Name:" + p.Name);
        System.out.println("BirthDay:" + p.BirthDay);

        System.out.printf("視力検査結果は %b\n",p.VisionTest());

        return p.VisionTest();

    }
}
