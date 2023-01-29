import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class soal2linearSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        int searchKey;
        int position;
        int arrayLength;

        arrayLength = 25;

        soal2lineargenerator searchArray = new soal2lineargenerator(arrayLength);
        System.out.println(searchArray);

        System.out.println("Masukkan nilai yang akan dicari:");
        searchKey = Integer.parseInt(input.readLine());

        while (searchKey != -1)
        {
            position = searchArray.linearSearch(searchKey);

            if(position == -1)
                System.out.println("Nilai tidak ditemukan");
            else
                System.out.println("Nilai "+searchKey+" ditemukan di index "+(position+1));

            System.out.println("input -1 untuk keluar");
            searchKey = Integer.parseInt(input.readLine());
        }
    }

}
