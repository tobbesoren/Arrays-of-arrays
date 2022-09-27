import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Här skapar vi en array som innehåller 3 arrays med char.
        char[][] arrays = new char[3][];

        // Här initierar vi de tre arrays:en och sätter längden till 3.
        arrays[0] = new char[3];
        arrays[1] = new char[3];
        arrays[2] = new char[3];

        // den första loopen går igenom varje array...
        for(char[] array: arrays) {

            // ... och den andra går igenom varje char...
            for(int i = 0; i < array.length; i++) {
                // ... och sätter den till 'x'
                array[i] = 'x';
            }
        }

        // för att skriva ut en array of arrays kan man använda Arrays.deepToString(arraySomSkallPrintas).
        // (Skall man skriva ut en enkel array använder man Arrays.toString(arraySomSkallPrintas).)
        System.out.println(Arrays.deepToString(arrays));

        // vi kan ändra en char så här:
        arrays[0][1] = 'o'; // Den första hakparentesen [0] bestämmer vilken array vi kommer åt;
        // den andra [1] vilken char i arrayen.

        // ...och skriver ut resultatet
        System.out.println(Arrays.deepToString(arrays));


    }
}