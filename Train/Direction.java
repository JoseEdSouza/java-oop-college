// The code is defining an enumeration called `Direction` in the `Trem` package. The `Direction`
// enumeration has two values: `IN` and `OUT`. Each value is associated with a string value, "in" and
// "out" respectively. The enumeration also has a private instance variable `value` of type `String`
// and a constructor that sets the `value` variable. There is also a getter method `getValue()` that
// returns the `value` of each enumeration value.
package Train;

public enum Direction {
    IN("in"), OUT("out");

    private String value;

    private Direction(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
