//#Patterns: codesize_ExcessivePublicCount : { "minimum": "5" }

//#Err: codesize_ExcessivePublicCount
public class Foo {
    public String value;
    public Bar something;
    public Variable var;
    // [... more more public attributes ...]

    public void doWork() {}
    public void doMoreWork() {}
    public void doWorkAgain() {}
    // [... more more public methods ...]
}
