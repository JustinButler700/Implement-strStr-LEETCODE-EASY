//Justin Butler
// 11/20/2021
// This one is a pretty easy one.
class Solution {
    public int strStr(String haystack, String needle) {
        //Get the index location of our substring
        int strIndex = haystack.indexOf(needle);
        //If we find a valid substring index, return it. else return -1.
        return strIndex>=0 ? strIndex : -1;
    }
}
