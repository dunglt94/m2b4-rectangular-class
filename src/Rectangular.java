public class Rectangular {
    double width, height;

    public Rectangular() {

    }
    public Rectangular(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangular{width=" + width + ", height=" + height + '}';
    }

}
