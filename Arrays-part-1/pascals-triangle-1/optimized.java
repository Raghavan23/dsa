import java.util.*;

public class optimized {
    public static List<List<Integer>> generate (int numRows){

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++){

            List<Integer> row = new ArrayList<>();
            long val = 1;

            for(int j = 0; j <= i; j++){

                row.add((int)val);

                val = val * (i-j)/(j+1);

            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
