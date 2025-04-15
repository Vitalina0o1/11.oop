import java.util.Collections;


public class Pet {

	String name = "";
	protected String expression = "";
	int nameLen = name.length();
	protected int expLen = expression.length();

	public Pet() {
		super();
	}

	public String getExpression() {
		return expression;
	}

	public String getName() {
		return name;
	}

	public String getPaddedName() {
		int s1 = 0, s2 = 0;
		if (expLen > nameLen) {
			s1=(expLen - nameLen)/2;//2
			s2=expLen - nameLen - s1;//3	
		}
		String space1 = String.join("", Collections.nCopies(s1, " "));
		String space2 = String.join("", Collections.nCopies(s2, " "));
	
		return space1+name+space2;
	
	}

	public String getPaddedExpression() {
		int s1 = 0, s2 = 0;
		if (expLen < nameLen) {
			s1=(nameLen - expLen)/2;//2
			s2= nameLen - expLen - s1;//3	
		}
		String space1 = String.join("", Collections.nCopies(s1, " "));
		String space2 = String.join("", Collections.nCopies(s2, " "));
	
		return space1+expression+space2;
	
	}

	public void setName(String name) {
		this.name = name;
		nameLen = name.length();
	}

}