package ExerciseswithVahan.Shooters;


/**
 * Created by wosker4yan on 16.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Man man_arr[] = new Man[7];
        Man m = new Noob("Vahan", 21, 4) {
        };
        man_arr[0] = m;
        m = new Veteran("Vahram", 25, 9) {
        };
        man_arr[1] = m;
        m = new Experienced("Lika", 24, 12) {};
        man_arr[2] = m;
        m = new Veteran("Vasya", 15, 8){};
        man_arr[3] = m;
        m = new Noob("Davo", 32, 1){};
        man_arr[4] = m;
        m = new Experienced("Gago", 25, 7){};
        man_arr[5] = m;
        m = new Noob("Arsen", 37, 18){};
        man_arr[6] = m;
        m = new Veteran("Rob", 45, 23){};




        int count = 0;

        for (int i = 0; i < man_arr.length; i++) {
            System.out.println(man_arr[i]);
            if (man_arr[i].shoot() == true) {
                System.out.println("Got it!");
                break;
            } else {
                System.out.println("Miss");
                count++;
            }
            if (count == 7) {
                System.out.println("Nobody got the target");
                break;
            }
        }}}
