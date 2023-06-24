package OOP_Homework_2;

public class Main {

    //Один комментарий, как можно сделать работу еще лучше, учти на будущее.
    // Я бы сделал класс Vehicle абстрактным и в нем бы имплементировал  интерфейс Maintainable,
    // сделав метод service абстрактным. Тогда бы не пришлось в каждом наследнике указывать,
    // что класс имплементирует интерфейс и не пришлось бы кастить Vehicle к Maintainable в методе main
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[]{
                new Car("car1", 4),
                new Car("car2", 4),

                new Truck("truck1", 6),
                new Truck("truck2", 8),

                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        ServiceStation serviceStation = new ServiceStation();
        for (Vehicle vehicle : vehicles) {
            serviceStation.check(vehicle);
        }

    }
}


