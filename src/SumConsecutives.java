import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumConsecutives { 

    public static List result(List numbers) {
        List count_list = new ArrayList<>();
        int pivot_number = (int) numbers.get(0);
        int acum_cosecutive = pivot_number;
        for (int i = 1; i <= numbers.size() -1; i++) {
            if(pivot_number != (int) numbers.get(i)){
                count_list.add(acum_cosecutive);
                pivot_number= (int) numbers.get(i);
                acum_cosecutive = pivot_number;
            }else{
                acum_cosecutive += pivot_number;
            }
        }
        count_list.add(acum_cosecutive);
        return count_list;
    }

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,1,3,4,4,4,4,8,9,10,10);
        System.out.println(result(numList));
    }
    
}