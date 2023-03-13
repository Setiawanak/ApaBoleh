
// Import Semua kelas program
import java.util.*;

// dari class ApaBoleh
public class ApaBoleh {
    public static void main(String[] args) {
        // Deklarasi variable
        int j = 100;
        // looping nilai dari 1 - 100
        // memakai if didalam loop (kondisi jika dan hanya jika)
        for (int i = 1; i <= j; i++) {
            // Jika pembagian 3 dan 5 ketemu maka jadi "ApaBoleh"
            // if (i%3 && %5 ==0)
            if (i % 15 == 0)
                System.out.print("ApaBoleh" + ", ");

            // Jika pembagian 5 makan jadi "Boleh"
            else if (i % 5 == 0)
                System.out.print("Boleh" + ", ");

            // Jika pembagian 3 makan jadi "Apa"
            else if (i % 3 == 0)
                System.out.print("Apa" + ", ");

            else
                // print semua dengan berderet samping
                System.out.print(i + ", ");
        }
    }
}