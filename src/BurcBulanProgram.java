import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int gun, ay;

        Scanner input = new Scanner(System.in);

        System.out.println("Dogdugunuz ayi giriniz(sayi olarak!)=");
        ay = input.nextInt();

        System.out.println("Dogdugunuz gunu giriniz=");
        gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 21) {
                    System.out.println("Oglak Burcu");
                } else if (gun >= 21 && gun <= 31) {
                    System.out.println("Kova Burcu");
                }
                break;
            case 2:
                if (gun >= 1 && gun <= 19) {
                    System.out.println("Kova Burcu");
                } else if (gun >= 20 && gun <= 28) {
                    System.out.println(" Balık Burcu");
                }
                break;
            case 3:
                if (gun >= 1 && gun <= 20) {
                    System.out.println("Balık Burcu");
                } else if (gun > 20 && gun <= 31) {
                    System.out.println("Koc Burcu");
                }
                break;
            case 4:
                if (gun >= 1 && gun <= 20) {
                    System.out.println("Koc Burcu");
                } else if (gun > 20 && gun <= 30) {
                    System.out.println("Boga Burcu");
                }
                break;
            case 5:
                if (gun >= 1 && gun <= 21) {
                    System.out.println("Boga Burcu");
                } else if (gun > 21 && gun <= 31) {
                    System.out.println("Ikizler Burcu");
                }
                break;
            case 6:
                if (gun >= 1 && gun <= 22) {
                    System.out.println("Ikızler Burcu");
                } else if (gun > 22 && gun <= 30) {
                    System.out.println("Yengec Burcu");
                }
                break;
            case 7:
                if (gun >= 1 && gun <= 22) {
                    System.out.println("Yengec Burcu");
                } else if (gun >= 22 && gun <= 31) {
                    System.out.println("Aslan Burcu");
                }
                break;
            case 8:
                if (gun >= 1 && gun <= 22) {
                    System.out.println("Aslan Burcu");
                } else if (gun >= 22 && gun <= 30) {
                    System.out.println("Basak Burcu");
                }
                break;
            case 9:
                if (gun >= 1 && gun <= 22) {
                    System.out.println("Basak Burcu");
                } else if (gun >= 22 && gun <= 30) {
                    System.out.println("Terazi Burcu");
                }
                break;
            case 10:
                if (gun >= 1 && gun <= 22) {
                    System.out.println("Terazi Burcu");
                } else if (gun >= 22 && gun <= 31) {
                    System.out.println("Akrep Burcu");
                }
                break;
            case 11:
                if (gun >= 1 && gun <= 21) {
                    System.out.println("Akrep Burcu");
                } else if (gun >= 21 && gun <= 30) {
                    System.out.println("Yay Burcu");
                }
                break;
            case 12:
                if (gun >= 1 && gun <= 21) {
                    System.out.println("Yay burcu");
                } else if (gun >= 21 && gun <= 31) {
                    System.out.println("Oglak Burcu");
                }
                break;


        }
    }


}

