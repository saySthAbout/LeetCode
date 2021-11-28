class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        
        def genParent(s,left,right,result):
            if left: genParent(s+'(',left-1,right,result) #왼쪽에 괄호를 더해준다
            if right>left:genParent(s+')',left,right-1,result) #right가 더 크면 왼쪽괄호가 이미 있다는 뜻(오른쪽 넣어도 된다)
            if not right: # 모든 괄호를 채웠을 경우
                result.append(s)
            return result #전체 배열 반환
        
        return genParent('',n,n,[])