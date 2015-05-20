package candlesticks;
publicclassCandleStick {

privatedoubleopen, high, low, close, volume;
private String date;

publicCandleStick(double open, double high, double low, double close, double volume
, String date)
{
this.open = open;
this.high = high;
this.low = low;
this.close = close;
this.volume = volume;
this.date = date;
}

publicCandleStick(String open, String high, String low, String close, String volume
, String date)
{
this.date = date;
this.open = Double.parseDouble(open);
this.high = Double.parseDouble(high);
this.low = Double.parseDouble(low);
this.close = Double.parseDouble(close);
this.volume = Double.parseDouble(volume);
}

publicdoublegetOpen()
{
returnopen;
}

publicdoublegetHigh()
{
returnhigh;
}

publicdoublegetLow()
{
returnlow;
}

publicdoublegetClose()
{
returnclose;
}

publicdoublegetVolume()
{
returnvolume;
}

public String getDate()
{
returndate;
}

public String getInformation()
{
return"Date:" + this.date +
" Open:" + this.open +
" High:" + this.high +
" Low:" + this.low +
" Close:" + this.close +
" Volume:" + this.volume;
}
}
