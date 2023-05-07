import java.util.Scanner;

public class ChinieseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int yearOfBirth = input.nextInt();
        String[] zodiacArray = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        String zodiac = zodiacArray[yearOfBirth % 12];
        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);

        input.close();
    }
}
