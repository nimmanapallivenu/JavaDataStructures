package linkedlist;

class Link {
    public String bookName;
    public int milliSold;

    public Link next;

    public Link(String bookName, int sold) {
        this.bookName = bookName;
        this.milliSold = sold;
    }

    public void display() {
        System.out.println(bookName + " : " + milliSold + " ,000,000");
    }

    public String toString() {
        return this.bookName;
    }

}

class LinkedList {
    public Link firstLink;

    public LinkedList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return firstLink == null;
    }

    public void insertFirstLink(String name, int sold) {
        Link newlink = new Link(name, sold);
        newlink.next = firstLink;
        firstLink = newlink;
    }

    public Link removeFirst() {

        Link linkRef = firstLink;
        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println(" LinkedList is Empty");
        }
        return linkRef;
    }


    public void display() {
        Link tmp = firstLink;
        while (tmp != null) {
            tmp.display();
            tmp = tmp.next;
            System.out.println(" Next Link : " + tmp);
            System.out.println();
        }
    }

    public Link find(String bookName) {
        Link tmp = firstLink;
        if (!isEmpty()) {
            while (tmp.bookName != bookName) {
                if (tmp.next == null) {
                    return null;
                } else {
                    tmp = tmp.next;
                }
            }
        } else {
            System.out.println(" LinkedList Empty");
        }
        return tmp;
    }

    public Link removeLink(String bookName){
        Link tmp =  firstLink;
        Link previousLink = firstLink;

        while(tmp.bookName != bookName){
            if(tmp.next == null){
                return null;
            }else{
                previousLink = tmp;
                tmp = tmp.next;
            }
        }
        if(tmp == firstLink){
            firstLink =  firstLink.next;
        }else{
            previousLink.next =tmp.next;
        }
        return tmp;
    }


    public static void main(String[] args) {

        LinkedList linkedList =  new LinkedList();
        linkedList.insertFirstLink("c++",10);
        linkedList.insertFirstLink("java",50);
        linkedList.insertFirstLink("go",100);
        linkedList.insertFirstLink("JS",20);
        linkedList.display();

        linkedList.removeFirst();
        System.out.println("------------------");
        linkedList.display();

        linkedList.removeLink("c++");

        System.out.println("------------------");
        linkedList.display();




    }

}



