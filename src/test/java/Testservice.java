import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testservice {
    SiryokuKennsaService service = new SiryokuKennsaService();
    @Test
    public void 視力０２未満の時にTrueが返ってくるか(){
        assertEquals(true, service.SiryokuKennsa());
    }
}

