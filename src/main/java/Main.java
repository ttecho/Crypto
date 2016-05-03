import com.homedepot.ta.aa.crypto.Crypto;

/*
    mvn install:install-file -Dfile=src\main\resources\lib\Crypto-1.0.0.jar -DgroupId=thd -DartifactId=crypto -Dversion=1.0.0 -Dpackaging=jar
    mvn install:install-file -Dfile=src\main\resources\lib\commons-lang3-3.4.jar -DgroupId=thd -DartifactId=apache -Dversion=3.4 -Dpackaging=jar
    mvn install:install-file -Dfile=src\main\resources\lib\commons-codec-1.10.jar -DgroupId=thd -DartifactId=codec -Dversion=1.10 -Dpackaging=jar

    Add dependency to pom.xml

 */
public class Main {
    public static void main(final String args[]) {

        System.out.println(decryptString("ROQGbwIk0Dcxh8XDppNVBg=="));
    }

    static String decryptString(final String value) {
        try {
            return Crypto.decrypt(value);
        } catch (java.lang.IllegalStateException e) {
            final String msg = "The password in the CUPS definitons does not appear to be encrypted";
            throw new IllegalStateException(msg, e);
        }
    }

}