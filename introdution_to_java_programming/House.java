
public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public Object clone() throws CloneNotSupportException {
        return super.clone()
    }

    @Override
    public int compareTo(House o) {
        if (this.area > o.area) {
            return 1;
        } else if (this.area < o.area) {
            return -1;
        } else {
            return 0;
        }
    }
}