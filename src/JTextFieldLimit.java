// Code from Real Gagnon and tim_yates on rgagnon.com and Stack Overflow

import javax.swing.text.*;

public class JTextFieldLimit extends PlainDocument {
	private int limit;
	JTextFieldLimit(int limit) {
		super();
		this.limit = limit;
	}
	JTextFieldLimit(int limit, boolean upper) {
	    super();
	    this.limit = limit;
	  }

	  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
	    if (str == null)
	      return;

	    if ((getLength() + str.length()) <= limit) {
	      super.insertString(offset, str, attr);
	    }
	  }
}
