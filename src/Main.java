//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Reverse_A_Number();
    }

    public static void Reverse_A_Number(){
        int number = 10899;
        int reverse = 0;

        for(int i = 0;number > 0; i++){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        System.out.println(reverse);
    }
}