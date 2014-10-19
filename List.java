// Create List getters and setters here
class Link {
  
  // link is head here
  
  private Node link;
  public Link() {
    link = new Node(link);
    count = 0;
  }
  
  public void addLink(Object link, int index) {
    Node temp = new Node(link);
    Node current = link;
    for (int i=0; i < index; i++) {
      current = current.getNext();
    }
    current.setNext(temp);
    temp.setNext(current.getNext());
    count++;
  }
  
  public boolean remove(int index) {
    if(index < 1 || index > size()) 
      return false;
      
    for (int i = 0; i < index; i++) {
      current = current.getNext());
      }
      current.setNext(current.getNext().getNext()); // node1 -> node2 -> node3 = node1 -> node3 (for node2 deletion)
      count--;
      return true;
  }
  
  public Link getNext() {
    return next;
  }
  
  public void setNext(Node myNext) {
   next = myNext; 
  }
  
  
  
}
