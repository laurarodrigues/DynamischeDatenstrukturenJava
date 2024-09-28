package EinfacheListen;

public class ListElement {

	private int wert;
	private ListElement nextElement;

	public ListElement(int wert) {
		this.wert = wert;
		this.nextElement = null;
	}

	public void setNextElem(ListElement nextElem) {
		this.nextElement = nextElem;
	}

	public ListElement getNextElement() {
		return nextElement;
	}

	public int getWert() {
		return wert;
	}

}
