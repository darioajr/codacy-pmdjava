//#Patterns:  optimizations_MethodArgumentCouldBeFinal
public class Foo {

    //#Err: optimizations_MethodArgumentCouldBeFinal
    public void bar(int i) {
        //do something here
    }

    public void correct(final int i) {
        //the correct way
    }

}
