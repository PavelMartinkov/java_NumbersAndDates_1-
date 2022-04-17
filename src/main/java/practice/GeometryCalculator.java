package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        double circleSquare = Math.PI * Math.pow(radius, 2);
        if (radius < 0) {
            return -1;
        } else {
            return circleSquare;
        }
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        double sphereVolume = 4 * Math.PI * Math.pow(radius, 3) / 3;
        if (radius < 0) {
            return -1;
        } else {
            return sphereVolume;
        }
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a == 0 || b == 0 || c == 0)  {
            return false;
        } else if (a + b < c || a + c < b || b + c < a){
            return false;
        } else{
            return true;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if (isTrianglePossible(a,b,c)) {
            return triangleSquare;
        } else {
            return -1;
        }
        }
}
