Created on 02/02/2014

@author: ramon
'''

deffindPatternDarkCloud(list):
#   listResult=['']
i=2
qtd=0
    C=0
    O=0
    H=0
    L=0
    C1=0
    O1=0

for candle in list:

if (i+1)<len(list)  : 
            C=float(list[i][4])
            O=float(list[i][1])
            H=float(list[i][2])
            L=float(list[i][3])

            C1=float(list[i+1][4])
            O1=float(list[i+1][1])

i=i+1
if((C1>O1)and
               (((C1+O1)/2)>C)and
               (O>C)and
               (O>C1)and
               (C>O1)and
               (((O-C)/(0.001+H-L))>0.6)
               ):
qtd=qtd+1
print list[i][0]
print"Frequencia: ",qtd

return
