import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPresent = false;
        ArrayList<Integer> lst = new ArrayList<>(List.of(25,87,12,31,99,1,42,30,17,29));
        System.out.println("Enter the element : ");
        int value = sc.nextInt();
        for(int i=0;i<lst.size();i++){
            if(lst.get(i)==value){
                isPresent = true;
            }
        }
        if(isPresent){
            System.out.println(value+" is present in the arraylist");
        }
        else{
            System.out.println(value+" is not in the arraylist");
        }
    }
}
