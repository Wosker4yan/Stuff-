package Stuff;

import java.util.Arrays;

/**
 * Created by wosker4yan on 21.01.17.
 */
public class Array3D {
    public static void main(String[] args) {

        String[][][] array3d = new String[10][10][10];

        for(String [] [] array2d : array3d){
        for(String[] array : array2d){
            Arrays.fill(array, "(");
        }
    }

         System.out.println(Arrays.deepToString(array3d));

}
}
