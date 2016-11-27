// @island
// 2016-11-06 09:56:30
public class Parcel1 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String lable;
        Destination(String whereTo) {
            lable = whereTo;
        }

        String readLable() {
            return lable;
        }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLable());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
