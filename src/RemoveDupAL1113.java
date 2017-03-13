import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by dfreer on 3/13/2017.
 */
public class RemoveDupAL1113 {

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
        //loop through each point
        Set<Integer> unique = new LinkedHashSet<>(list);
        return (new ArrayList<Integer>(unique));
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number:");
            nums.add(scanner.nextInt());
        }
        ArrayList<Integer> removed = removeDuplicate(nums);
        for(int i : removed){
            System.out.println(i);
        }
    }
}
