//#Patterns: design_UseNotifyAllInsteadOfNotify
public class Foo {
 void bar() {
//#Err: design_UseNotifyAllInsteadOfNotify
    x.notify();
    // If many threads are monitoring x, only one (and you won't know which) will be notified.
    // use instead:
    x.notifyAll();
  }
}

