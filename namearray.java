import java.util.*;

public class namearray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String Name[] = new String[size];

        for (int i = 0 ; i<size ; i++ ){
            Name[i] = sc.next();

        }

        for (int i = 0 ; i< Name.length ; i++ ){
            System.out.println(Name[i]);
        }
    }
}
