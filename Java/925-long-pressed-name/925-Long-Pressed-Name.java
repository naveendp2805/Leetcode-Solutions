class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n1 = name.length(), n2 = typed.length();

        int i=0, j=0;

        while(j < n2)
        {
            if(i < n1 && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if(j == 0 || typed.charAt(j) != typed.charAt(j-1)) {
                return false;
            }

            j++;
        }

        return i == n1;
    }
}