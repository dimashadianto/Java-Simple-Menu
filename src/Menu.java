import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        Integer[] arrNumber = { 0, 2, 4, -1, -38, -4};
        do {
            System.out.println("Pilih menu : \n1. Mencari angka terbesar dan terkecil\n2. Mencari angka minus terbesar yang hilang dari nilai 0, 2, 4, -1, -38, -4\n3. Permainan memotong bambu\n4. Keluar menu");
            System.out.print("Pilih menu (1-4) : ");
            Integer choose = input.nextInt();

            if (choose == 1) findMinMax();
            else if (choose == 2) System.out.println(findMin(arrNumber));
            else if (choose == 3) cutTheBamboo();
            else if (choose == 4) break;
            else System.out.println("Pilihan kamu belum sesuai, silahkan coba lagi");
        } while (true);
    }

    public void findMinMax() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        Integer n = input.nextInt();
        Integer [] numbers = new Integer[n];

        System.out.print("Masukkan nilai angka : ");
        for(Integer i = 0; i < numbers.length;i++) numbers [i] = input.nextInt();

        Integer max = numbers[0];
        Integer min = numbers[0];
        for (Integer number : numbers) {
            if (number > max) max = number;
            if (number < min) min = number;
        }
        System.out.printf("Nilai angka maksimal : %s", max);
        System.out.printf("Nilai angka minimal: %s", min);
        System.out.println();
    }

    public Integer findMin(Integer[] arr){
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                if (arr[i] - 1 != arr[i + 1]){
                    return arr[i] - 1;
                }
            }
        }
        return null;
    }

    public void cutTheBamboo () {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang bambu : ");
        String bamboo = input.nextLine();
        String[] bambooArray = bamboo.split(",");

        int[] bamboos = new int[bambooArray.length];
        for (int i = 0; i < bamboos.length; i++) {
            bamboos[i] = Integer.parseInt(bambooArray[i]);
        }

        System.out.print("Masukkan jumlah potongan : ");
        int CycleCuts = Integer.parseInt(input.nextLine());

        for (int j = 0; j <= CycleCuts; j++) {
            if (j == 0) System.out.println("Bambu : ");
            else System.out.println("Pemotongan ke - " + j);

            for (int i : bamboos) {
                System.out.print("|");
                for (int l = 0; l < i - j; l++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }

}
