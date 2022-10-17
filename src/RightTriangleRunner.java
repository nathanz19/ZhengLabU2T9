public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle triangle1 = new RightTriangle(3, 4);
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        System.out.println(triangle1.hypotenuse());
        System.out.println(triangle2.hypotenuse());

        RightTriangle myTriangle = new RightTriangle(Math.PI,Math.pow(2.4,3));
        System.out.println(myTriangle.hypotenuse());
    }
}
