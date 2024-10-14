import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextInt();
        System.out.print("Enter the height: ");
        double height = scanner.nextInt();
        Rectangular rectangular = new Rectangular(width, height);
        System.out.println("Your rectangular\n" + rectangular.display());
        System.out.println("Perimeter of the rectangular: " + rectangular.getPerimeter());
        System.out.println("Area of the rectangular: " + rectangular.getArea());
    }
}
