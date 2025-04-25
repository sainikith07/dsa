class MyLinkedList {
    Node head;
    int len; 
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public MyLinkedList() {
        head=null;
        len=0;
    }
    
    
    public int get(int index) {
        Node t=head;
        if(index <0 || index >=len){
            return -1;
        }
        for(int i=0;i<index;i++){
            t=t.next;
        }
        return t.val;
       
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        nn.next=head;
        head=nn;
        len++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
        }
        else{
            Node nn=new Node(val);
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=nn;
            len++;
        }
        
    }
    
    public void addAtIndex(int index, int val) {
         if(index>len){
            return;
        }
        if(index==0){
           addAtHead(val); 
        }

        else{
            Node nn=new Node(val);
            Node t=head;
            for(int i=0;i<index-1;i++){
                t=t.next;
            }
            Node tt=t.next;
            t.next=nn;
            nn.next=tt;
            
            len++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(head==null||index>=len){
            return;
        }
        if(index==0){
            head=head.next;
            len--;
            return;
        }

        Node t=head;
        int c=1;
        while(c<index){
             t=t.next;
             c++;
        }
        t.next=t.next.next;
        len--;

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
