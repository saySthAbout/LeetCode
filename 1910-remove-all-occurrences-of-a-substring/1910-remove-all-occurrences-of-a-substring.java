class Solution {
    public String removeOccurrences(String s, String part) {
        int result = 0;
        int partLen = part.length();
        StringBuilder truncatedStr = new StringBuilder();
        result = s.indexOf(part);
        while(result != -1){
            System.out.println("지점1 s = " + s + ", part = " + part + ", result = " + result);
            truncatedStr.append(s.substring(0, result)).append(s.substring(result+partLen));
            s = truncatedStr.toString();
            System.out.println("지점2 s = " + s + ", part = " + part + ", result = " + result);
            result = s.indexOf(part);
            truncatedStr.setLength(0);
        }
        return s;
    }
}