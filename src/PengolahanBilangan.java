import java.util.Arrays;
import java.util.Scanner;

public class PengolahanBilangan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sortTemp = 0;
        double avgTemp = 0;
        double numberAverage;
        double median;
        double multiRes = 1;

        System.out.print("Jumlah Bilangan yang Diinput \t: ");
        Double[] numArray = new Double[scan.nextInt()];
        scan.nextLine();
        System.out.println("Silahkan input bilangan");

        for (int i = 0; i < numArray.length; i++){
            numArray[i] = scan.nextDouble();
        }

        //ASC SORT
        System.out.print("\nUrutan kecil ke terbesar \t: ");
        for (int x = 0; x < numArray.length; x++){
            for (int y = x + 1; y < numArray.length; y++){
                if (numArray[x] > numArray[y]){
                    sortTemp = numArray[x];
                    numArray[x] = numArray[y];
                    numArray[y] = sortTemp;
                }
            }
            System.out.print(" " + numArray[x]);
        }

        //DESC SORT
        System.out.print("\nUrutan besar ke terkecil \t: ");
        for (int x = 0; x < numArray.length; x++){
            for (int y = x + 1; y < numArray.length; y++){
                if (numArray[x] < numArray[y]){
                    sortTemp = numArray[x];
                    numArray[x] = numArray[y];
                    numArray[y] = sortTemp;
                }
            }
            System.out.print(" " + numArray[x]);
        }

        //AVERAGE
        for (int x = 0; x < numArray.length; x++){
            avgTemp += numArray[x];
        }
        numberAverage = (avgTemp / numArray.length);
        System.out.print("\nNilai rata-rata \t: " + String.format("%.1f", numberAverage));

        //MEDIAN
        Arrays.sort(numArray);
        if (numArray.length % 2 == 0)
            median = (numArray[numArray.length/2] + numArray[numArray.length/2-1])/2;
        else
            median = numArray[numArray.length/2];

        System.out.print("\nNilai median\t: " + median);

        //MULTIPLICATION
        for (int x = 0; x < numArray.length; x++)
            multiRes = multiRes * numArray[x];

        System.out.print("\nPerkalian seluruh bilangan\t: " + multiRes);
    }
}
