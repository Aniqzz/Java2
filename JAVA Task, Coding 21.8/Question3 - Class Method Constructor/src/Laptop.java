// 3. Question1 + QUestion2 + Contructor
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

    public static void main(String args[]) {
        aSUS myAsusLaptop = new aSUS();     //ni object
        myAsusLaptop.Gaming();              //method
        System.out.println(myAsusLaptop.brand +" " + myAsusLaptop.LaptopName);
    }
}


