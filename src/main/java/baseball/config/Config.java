package baseball.config;

public enum Config {
    MIN_RANDOM_NUMBER(1),
    MAX_RANDOM_NUMBER(9),
    NUMBER_OF_RANDOM_NUMBER(3);

    private final Object value;

    Config(Object value) {
        this.value = value;
    }

    public int getInt() {
        return (int) value;
    }

    public String getString() {
        return (String) value;
    }
}
