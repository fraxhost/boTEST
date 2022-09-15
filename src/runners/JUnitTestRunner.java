package runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import util.ClassLoader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class JUnitTestRunner {
//    private static String TEST_CLASS_PATH = "E:\\Programming\\Java\\BoTest\\target\\test-classes";
    private static String TEST_CLASS_PATH = "src\\runners";
    private static String PACKAGE_NAME = "runners";
    private String testClassName;
    private Class loadedClass;

    public JUnitTestRunner(String testClassName) {
        this.testClassName = testClassName;

        String filePath = TEST_CLASS_PATH + "\\" + testClassName + ".java";
        String className = PACKAGE_NAME + "." + testClassName;
//        String className = testClassName;

        loadedClass = ClassLoader.loadClass(filePath, className);
    }

    public void execute() {
        JUnitCore junit = new JUnitCore();

        Result result = junit.run(loadedClass);

        System.out.println("####");
        System.out.println(result.getRunCount());
    }
}
