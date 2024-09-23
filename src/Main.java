//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   String r =  reverse("Simon Peter Muyomba");
   System.out.println(r);

    }

public static  String reverse(String s){
        char [] letters = new char[s.length()];

        int letterIndex = 0;
        for(int i = s.length() - 1; i >= 0; i--){
           letters[letterIndex] = s.charAt(i);
           letterIndex++;
        }
        StringBuilder reverse = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            reverse.append(letters[i]);
        }
        return reverse.toString();
    };
}