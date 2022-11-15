public class Lab4 {
    public static void Zad1Calculate(int[] array) {
        int sum = 0;
        int numOfElements = array.length;

        for (int i = 0; i < numOfElements; i++) {
            sum += array[i];
        }

        sum = 0; // w zadaniu jest zeby policzyc zarowno petla for jak i foreach wiec resetuje licznik zeby policzyc od nowa :(
        for (int i : array) {
            sum += i;
        }

        double average = (double) sum / numOfElements;
        System.out.println("Suma elementow: " + sum);
        System.out.println("Srednia elementow: " + average);
    }

    public static void Zad2ShowOddIndexesOnArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Element nr " + (i + 1) + ": " + array[i]);
            }
        }
    }

    public static void Zad3ElementsToUpper(String[] array) {
        for (String i : array) {
            System.out.println(i.toUpperCase());
        }
    }

    public static void Zad4ReverseArray(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            var text = array[i];

            // StringBuilder a opcje reverse() wiec ja wykorzystuje
            StringBuilder build = new StringBuilder();
            build.append(text);
            build.reverse();
            System.out.println(build);
        }
    }

    public static void Zad5SortAndPrint(int[] array) {
        Util.InsertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void Zad6FactorialForArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            var factorial = Util.Factorial(array[i]);
            System.out.println("Silnia wartosci " + i + ": " + factorial);
        }
    }

    public static void Zad6AraArraysTheSame(String[] firstStrArray, String[] secondStrArray) {
        if (firstStrArray.length != secondStrArray.length) {
            System.out.println("Tablice NIE są takie same");
            return;
        }

        for (int i = 0; i < firstStrArray.length; i++) {
            if (!firstStrArray[i].equals(secondStrArray[i])) {
                System.out.println("Tablice NIE są takie same");
                return;
            }
        }

        System.out.println("Tablice są takie same");
    }
}
