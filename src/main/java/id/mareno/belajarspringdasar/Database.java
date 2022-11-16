package id.mareno.belajarspringdasar;

/**
 * @author Samuel Mareno
 * @Date 20/04/22
 */
public class Database {

    private static Database database;

    private Database() {

    }

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }
}
