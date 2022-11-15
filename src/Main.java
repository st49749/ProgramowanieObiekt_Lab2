import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10];
        Util.FillWithRandomNumbers(numbers, 10, 20);

        // ZAD 1
        Lab4.Zad1Calculate(numbers);

        // ZAD 2
        int[] numbersEven = new int[10];
        int[] numbersOdd = new int[11];
        Util.FillWithRandomNumbers(numbersEven, 10, 20);
        Util.FillWithRandomNumbers(numbersOdd, 10, 20);

        Lab4.Zad2ShowOddIndexesOnArray(numbersEven);
        System.out.println();
        Lab4.Zad2ShowOddIndexesOnArray(numbersOdd);

        // ZAD 3
        String[] words = new String[]{"Krzysztof", "Moryl", "LiTeRyRoZnE"};
        Lab4.Zad3ElementsToUpper(words);

        // ZAD 4
        String[] userWords = new String[5];
        System.out.println("Podaj 5 wartosci string (zatwierdz enterem)");
        for (int i = 0; i < 5; i++) {
            userWords[i] = Util.GetString();
        }
        Lab4.Zad4ReverseArray(userWords);

        // ZAD 5
        int[] userNumbers = new int[8];
        System.out.println("Podaj 8 numerow (zatwierdz enterem)");
        for (int i = 0; i < 8; i++) {
            userNumbers[i] = Util.GetInt();
        }
        Lab4.Zad5SortAndPrint(userNumbers);

        // ZAD 6
        int[] fiveUserNum = new int[5];
        System.out.println("Podaj 5 numerow (zatwierdz enterem)");
        for (int i = 0; i < 5; i++) {
            fiveUserNum[i] = Util.GetInt();
        }
        Lab4.Zad6FactorialForArrayElements(fiveUserNum);

        // ZAD 7
        String[] firstStrArray = new String[]{"AA", "BB", "CC"};
        String[] secondStrArray = new String[]{"AA", "BB", "CC"};
        String[] thirdArray = new String[]{"AA", "BB", "cc"};
        Lab4.Zad6AraArraysTheSame(firstStrArray, secondStrArray);
        Lab4.Zad6AraArraysTheSame(firstStrArray, thirdArray);
    }
}