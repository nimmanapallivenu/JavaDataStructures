package linkedlist;

class Neighbor {
    public String homeOwnerName;
    public int houseNumber;

    public Neighbor next;
    public Neighbor previous;

    public Neighbor(String homeOwnerName, int homeNumber) {
        this.homeOwnerName = homeOwnerName;
        this.houseNumber = homeNumber;
    }

    public void display() {
        System.out.println(homeOwnerName + " : " + houseNumber);
    }

    public String toString() {
        return this.homeOwnerName;
    }
}

class DoubleEndedLinkedList {
    Neighbor firstLink;
    Neighbor lastLink;

    public void insertInFirstPosition(String homeOwnerName, int houseNumber) {
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        if (isEmpty()) {
            lastLink = newLink;
        } else {
            firstLink.previous = newLink;
        }
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public boolean isEmpty() {
        return firstLink == null;
    }

    public void insertInLastPosition(String homeOwnerName, int houseNumber) {
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        if (isEmpty()) {
            firstLink = newLink;
        } else {
            lastLink.next = newLink;
            newLink.previous = lastLink;
        }
    }

    public boolean insertAfterKey(String homeOwnerName, int houseNumber, int key) {
        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        Neighbor current = firstLink;

        while (current.houseNumber != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        if (current == lastLink) {
            theNewLink.next = null;
            lastLink = theNewLink;
        } else {
            theNewLink.next = current.next;
            current.next.previous = theNewLink;
        }
        theNewLink.previous = current;
        current.next = theNewLink;

        return true;
    }

    public static void main(String[] args) {

        DoubleEndedLinkedList list = new DoubleEndedLinkedList();
        list.insertInFirstPosition("venu", 1001);
        list.insertInFirstPosition("reddy", 99);
        list.insertInLastPosition("ayansh", 9);
        list.display();
    }

    public void display() {

        Neighbor theLink = firstLink;
        while (theLink != null) {
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            System.out.println("Previous Link: " + theLink.previous);
            theLink = theLink.next;
            System.out.println();
        }

    }
}
