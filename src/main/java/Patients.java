public class Patients {
    public String Name;
    public String BirthDay;
    private float Height;
    private float Weight;
    private float LeftSight;
    private float RightSight;

    Patients(String Name, String BirthDay) {
        this.Name = Name;
        this.BirthDay = BirthDay;
    }

    public void setLeftSight(float Lefteye) {
        if (Lefteye < 0.0) {
            Lefteye = (float) 0.0;
        }
        this.LeftSight = Lefteye;
        return;
    }

    public void setRightSight(float Righteys) {
        if (Righteys < 0.0) {
            Righteys = (float) 0.0;
        }
        this.RightSight = Righteys;
        return;
    }

    public boolean VisionTest() {
        if (this.LeftSight < 0.2 || this.RightSight < 0.2) {
            return true;
        } else {
            return false;
        }
    }
}

