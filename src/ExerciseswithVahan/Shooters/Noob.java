package ExerciseswithVahan.Shooters;
import java.util.Random;


/**
 * Created by wosker4yan on 16.01.17.
 */
abstract class Noob extends Man {
    public Noob(String name, int age, int experience) {
        super(name, age, experience);
    }

    @Override
    public boolean shoot() {
        Random r = new Random();
        boolean temp = true;

        if (r.nextInt(10) > (0.01 * experience) * 10) {
            temp = false;

        }
        return temp;
    }
}