import java.io.IOException;
import java.util.Scanner;
public class Test {
  public static void main(String[] args) throws IOException, InterruptedException{
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    Scanner input = new Scanner(System.in);

    // todo : deklarasi variabel
    int myNumber;

    System.out.print("Masukkan Nomor : ");
    myNumber = input.nextInt();
    
    if(myNumber == 1) {
      System.out.println("Intan");
    }else if (myNumber == 2) {
      System.out.println("Nala");
    }else {
      System.out.println("Rini");
    }

    input.close();
  }
}
