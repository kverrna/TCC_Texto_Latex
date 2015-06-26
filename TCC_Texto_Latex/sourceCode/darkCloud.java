packagepatternsCandleStick;

importjava.util.ArrayList;

importcandlesticks.CandleStick;

publicclassDarkCloudextends Pattern
{
ArrayList<CandleStick>list;

publicDarkCloud(ArrayList<CandleStick> list)
    {
this.list = list;
    }

publicArrayList<CandleStick>findCandleSticksPatterns()
    {
ArrayList<CandleStick>listResult = newArrayList<CandleStick>();

for (inti = 0; i<list.size(); i++)
        {
if ((i + 1) <list.size())
            {
if ((list.get(i + 1).getClose() >list.get(i + 1).getOpen()) &&
                        (((list.get(i + 1).getClose() + list.get(i + 1).getOpen()) / 2) >list.get(i).getClose()) &&
                        (list.get(i).getOpen() >list.get(i).getClose()) &&
                        (list.get(i).getOpen() >list.get(i + 1).getClose()) &&
                        (list.get(i).getClose() >list.get(i + 1).getOpen()) &&
                        (((list.get(i).getOpen() - list.get(i).getClose()) / (0.001 + list.get(i).getHigh() - list.get(i)
.getLow()))
> 0.6))

                {
listResult.add(list.get(i));
                }

            }

        }

returnlistResult;
    }

}
