class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 && j >= 0) {
            int bit1 = a.charAt(i) - '0', bit2 = b.charAt(j) - '0';
            sb.append(bit1 ^ bit2 ^ carry);
            carry = bit1 & bit2 | bit1 & carry | bit2 & carry;
            i--; j--;
        }
        while (i >= 0) {
            int bit1 = a.charAt(i) - '0';
            sb.append(bit1 ^ carry);
            carry = bit1 & carry;
            i--;
        }
        while (j >= 0) {
            int bit2 = b.charAt(j) - '0';
            sb.append(bit2 ^ carry);
            carry = bit2 & carry;
            j--;
        }
        if (carry == 1) sb.append(carry);
        return sb.reverse().toString();
    }
}