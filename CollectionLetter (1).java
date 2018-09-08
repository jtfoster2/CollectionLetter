import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CollectionLetter {
    public static void main(String[] args) {
        try{
        File file = new File("src/dataCollection.txt");
        Scanner scan = new Scanner(file);
        String filepath = "src/LetterOutput/Letter";
        PrintWriter printwriter = new PrintWriter(filepath);
        String currentline;
        String cache[];

        String fname;
        String lname;
        String address;
        String suite;
        String city;
        String state;
        int zip;
        double balance;

        while (scan.hasNextLine()) {
            currentline = scan.nextLine();
            cache = currentline.split("[|]");

            fname = cache[0];
            lname = cache[1];
            address = cache[2];
            suite = cache[3];
            city = cache[4];
            state = cache[5];
            zip = Integer.parseInt(cache[6]);
            balance = Double.parseDouble(cache[7].replace("$",""));

            for(int i = 0; i < 1000; i++){
                if(balance > 5.00){
                    // String filepath = "src/LetterOutput/Letter";
                    filepath = filepath.concat(String.valueOf(i+1));

                    filepath = filepath.substring(0,23);
                }
            }
            /*
            For Later Shits and Giggles:
            IntStream
            Stringbulder
             */
        }
        }
        catch(FileNotFoundException error){
            error.printStackTrace();
        }
    }
}
/*
            System.out.println("ACME Inc.");
            System.out.println("123 Coffee Beans Street");
            System.out.println("Java, GA 99999");
            // Print 3 blank lines in between
            System.out.println(fname + " " + lname);
            System.out.println(address);
            System.out.println(suite);
            System.out.println(city + ", " + state + " " + zip);
            System.out.println(); // Break
            System.out.println(); // Print Date Here
            // Print two blank lines here
            System.out.println("Dear " + fname + " " + lname + ",");
            System.out.println();
            System.out.println("Our records shows an unpaid balance of " + balance + " that is over 120 days old.");
            System.out.println("The Balance is overdue. If the balance is not paid in full within 10 Business Days (" + newdate + ")");
 */