
class linkedl {

    char ch;
    linkedl next;

    //constructor;
    linkedl(char val) {
        this.ch = val;
        this.next = null;
    }
}

public class ll_revision {

    public static linkedl addfirst(linkedl l, char ch) {
        //step1 : new node create;
        linkedl newnode = new linkedl(ch);

        newnode.next = l;

        l = newnode;
        return l;
    }

    public static void addlast(linkedl l, char ch) {
        //step 1 : traverse karke tail tak jao;

        linkedl temp = l;
        while (temp.next != null) {
            temp = temp.next;
        }

        //step 2 : created a new node;
        linkedl newnode = new linkedl(ch);

        //step 3 : temp ke next mein newnode daal do;
        temp.next = newnode;

    }

    public static void traverse(linkedl l) {
        linkedl temp = l;
        while (temp != null) {
            System.out.print(temp.ch + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        linkedl l = new linkedl('A');
        l = addfirst(l, 'B');
        l = addfirst(l, 'C');
        l = addfirst(l, 'D');
        l = addfirst(l, 'E');

        addlast(l, 'X');
        addlast(l, 'Y');
        addlast(l, 'Z');

        traverse(l);

    }
}
