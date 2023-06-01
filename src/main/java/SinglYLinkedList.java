public class SinglYLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode temp = null;
            ListNode temp2 = null;

            while (list1 != null && list2 != null) {

                if (list1.val < list2.val) {
                    temp = list1;
                    list1 = list1.next;
                } else {
                    temp = list2;
                    list2 = list2.next;
                }

                if (temp2 == null) {
                    temp2 = temp;
                }

                temp = temp.next;
            }

            temp = list1 == null ? list2 : list1;

            return temp2;


        }
    }

}
