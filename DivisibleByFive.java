import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,4,5,20,6);

        List<Integer> divisibleBy5 = numbers.stream().filter(n-> n % 5 ==0).collect(Collectors.toList());
  

System.out.println("numbers divisible by 5 are: "+ divisibleBy5);


for (Integer integer : divisibleBy5) {
    System.out.println(integer);
    
}

    }
}
