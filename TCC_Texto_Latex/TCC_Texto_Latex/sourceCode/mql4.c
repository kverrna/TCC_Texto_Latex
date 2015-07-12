//+------------------------------------------------------------------+
//|                                                    indicadorTcc.mq4 |
//|                        Copyright 2014, Ramon Cruz. |
//|                                              www.facebook.com/kverrna |
//+------------------------------------------------------------------+
#property copyright "Copyright 2014, Ramon Cruz."
#property link      "www.facebook.com/kverrna"
#propertyversion   "1.00"
#propertystrict
#propertyindicator_chart_window
#propertyindicator_buffers 1
#property  indicator_color1 Green
//#propertyindicator_style STYLE_SOLID

doubleExtmapBuffer[];

//+------------------------------------------------------------------+
//| Customindicatorinitializationfunction                         |
//+------------------------------------------------------------------+
intOnInit()
  {
//--- indicator buffers mapping
IndicatorDigits(Digits);
SetIndexStyle(0,DRAW_ARROW);

//SetIndexStyle (0,DRAW_LINE);
SetIndexBuffer(0,ExtmapBuffer);

//---
return(INIT_SUCCEEDED);
  }
//+------------------------------------------------------------------+
//| Customindicatoriterationfunction                              |
//+------------------------------------------------------------------+
intOnCalculate(constintrates_total,
constintprev_calculated,
constdatetime&time[],
constdouble&open[],
constdouble&high[],
constdouble&low[],
constdouble&close[],
constlong&tick_volume[],
constlong&volume[],
constint&spread[])
  {
//---
int item=0;

while(item <rates_total)
   {

if((close[item+1]>open[item+1])&&
      (((close[item+1]+open[item+1])/2)>close[item]) &&
      (open[item]>close[item]) &&
      (open[item]>close[item+1])&&
      (close[item]>open[item+1]) &&
      (((open[item]-close[item])/(0.001+high[item]-low[item]))>0.6)
      )
      {

ExtmapBuffer[item]=high[item];
Alert("Valor=",time[item]);

      }
      item++;
   }

//--- returnvalueofprev_calculated for nextcall
return(rates_total);
  }
//+------------------------------------------------------------------+
