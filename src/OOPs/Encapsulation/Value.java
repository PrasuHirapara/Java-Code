package OOPs.Encapsulation;
/*
    Wrapping of data and information in single unit called class.
    Declare class variables private so that no one outside this class can access it.
    Declare method as public so that user can modify private variables.
*/
public class Value {
    private int value; // Data hiding

    public void setValue(int n){
        this.value = n;
    }

    public int getValue() {
        return value;
    }
}
