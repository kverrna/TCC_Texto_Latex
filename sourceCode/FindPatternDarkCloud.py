'''
Created on 01/02/2014

@author: ramon
'''

importcsv
import candlesticks
from candlesticks importdarkCloud

print __doc__

f=csv.reader(open('/home/ramon/ATIVOS/DTEX3SA.csv'),delimiter=',')
conjunto=['']

#Le o arquivocsv

for [date,open,high,low,close,volume,adjclose] in f: 
candlestick=[date,open,high,low,close,volume,adjclose]

conjunto.append(candlestick)

print f.line_num,'linhaslidas'

#Procura o padrao no historicopassado
darkCloud.findPatternDarkCloud(conjunto)

