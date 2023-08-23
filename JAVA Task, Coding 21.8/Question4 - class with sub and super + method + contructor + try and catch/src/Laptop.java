// 4. Question1 + Question2 + Contructor + try and catch
import java.util.Scanner;                   // tambah scanner untuk line 27-28

public class Laptop {                       //superclass
    String brand = "aSUS";                  //String

    public void Gaming() {                  //method
        System.out.println("Laptop apa ko pakai?");
    }
}

class aSUS extends Laptop {                 //sub-class ("extends" tu mcm = aSUS "dalam" Laptop)
    String LaptopName = "ROG";              //laptop punya nama

    public aSUS() {
        super();                            //dia call constuctor punya superclass/laptop
    }

    public static void main(String[] args) {
        aSUS myAsusLaptop = new aSUS();
        myAsusLaptop.Gaming();
        System.out.println(myAsusLaptop.brand + " " + myAsusLaptop.LaptopName);

        try {
            Scanner kesan = new Scanner(System.in);
            System.out.println("choose laptop gpu using number\nRTX3050 = 0\nRTX3060 = 1\nRTX3070 = 2\nRTX3080 = 3\nRTX3090 = 4\nRTX4060 = 5\nRTX4070 = 6\nRTX4080 = 7\nRTX4090 = 8");
            System.out.println("You pick is: ");
            int jenisgpu = kesan.nextInt();

            int[] rtx = {3050 , 3060, 3070, 3080, 3090, 4060, 4070, 4080, 4090};
            System.out.println("you laptop gpu is RTX" + rtx[jenisgpu]); // boom

        } catch (Exception r) {
            System.out.println("x de jual sini maap." + r.getMessage());
        }
    }
}


