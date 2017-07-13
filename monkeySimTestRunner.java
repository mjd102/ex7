import java.util.ArrayList;

import org.junit.runner.*;
import org.junit.runner.notification.*;

public class monkeySimTestRunner {
    public static void main(String[] args) {

        ArrayList<Class> classesToTest = new ArrayList<Class>();
        boolean anyFailures = false;


        classesToTest.add(monkeySimTest.class);


        for (Class c: classesToTest) {
            Result r = JUnitCore.runClasses(c);


            for (Failure f : r.getFailures()) {
                System.out.println(f.toString());
            }


            if (!r.wasSuccessful()) {
                anyFailures = true;
            }

        }


        if (anyFailures) {
            System.out.println("\n!!! - At least one failure, see above.");
        } else {
            System.out.println("\nALL TESTS PASSED");
        }
    }
}
