import java.util.Scanner;

public class MindBenders4 {
    public static void main( String[] args ) {

        // Variables
        int programType;
        int width;
        int row;
        int characterInLine;
        int maximumWidthPerLine;
        int numberOfSpaces;
        String character;

        // Program Code
        Scanner scan = new Scanner( System.in );

        // Welcoming messages
        System.out.println( "----------------------------------------------------------------------------" );
        System.out.println( "|Welcome to Floyd's Inverted Character Triangle Generator! " + "@ Whymeeverytime|" );
        System.out.println( "----------------------------------------------------------------------------" );
        System.out.println();

        // Ask program type
        System.out.println( "Types of Triangles:" );
        System.out.println( "1. Left" );
        System.out.println( "2. Right" );
        
        System.out.print( "Which type of triangle?: " );
        programType = scan.nextInt();
        System.out.println();

        if ( programType <= 2 && programType > 0 ) {

            // Ask & get width
            System.out.print( "Please enter the width: " );
            width = scan.nextInt();

            // Ask & get the character
            System.out.print( "Please enter the character: " );
            scan.nextLine();
            character = scan.nextLine();

            // Generate the triangle
            row = 0;
            maximumWidthPerLine = width;
            while ( row < width ) {
                characterInLine = 0;

                if ( programType == 2 ) {
                    
                    if ( row >= 1 ) {
                        numberOfSpaces = row;

                        while ( numberOfSpaces > 0 ) {
                            System.out.print( " " );

                            numberOfSpaces--;
                        }
                    }
                }
                while ( characterInLine < maximumWidthPerLine ) {
                    System.out.print( character );

                    characterInLine++;
                }
                System.out.println();

                maximumWidthPerLine--;
                row++;
            }
        }
        else {
            System.out.println("Please enter an valid program type!");
        }

        scan.close(); 
    }
}