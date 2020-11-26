import java.util.Scanner;

public class MindBenders3 {
    public static void main( String[] args ) {

        // Variables
        int width;
        int row;
        int widthPerLine;
        int characterInLine;
        String character;

        // Program code
        Scanner scan = new Scanner( System.in );

        // Welcoming messages
        System.out.println( "-------------------------------------------------------------------" );
        System.out.println( "|Welcome to Floyd's Character Triangle Generator! " + "@ Whymeeverytime|" );
        System.out.println( "-------------------------------------------------------------------" );
        System.out.println();

        // Ask & get width of triangle
        System.out.print( "Please enter the width: " );
        width = scan.nextInt();

        // Ask & get the character
        System.out.print( "Please enter the character: " );
        scan.nextLine(); //dummy line
        character = scan.nextLine();

        // Generate the triangle
        row = 0;
        widthPerLine = 0;
        while ( row < width ) {
            characterInLine = 0;

            while ( characterInLine <= widthPerLine ) {
                System.out.print( character );

                characterInLine++;
            }
            System.out.println();
            widthPerLine++;

            row++;
        }

        scan.close(); 
    }
}