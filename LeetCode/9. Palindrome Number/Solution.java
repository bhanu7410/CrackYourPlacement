class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        String s= Integer.toString(x);
        StringBuilder i = new StringBuilder("");
        i.append(s);
        // System.out.print(i.toString().equals(i.reverse().toString()));
    	return x>=0 && i.toString().equals(i.reverse().toString());
    }
}