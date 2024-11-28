import java.util.*;

public class replaceChar{
    public static void main(String[] args) {
        System.out.println("Enter a string");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for (int i=0 ; i<str.length() ; i++){
            char a = str.charAt(i);
            if (a == 'e'){
                result+='i';
            }
            else{
                result+=str.charAt(i);

                }

            }
            System.out.println("NEW STRING IS");
            System.out.println(result);
        }
    }
