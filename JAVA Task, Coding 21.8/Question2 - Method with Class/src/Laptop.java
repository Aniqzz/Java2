//2. Method with Class(Question1)
public class Laptop {                       //superclass
    String brand = "aSUS";                  //String
    public void Gaming() {                  //method
        System.out.println("Laptop apa ko pakai?");
    }
}
class aSUS extends Laptop {                 //sub-class ("extends" tu mcm = aSUS "dalam" Laptop)
    String LaptopName = "ROG";              //laptop punya nama
    public static void main(String args[]) {
        aSUS myAsusLaptop = new aSUS();     //Object wakil aSUS
        myAsusLaptop.Gaming();              //Call method
        System.out.println(myAsusLaptop.brand +" " + myAsusLaptop.LaptopName); //display campur "line 3" "Line 9"
    }
}