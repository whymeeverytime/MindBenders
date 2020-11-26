import java.util.Scanner;

/**
 * Floyd's Triangle generators
 * @author Borga Haktan Bilen
 * @version 08.11.2020
*/ 
public class MindBendersComplete {
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );
        
        // Variables
        int programSelection;
        
        
        // Program Code
        // ASCII art
        System.out.println();
        System.out.println( " _|          _|   _|                    _|      _|              _|_|_|_|                                                   _|       _|                              " );
        System.out.println( " _|          _|   _|_|_|     _|    _|   _|_|  _|_|     _|_|     _|         _|      _|     _|_|     _|  _|_|   _|    _|   _|_|_|_|        _|_|_|  _|_|       _|_|    " );
        System.out.println( " _|    _|    _|   _|    _|   _|    _|   _|  _|  _|   _|_|_|_|   _|_|_|     _|      _|   _|_|_|_|   _|_|       _|    _|     _|       _|   _|    _|    _|   _|_|_|_|  " );
        System.out.println( "   _|  _|  _|     _|    _|   _|    _|   _|      _|   _|         _|           _|  _|     _|         _|         _|    _|     _|       _|   _|    _|    _|   _|        " );
        System.out.println( "     _|  _|       _|    _|     _|_|_|   _|      _|     _|_|_|   _|_|_|_|       _|         _|_|_|   _|           _|_|_|       _|_|   _|   _|    _|    _|     _|_|_|  " );
        System.out.println( "                                   _|                                                                               _|                                              " );
        System.out.println( "                               _|_|                                                                             _|_|                                                " );
        /*Secondary ASCII art
        System.out.println( "██     ██ ██   ██ ██    ██ ███    ███ ███████ ███████ ██    ██ ███████ ██████  ██    ██ ████████ ██ ███    ███ ███████" );
        System.out.println( "██     ██ ██   ██  ██  ██  ████  ████ ██      ██      ██    ██ ██      ██   ██  ██  ██     ██    ██ ████  ████ ██      " );
        System.out.println( "██  █  ██ ███████   ████   ██ ████ ██ █████   █████   ██    ██ █████   ██████    ████      ██    ██ ██ ████ ██ █████   " );
        System.out.println( "██ ███ ██ ██   ██    ██    ██  ██  ██ ██      ██       ██  ██  ██      ██   ██    ██       ██    ██ ██  ██  ██ ██      " );
        System.out.println( " ███ ███  ██   ██    ██    ██      ██ ███████ ███████   ████   ███████ ██   ██    ██       ██    ██ ██      ██ ███████ " );
        */
        
        // Welcoming messages
        System.out.println();
        System.out.println( "----------------------------------------------------------" );
        System.out.println( "\t\t" + '\u2730' + " Welcome to MindBender! " + '\u2730' );
        System.out.println( "----------------------------------------------------------" );
        System.out.println();

        // Program List
        System.out.println( "**********************************************************" );
        System.out.println( "\t\t" + "Programs:" );
        System.out.println( "1. Floyd's Triangle Generator (integer)" );
        System.out.println( "2. Floyd's Triangle Generator Inverted (integer)" );
        System.out.println( "3. Floyd's Triangle Generator (character)" );
        System.out.println( "4. Floyd's Triangle Generator Inverted (character)" );
        System.out.println( "**********************************************************" );
        
        // Program switcher. Prompt & ask
        System.out.println();
        System.out.print( "What program do you want to use: " );
        programSelection = scan.nextInt();
        System.out.println();

        if ( programSelection == 1 ) {
            // Variables
            int width;
            int rowNumber;
            int n;
            int numberInLine;

            // Program code
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
        }
        else if ( programSelection == 2 ) {

            // Variables
            int maximumWidth;
            int endingInt;
            int row;
            int characterInLine;
            int maximumCharacterInLine;


            // Program Code
            // Welcoming messages
            System.out.println( "-----------------------------------------------------------------" );
            System.out.println( "|Welcome to inverted Floyd's Triangle Generator! " + "@ Whymeeverytime|" );
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
        }
        else if ( programSelection == 3 ) {

            // Variables
            int width;
            int row;
            int widthPerLine;
            int characterInLine;
            String character;

            // Program code
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
        }
        else if ( programSelection == 4 ) {

            // Variables
            int programType;
            int width;
            int row;
            int characterInLine;
            int maximumWidthPerLine;
            int numberOfSpaces;
            String character;

            // Program Code
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
                System.out.println( "Please enter an valid program type!" );
            }
        }
        else {
            System.out.println( "Please enter a valid program type!" );
        }

        scan.close();
    }
}