package academy.CodingExercises;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int XX = kiloBytes;
            int YY = XX / 1024;
            int ZZ = XX % 1024;
            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
        }

    }
}
