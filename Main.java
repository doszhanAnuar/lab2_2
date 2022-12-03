import javax.crypto.spec.PSource;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> dict =  new HashMap<>();
        dict.put(21,22);
        System.out.println(!dict.containsKey(21));
        System.out.println("Chosse problem");
        System.out.println("1)first problem");
        System.out.println("2)second problem");
        Scanner sc = new Scanner(System.in);
        String ques = sc.nextLine();
        switch (ques){
            case ("1"):
                FirstProblem first = new FirstProblem();
                first.san();
                break;
            case ("2"):
                Country country = Country.CANADA;
                System.out.println(country.finderGDP()+"mlrd USD");
                break;

        }


    }
}