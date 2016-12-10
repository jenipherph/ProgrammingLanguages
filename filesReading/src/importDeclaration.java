import java.util.Objects;

/**
 * Created by jeniphergonzalez on 12/9/16.
 */

public class importDeclaration {

    public static String term;

    public importDeclaration(String term) {
        this.term = term;
        if (Objects.equals(term, "java.*;"))
            System.out.println("We're good");
        else
            System.out.println("Error at Import Declaration " + term);

    }
}
