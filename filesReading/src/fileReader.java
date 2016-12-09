/**
 *
 * Programming Languages Final Project
 *
 * Jenipher D. Gonzalez Aponte and Christian Fonseca
 * Professor Idalides Vergara, PhD
 *
 * Universidad del Turabo
 * Deadline: December 14, 2016
 *
 */

/**
 * Libraries Declaration
 * **/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class fileReader {

   // private static final String FILENAME = "/Users/jeniphergonzalez/Documents/UT/ProgrammingLanguages/" +
     //       "resources/examples/example1.java";
    public static void main(String [] args){
        Scanner scanner = null;
        String []  stringArray= null;

        int count = 0;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(menu())));
            if(scanner != null)
                stringArray = new String[500];

            while(scanner.hasNext()){

                stringArray[count] = scanner.next().trim().toString();
                System.out.println(count + ". " + stringArray[count]);

                count++;
            }

            for(int i = 0; i < stringArray.length; i++)
                switch (stringArray[i]) {
                    case "import":
                        new importDeclaration(stringArray[++i]);

                        System.out.print("This is a keyword: " + stringArray[i]+"\n");
                        System.out.println("You have an import! Line " + i);
                        i++;
                        System.out.println("You must have: java.*;");
                        System.out.println("You have: " + stringArray[i]);
                       if (Objects.equals(stringArray[i], "java.*;") && Objects.equals(stringArray[++i], "class"))
                           System.out.println("true!");
                        else
                        System.out.println("Error! Line: " + i);
                        break;
                    case "class":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a class! Line " + i);
                        if(Objects.equals(stringArray[i], "{"))
                            System.out.println("We're good!");
                        break;
                    case "public":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a public! Line " + i);
                        break;
                    case "protected":
                        System.out.print("This is a keyword: " + stringArray[i]+"\n");
                        System.out.println("You have an protected! Line " + i);
                        break;
                    case "private":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a private! Line " + i);
                        break;
                    case "static":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a static! Line " + i);
                        break;
                    case "final":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a final! Line " + i);
                        break;
                    case "transient":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a transient! Line " + i);
                        break;
                    case "volatile":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a volatile! Line " + i);
                        break;
                    case "synchronized":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a synchronized! Line " + i);
                        break;
                    case "void":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a void! Line " + i);
                        break;
                    //Variables Keywords: int and double
                    case "int":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a int! Line " + i);
                        break;
                    case "double":
                        System.out.println("This is a keyword: " + stringArray[i]);
                        System.out.println("You have a double! Line " + i);
                        break;
                    default:
                        System.out.println("Check for another function! Line: " + i);
                        break;
                }


        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if(scanner != null)
                scanner.close();
        }
    }

    /** Menu Function
     *  Determination of file to be compiled.
     *  **/
    public static String menu(){
        String [] codeName = new String[7];
        String fileName;
        int value;

        Scanner input = new Scanner(System.in);

        codeName[0] = "example1.java";
        codeName[1] = "example2.java";
        codeName[2] = "example3.java";
        codeName[3] = "example4.java";
        codeName[4] = "example5.java";
        codeName[5] = "example6.java";
        codeName[6] = "example7.java";

        System.out.println("Mini-Java");
        System.out.println("Select Examples (1) or Errors! (2). Insert the #");
        value = input.nextInt();

        if(Objects.equals(value,  1))
            fileName = "/Users/jeniphergonzalez/Documents/UT/ProgrammingLanguages/resources/examples/";
        else
            fileName = "/Users/jeniphergonzalez/Documents/UT/ProgrammingLanguages/resources/errors/";

        System.out.println("Select a file:");
        for(int i = 0; i < codeName.length; i++)
            System.out.println(i + ". " + codeName[i]);

        System.out.print("Select a File name: ");
        input.nextLine();

        fileName +=  input.nextLine();
        System.out.println(fileName);

        return fileName;
    }
}
