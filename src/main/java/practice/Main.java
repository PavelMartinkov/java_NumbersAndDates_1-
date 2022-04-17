package practice;

public class Main {

    private static double circleSquare;

    public static void main(String[] args) {
        GeometryCalculator calculator = new GeometryCalculator();
        System.out.println("Площадь круга равна: " + calculator.getCircleSquare(-20.2));
        System.out.println("Объем шара равен: " + calculator.getSphereVolume(20.2));
        System.out.println("Строим треугольник: " + calculator.isTrianglePossible(3,0,5));
        System.out.println("Площадь треугольника равна: " + calculator.getTriangleSquare(3,4,5));
    }
}
