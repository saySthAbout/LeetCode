class Solution {
    public String removeOccurrences(String s, String part) {
        int result = 0;
        int partLen = part.length();
        String truncatedStr = "";
        result = s.indexOf(part);
        while(result != -1){
            System.out.println("지점1 s = " + s + ", part = " + part + ", result = " + result);
            truncatedStr = s.substring(0, result);
            truncatedStr += s.substring(result+partLen);
            s = truncatedStr;
            System.out.println("지점2 s = " + s + ", part = " + part + ", result = " + result);
            result = s.indexOf(part);
        }
        return s;
    }
}