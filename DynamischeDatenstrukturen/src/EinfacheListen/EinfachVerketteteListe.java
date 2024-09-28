package EinfacheListen;

public class EinfachVerketteteListe {

	ListElement startElement = new ListElement(4);

	public EinfachVerketteteListe() {
	}

	public void addLast(int wert) {
		ListElement newElem = new ListElement(wert);
		ListElement lastElem = getLastElement();
		lastElem.setNextElem(newElem);
	}

	public void insertAfter(int prevItem, int newItem) {
		ListElement newElem, nextElem, pointerElem;
		pointerElem = startElement.getNextElement();
		while (pointerElem != null && (pointerElem.getWert() == prevItem)) {
			pointerElem = pointerElem.getNextElement();
		}
		newElem = new ListElement(newItem);
		nextElem = pointerElem.getNextElement();
		pointerElem.setNextElem(newElem);
		newElem.setNextElem(nextElem);
	}
	
	public void delete(int wert){
        ListElement le = startElement;
        while (le.getNextElement() != null && (le.getWert() == wert)){
            if(le.getNextElement().getWert() == wert){
                if(le.getNextElement().getNextElement()!=null)
                    le.setNextElem(le.getNextElement().getNextElement());
                else{
                    le.setNextElem(null);
                    break;
                }
            }
            le = le.getNextElement();
        }
    } 
	
	public boolean find(int wert){
        ListElement le = startElement;
        while (le != null){
            if(le.getWert() == wert)
            return true;
            le = le.getNextElement();
        }
        return false;
    }
	
	 public ListElement getFirstElem() {
	        return startElement;
	    }

	public ListElement getLastElement() {
		ListElement le = startElement;
		while (le.getNextElement() != null) {
			le = le.getNextElement();
		}
		return le;
	}
	
	public void writeList() {
        ListElement le = startElement;
        while(le != null){
            System.out.println(le.getWert());
            le = le.getNextElement();
        }
    } 

}
