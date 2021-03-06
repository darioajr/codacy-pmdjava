Using a branching statement as the last part of a loop may be a bug, and/or is confusing.
Ensure that the usage is not a bug, or consider using another approach.

Ex:

```
    // unusual use of branching statement in a loop
    for (int i = 0; i < 10; i++) {
        if (i*i <= 25) {
            continue;
        }
        break;
    }

    // this makes more sense...
    for (int i = 0; i < 10; i++) {
        if (i*i > 25) {
            break;
        }
    }
```
[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/basic.html#AvoidBranchingStatementAsLastInLoop)
