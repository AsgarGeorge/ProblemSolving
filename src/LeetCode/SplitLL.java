package LeetCode;

public class SplitLL {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Determine the size of each part and how many parts get an extra node
        int extraVal = count % k; // Number of parts that get an extra node
        int eachVal = count / k;  // Base size of each part

        ListNode[] list = new ListNode[k]; // The array of parts to return
        temp = head;

        for (int i = 0; i < k; i++) {
            list[i] = temp; // Set the head of the current part

            // Calculate the size of the current part
            int currentPartSize = eachVal + (extraVal > 0 ? 1 : 0);
            extraVal--; // Decrease extraVal after assigning extra node (if any)

            // Traverse current part
            for (int j = 1; j < currentPartSize; j++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }

            // Detach the current part from the rest of the list
            if (temp != null) {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }

        return list;

    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
