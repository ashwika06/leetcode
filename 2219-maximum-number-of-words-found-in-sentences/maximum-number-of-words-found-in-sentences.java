class Solution {
    public int mostWordsFound(String[] sentences) {
        int mw = 0;
        for(String s:sentences) {
            String[] words = s.split(" ");
            int w = words.length;
            if(w>mw) {
                mw = w;
            }
        }
        return mw;
    }
}