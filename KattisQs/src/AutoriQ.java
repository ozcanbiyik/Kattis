import java.util.Scanner;

public class AutoriQ {

    // input : Özcan-Bıyık olan bir ifadeyi
    // Output : ÖB olarak döndüren kod sorusu çözümü.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split("-");
        String output = Character.toString(splitInput[0].charAt(0));
        for(int i = 1; i<splitInput.length; i++){
            output += splitInput[i].charAt(0);
        }
        System.out.println(output);
    }

}
