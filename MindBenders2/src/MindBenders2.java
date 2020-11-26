import java.util.Scanner;

/**
 * Program Description 
 * @author Borga Haktan Bilen
 * @version 08.11.2020
*/ 
public class MindBenders2 {
    public static void main( String[] args ) {
        
        // Variables
        int maximumWidth;
        int endingInt;
        int row;
        int characterInLine;
        int maximumCharacterInLine;

        // Program Code
        // Welcoming messages
        Scanner scan = new Scanner( System.in );
        System.out.println( "-----------------------------------------------------------------" );
        System.out.println( "|Welcome to inverted Floyd's Triangle Generator!" + "@ Whymeeverytime|" );
        System.out.println( "-----------------------------------------------------------------" );

        // Ask & get the max width
        System.out.print( "Please enter the maximum width: " );
        maximumWidth = scan.nextInt();

        // Ask & get the ending integer
        System.out.print( "Please enter the ending integer: " );
        endingInt = scan.nextInt();

        // Create the inverted triangle
        row = 0;
        maximumCharacterInLine = maximumWidth;
        while ( row < maximumWidth ) {
            characterInLine = 0;

            while ( characterInLine < maximumCharacterInLine ) {
                System.out.print( endingInt );
                endingInt--;

                characterInLine++;
            }
            maximumCharacterInLine--;
            System.out.println();

            row++;
        }
        
        scan.close();
    }
}