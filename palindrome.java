class Solution {
    public boolean isPalindrome(ListNode head) {
        // LinkedNode a=head;
        List<Integer> lst=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            lst.add(current.val);
            current=current.next;
        }
        int l=0;
        int r=list.size()-1;
        while(l<r && lst.get(l) == lst.get(r)){
            l++;
            r--;
        }
        return l>=r;

        
    }
}

