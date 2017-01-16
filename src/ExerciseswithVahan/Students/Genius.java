package ExerciseswithVahan.Students;

/**
 * Created by wosker4yan on 16.01.17.
 */
public class Genius extends Students {
    public Genius(String namesurname, int presense) {
        super(namesurname, presense);
    }


    public boolean exam() {
        boolean exam = false;

        if(presense>=1) {
            exam = true;
        }

        return exam;
    }
}


