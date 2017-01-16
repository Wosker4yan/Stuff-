package ExerciseswithVahan;
/*
Программно промоделировать стрельбу по мишени группой человек.
Каждый человек имеет свое имя, возраст (в годах) и стаж обучения
стрельбе (в годах).
Люди делятся на новичков, опытных и ветеранов (потомки класса
человек). Для каждого человека определите полиморфный метод. «Стре-
лять» без параметров, возвращающих логическое значение (попал – true,
не попал – false). Попадание определяется случайным образом, причем
для новичка вероятность попасть равна 0,01*стаж обучения; для опытно-
го = 0,05*стаж обучения стрельбе; для ветерана = 0,9 – 0,01*возраст.
Люди стреляют по очереди, начиная с первого, пока кто-то не попадет в
мишень. Стрельба прекращается после того, как кто-то попал или все
выстрелили по одному разу. После каждого выстрела нужно выводить на
экран всю информацию о стреляющем и результат стрельбы.
В главной программе создайте массив из 7 людей в таком порядке:
новичок, опытный, ветеран, опытный, новичок и произведите стрельбу с
выводом ее результатов.*/

/**
 * Created by wosker4yan on 16.01.17.
 */
abstract class Man {
    public String name;
    public int age;
    public double experience;

    public Man(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
    public boolean shoot (){


        return false;
    }
}
