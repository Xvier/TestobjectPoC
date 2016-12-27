package data;

/**
 * Created by xviuda on 22-12-16.
 */
public enum User {

    VALID_USER("22222222291329","1329");

    public String id;
    public String pin;

    User(String id, String pin) {
        this.id = id;
        this.pin = pin;
    }
}
