//#Patterns: design_UseLocaleWithCaseConversions


public class Foo {

    public void Bar() {

        x = "List";

    	//#Warn: design_UseLocaleWithCaseConversions
		 boolean result = x.toLowerCase().equals("list");
	 
		 // GOOD
		 String z = a.toLowerCase(Locale.EN);

    }
}

