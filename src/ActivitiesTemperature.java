import java.util.Scanner;
public class ActivitiesTemperature {
    public static void main(String[] args) {
        /*      Koşullar :
         *      Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
         *      Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
         *      Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
         *      Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */
        int heat;
        //define scanner
        Scanner doa = new Scanner(System.in);
        //get value from user
        System.out.println("Enter the air tempeture: ");
        heat = doa.nextInt();

        if (heat < 5) {
            System.out.println("You can go skiing.");
        } if (heat >= 5 && heat < 15) {
                System.out.println("You can go to the cinema.");
            }if (heat >= 15 && heat <= 25) {
                    System.out.println("You can go for a picnic.");
                }if (heat > 25) {
                        System.out.println("you can go swimming.");
                    }



    }
}