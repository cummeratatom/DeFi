#import
from ast import Break


huafei = 4000
salary = 10000
free = huafei*12*25
touzi = 0.08
#start
month=salary-huafei
qiaobao=0
for i in range(1,10000):
    qiaobao=qiaobao+month
    if(qiaobao>free):
        print(i/12)
        break

mon=salary-huafei
qb=0
for i in range(1,10000):
    tz=qb*touzi/12
    qb=qb+tz+mon
    if(qb>free):
        print(i/12)
        break
    
