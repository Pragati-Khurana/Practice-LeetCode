class LRUCache {
    int capacity;
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    HashMap<Integer, Node> m = new HashMap<>();

    public LRUCache(int c) {
        capacity = c;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(m.containsKey(key)) {
            Node n = m.get(key);
            remove(n);
            insert(n);
            return n.value;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)) {
            remove(m.get(key));
        } else {
            if(m.size()==capacity) {
                remove(tail.prev);
            }
        }
        insert(new Node(key, value));
    }

    private void insert(Node n) {
        m.put(n.key, n);
        n.next = head.next;
        n.next.prev = n;
        head.next = n;
        n.prev = head;
    }

    private void remove(Node n) {
        m.remove(n.key);
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */