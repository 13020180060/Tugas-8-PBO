package latihan1;
/*NAMA ; Ita Masita
STAMBUK : 13020180060
TANGGAL/WAKTU ;05 MEI 2020 / 11.14 
 */

public class MainInside {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();
        obj1.addCounter();
        System.out.println("Counter milik obj1= " +obj1.getCounter());
        System.out.println("Counter milik obj1= " +obj2.getCounter());
        System.out.println("Counter milik obj1= " +obj3.getCounter());
    }
}
