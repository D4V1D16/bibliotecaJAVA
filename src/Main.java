import com.sun.management.UnixOperatingSystemMXBean;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programa util = new Programa();

        int opc = 0;
        while(opc != 5){
            util.Menu();
            System.out.println("Ingrese la Opcion del Programa a ver");
            opc = scanner.nextInt();
            switch(opc){
                case 0:
                    util.option0();
                    break;
                // EDIT BOOKS WITH OPTION ONE
                case 1:
                    util.option1();
                    break;
                case 2:
                    util.option2();
                    break;
                case 3:
                    util.option3();
                    break;
                case 4:
                    util.option4();
                    break;
            }
        }








    }
}