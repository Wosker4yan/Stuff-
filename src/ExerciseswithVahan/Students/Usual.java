package ExerciseswithVahan.Students;

import java.util.Random;

/**
 * Created by wosker4yan on 16.01.17.
 */
public class Usual extends Students {



    public Usual(String name, int count) {
        super(name, count);
// TODO Auto-generated constructor stub 
    }
    public boolean exam() {
        boolean exam = false;
        Random r = new Random();
        if(presense==20) {
            exam = true;
        }
        else if(presense>=10) {
            if(r.nextInt(10)>5) {
                exam = true;
            }
        }
        return exam;
    }

}