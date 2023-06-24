package Memory_In_Java;

import java.util.Arrays;

public class Main {

    // Задание 5
    public static void changeValue(int value) {
        value = 22;
        System.out.println(value);
    }

    //   Задание 6
    public static void changeValue(Integer value) {
        value = 22;
        System.out.println(value);
    }



    //  Задание 7
    public static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
        System.out.println(Arrays.toString(value));
    }

    //  Задание 8
    public static void changeValue1(Integer[] value) {
        value[0] = 99;
        System.out.println(Arrays.toString(value));
    }


    public static void main(String[] args) {
//        System.out.println("Задание 5");
//        int value = 33;
//        System.out.println(value);
//        changeValue(value);
//        System.out.println(value);
//        System.out.println();

//Когда мы создаем переменную value, а затем передаем ее в метод changeValue, внутри метода мы работаем
// уже не с переменной value, а со значением 33.Даже если мы в методе изменим значение,
// значение внутри переменной value останется прежним.


//        System.out.println("Задание 6");
//        Integer value = 33;
//        System.out.println(value);
//        changeValue(value);
//        System.out.println(value);
//        System.out.println();

//при попадании в метод переменная value копируется, подавая дубликат ссылки, что есть вне метода.
//В итоге мы получаем две ссылки, одну назовем value1, другую value2, которые ссылаются на одну ячейку памяти,
// где хранится Integer value = 33;
//Но если мы присвоим value2 что-то другое, value1 не перезапишется
//Так как value1 и value2 являются копиями, value2 не управляет тем, как работает value1,
// value2 лишь создается как копия value1,
// но является абсолютно самостоятельной единицей. Ее изменение никак не повлияет на value1.





//        System.out.println("Задание 7");
//        Integer[] value = {3,4};
//        System.out.println(Arrays.toString(value));
//        changeValue(value);
//        System.out.println(Arrays.toString(value));
//        System.out.println();

//Тут мы тоже присваиваем новый обьект, поэтому в старом не меняется значение

//        System.out.println("Задание 8");
//        Integer[] value = {3, 4};
//        System.out.println(Arrays.toString(value));
//        changeValue1(value);
//        System.out.println(Arrays.toString(value));
//        System.out.println();

//Тут мы не присваиваем value новый объект, а лишь меняем текущий, то этот объект меняется и по ссылке,
// так как оба ссылаются на одну и ту же ячейку памяти, следовательно, на один и тот же объект.





        System.out.println("Задание 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        Person.changePerson(person);

//В этом примере person не изменил свое состояние, так как мы присваиваем новый обьект и ссылки ведут на
// разные обьекты.


//        System.out.println("Задание 10");
//        Person person = new Person("Lyapis", "Trubetskoy");
//        System.out.println(person);
//        Person.changePerson(person);
//        System.out.println(person);

//В этом примере person изменил свое состояние, так как обе ссылки вели на
// одну ячейку в памяти и, изменив ее по одной, мы изменили и то, что лежит в другой.


    }
}