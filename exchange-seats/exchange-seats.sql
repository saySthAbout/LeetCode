select row_number() over(order by u.id) as id,
    u.student as student
from(
    # 짝수 > 홀수
    select id-1 as id, student
    from Seat
    where mod(id, 2) = 0
    
    union all
    
    # 홀수 > 짝수
    select id+1 as id, student
    from Seat
    where mod(id, 2) = 1
)u