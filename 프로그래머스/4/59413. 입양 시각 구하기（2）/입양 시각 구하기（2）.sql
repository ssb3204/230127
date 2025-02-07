set @HOUR=-1;
SELECT (@HOUR:=@HOUR+1) as HOUR , 
       (select count(*) 
        from ANIMAL_OUTS
        where HOUR(DATETIME) = @HOUR) as COUNT
from ANIMAL_OUTS
where @hour <23;