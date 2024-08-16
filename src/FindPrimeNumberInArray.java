import java.util.Scanner;

public class FindPrimeNumberInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPrime = true;

        // Kullanıcıdan dizinin boyutunu alıyoruz
        System.out.println("Enter the size of the array: ");
        int countArray = input.nextInt();

        // Diziyi belirlenen boyutta başlatıyoruz
        int[] myArray = new int[countArray];

        // Kullanıcıdan dizi elemanlarını alıyoruz
        for (int i = 0; i < countArray; i++) {  // i = 1 yerine i = 0
            System.out.println("Enter the number for Array: ");
            myArray[i] = input.nextInt();
        }

        // Dizinin elemanlarını yazdırıyoruz
        System.out.println("Array elements:");
        for (int i = 0; i < countArray; i++) {
            System.out.print("My Array "+ i +". " + myArray[i] + "\t");
        }
        System.out.println("\n\n");
        for (int i = 0; i < countArray; i++) {
            for (int j = 2; j <= myArray[i] / 2;j++)
            {
                if (myArray[i] % j == 0)
                {
                    isPrime = false;
                    System.out.println("is not Prime Number: " + myArray[i]);
                    break;
                }
                else
                {
                    System.out.println("is Prime: " + myArray[i]);
                    break;
                }
            }
        }

    }
}
