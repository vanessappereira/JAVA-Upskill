package independentWork8.ex3_shapes.code;

public class square extends rectangle {

    public square(position position, float length) {
        super(position, length, length);
    }

    @Override
    public float calcArea() {
        System.out.println("The area of a square is: ");
        return super.calcArea();
    }

    @Override
    public float calcPerimeter() {
        System.out.println("The perimeter of a square is: ");
        return super.calcPerimeter();
    }
}
