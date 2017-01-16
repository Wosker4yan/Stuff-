package ExerciseswithVahan.Students;

/**
 * Created by wosker4yan on 16.01.17.
 */
abstract class Students {
    public String namesurname;
    public int presense;


    public Students(String namesurname, int presense) {
        this.namesurname = namesurname;
        this.presense = presense;
    }

    public String getNamesurname() {
        return namesurname;
    }

    public int getPresense() {
        return presense;
    }

    public void setNamesurname(String namesurname) {
        this.namesurname = namesurname;
    }

    public void setPresense(int presense) {
        this.presense = presense;
    }


    boolean passTheExam(){
        return false;


    }

    @Override
    public String toString() {
        return super.toString();
    }
    public abstract boolean exam();

}
