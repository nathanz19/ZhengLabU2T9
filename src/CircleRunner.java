public class CircleRunner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        String info = circle1.getInfo();
        System.out.println(info);

        Circle circle2 = new Circle(9.2);
        info =  circle2.getInfo();
        System.out.println(info);

        Circle myCircle = new Circle(Math.PI);
        info = myCircle.getInfo();
        System.out.println(info);
    }
}
