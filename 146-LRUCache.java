//Question Link - https://leetcode.com/problems/lru-cache/

class LRUCache {
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    
    HashMap<Integer, Node> map = new HashMap<>();
    int size;
    
    public LRUCache(int capacity) {
        size = capacity;
        
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key) == true){
            Node temp = map.get(key);
            
            remove(temp);
            insert(temp);
            
            return temp.value;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key) == true){
            remove(map.get(key));
        }
        
        if(map.size() == size){
            remove(tail.prev);
        }
        
        Node temp = new Node(key, value);
        insert(temp);
    }
    
    class Node{
        int value, key;
        Node next;
        Node prev;
        
        Node(int key1, int value1){
            key = key1;
            value = value1;
        }
    }

    // now we will make our basic - insert and delete operation
    private void insert(Node temp){
        map.put(temp.key, temp);
        
        temp.next = head.next;
        head.next.prev = temp;
        head.next = temp;
        temp.prev = head;
    }

    private void remove(Node temp){
        map.remove(temp.key);
    
        // now from the list
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
