import java.util.Scanner;

/**
 * Floyd's triangle generator
 * @author Borga Haktan Bilen
 * @version 8.11.2020
 */
public class MindBenders {
    public static void main( String[] args ){
        
        // Variables
        int width;
        int rowNumber;
        int n;
        int numberInLine;

        // Program code
        Scanner scan = new Scanner( System.in );

        // Welcoming messages
        System.out.println( "---------------------------------------------------------" );
        System.out.println( "|Welcome to Floyd's Triangle Generator! " + "@ Whymeeverytime|" );
        System.out.println( "---------------------------------------------------------" );
        System.out.println();
        
        // Ask & get an integer value
        System.out.print( "Please enter an width: " );
        width = scan.nextInt();
        
        // Ask & get a character
        System.out.print( "Please enter an integer: " );
        n = scan.nextInt();
        
        // Generate the triangle
        System.out.println( "---------------------------------------------------------" );
        rowNumber = 0;
        
        while ( rowNumber < width ) {
            numberInLine = 0;
            
            while ( numberInLine < rowNumber ) {
                System.out.print( n );
                n++;

                numberInLine++;
            }
            System.out.println();
            
            rowNumber++;
        }
        System.out.println( "---------------------------------------------------------" );

        scan.close();
    }
}