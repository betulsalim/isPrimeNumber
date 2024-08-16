import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userNumber;
        boolean isContinue = true;
        char isContinueAnswer;
        Scanner input = new Scanner(System.in);

        while (isContinue) {
            System.out.print("Enter an integer: ");
            userNumber = input.nextInt();

            boolean isPrime = true;  // İlk başta sayıyı asal kabul ediyoruz

            // 2'den başlıyoruz çünkü 1'in böleni yok ve 1 asal değil
            for (int i = 2; i <= userNumber / 2; i++) {
                if (userNumber % i == 0) {
                    isPrime = false;  // Eğer sayı bölünebiliyorsa asal değildir
                    break;  // Döngüden çıkıyoruz, çünkü asal olmadığını biliyoruz
                }
            }

            // Sonuçları yazdırıyoruz
            if (isPrime && userNumber > 1) { // 1 ve daha küçük sayılar asal değildir
                System.out.println("Your number is a Prime Number: " + userNumber);
            } else {
                System.out.println("Your number is not a Prime Number: " + userNumber);
            }

            // Devam edip etmeyeceğimizi soruyoruz
            System.out.println("Do you want to continue? (y/n)");
            isContinueAnswer = input.next().charAt(0);

            if (isContinueAnswer == 'n' || isContinueAnswer == 'N') {
                isContinue = false;
            } else if (isContinueAnswer == 'y' || isContinueAnswer == 'Y') {
                isContinue = true;
            } else {
                System.out.println("Sorry, you have entered an invalid syntax. Please enter 'y' or 'n'.");

            }
        }
    }
}
