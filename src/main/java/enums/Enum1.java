package enums;

import java.util.Arrays;


// https://dev.java/learn/classes-objects/enums/
public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY);
        today.daysInfo();
        System.out.println(today.weekDay);
        System.out.println("Name is: " + today.weekDay.name());
        System.out.println("Ordinal is: " + today.weekDay.ordinal());


        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.MONDAY;
        System.out.println(w1 == w2); // true
        System.out.println(w1 == w3); // false
        System.out.println(WeekDays.SUNDAY.equals(WeekDays2.SUNDAY)); // false

        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays w16 = WeekDays.valueOf(WeekDays.class, "FRIDAY"); // why?
        System.out.println(w16);

        WeekDays[] arr = WeekDays.values();
        System.out.println(Arrays.toString(arr));

        System.out.println("----------");
        Arrays.stream(MyEnum.values()).forEach(MyEnum::doSmth);
    }
}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    private WeekDays(String mood) {
        this.mood = mood;
    }

//    WeekDays() {
//    }

    public String getMood() {
        return mood;
    }
}

enum MyEnum {
    A() {
        @Override
        void doSmth() {
            System.out.println("A");
        }
    },
    B() {
        @Override
        void doSmth() {
            System.out.println("B");
        }
    };

    abstract void doSmth();
}

enum SomeSingleton {
    INSTANCE;
    // fields, methods, etc
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("go to work");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("relax");
                break;
        }
        System.out.println("Mood in this day is: " + weekDay.getMood());
    }
}