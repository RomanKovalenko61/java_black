package nested_classed.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    interface I {

    }

    public static class Engine extends Z {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
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
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);

//        Car.Engine engine2 = new car.Engine(150);
    }
}

class Z {
}

class Y extends Car.Engine {
    Y() {
        super(200);
    }
}