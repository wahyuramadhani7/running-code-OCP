import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        AreaCalculator areaCalculator = new AreaCalculator();
        double totalArea = areaCalculator.calculateTotalArea(shapes);

        System.out.println("Total Area: " + totalArea);
    }
}
