import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;

class Solution {
    // 0의 연속된 개수를 세는 포인터
    Queue<Integer> zeroQueue = new LinkedList<>();
    // 1의 연속된 개수를 세는 포인터
    Queue<Integer> oneQueue = new LinkedList<>();
    
    public int result = 0;
    public int sLength = 0;
    String fullS = "";
    String curStr = "";
    
    // s의 처음부터 끝까지 모든 문자열을 추출한다.
    public int countBinarySubstrings(String s) {
        sLength = s.length();
        fullS = s;
        for(int i=0; i<s.length(); i++){
            curStr = s.substring(i, i+1);
            switch(curStr){
                case "0":
                    keepZero(i);
                    break;
                case "1":
                    keepOne(i);
                    break;
            }
        }
        return result;
    }
    
    public void keepZero(int index){
        zeroQueue.add(0);
        // 마지막 문자열 처리
        if(sLength - 1 == index){
            result += getMinQueueSize();
            return;
        }
        
        if(oneQueue.size() > 0 && fullS.substring(index+1, index+2).equals("1")){
            result += getMinQueueSize();
            oneQueue.clear();
        }
        
        // System.out.println("[keepZero] index = " + index+ "curStr =" + curStr+ "result =" + result);
    }
    
    public void keepOne(int index){
        oneQueue.add(1);
        // 마지막 문자열 처리
        if(sLength - 1 == index){
            result += getMinQueueSize();
            return;
        }
        if(zeroQueue.size() > 0 && fullS.substring(index+1, index+2).equals("0")){
            result += getMinQueueSize();
            zeroQueue.clear();
        }
        
        // System.out.println("[keepOne] index = " + index+ "curStr =" + curStr+ "result =" + result);
    }
    
    public int getMinQueueSize(){
        return Math.min(zeroQueue.size(), oneQueue.size());
    }
}