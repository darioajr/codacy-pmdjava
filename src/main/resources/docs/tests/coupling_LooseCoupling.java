//#Patterns: coupling_LooseCoupling
public class Foo {


	//#Warn: coupling_LooseCoupling
	private ArrayList list = new ArrayList();

    //#Warn: coupling_LooseCoupling
	public HashSet getFoo() {

        return new HashSet();
	}

	// preferred approach
	private List list2 = new ArrayList();

	public Set getFoo2() {

        return new HashSet();
	}
}

