package id.mareno.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Samuel Mareno
 * @Date 20/04/22
 */
public class DatabaseTest {

    @Test
    void testSingleton() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();

        Assertions.assertSame(database1, database2);
    }
}
