public class LL {

    private class Node {
        private int val;
        private Node next;
        public void Node(int val){
            this.val = val;
        }
        public void Node(int val, Node node){
            this.val = val;
            this.next=node;
        }
    }

    public void display(){
        Node temp = new Node();
        while(temp.next!=null){
            System.out.println(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
    

}
