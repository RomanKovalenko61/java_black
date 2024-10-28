package nested_classed.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
//        Engine e = new Engine(200);
//        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;
//        public static int a = 5;
        public final static int B = 5;

        public Engine(int horsePower) {
            System.out.println(doorCount); // даже если static value
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("yellow", 4).new Engine(200);
        System.out.println(engine3);

//        Car.Engine engine2 = new car.Engine(150);
    }
}