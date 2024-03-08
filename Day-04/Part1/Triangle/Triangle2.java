public class Triangle2 {
    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1(4, 4, 4);
        double area=t1.getArea();
        System.out.println("Area of triangle: "+area);
        double perimeter=t1.getPerimeter();
        System.out.println("Perimeter of triangle: "+perimeter);
    }
}