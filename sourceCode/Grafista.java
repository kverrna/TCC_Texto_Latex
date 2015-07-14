package Agents;

importjava.util.ArrayList;

importjavax.swing.JOptionPane;

importpatternsCandleStick.BearishEngulfing;
importpatternsCandleStick.Pattern;
importcandlesticks.CandleStick;
importcandlesticks.LoadCandleStickForCSVFile;
importjade.core.Agent;
importjade.core.behaviours.Behaviour;
importjade.core.behaviours.OneShotBehaviour;

public class Grafista extends Agent {

	protected void setup()
	{
	System.out.println("Olaheusou um agentegrafista"
		+ "experimental....\n");
	System.out.println("Iniciandobusca.....\n"
				+ "-----------------\n");
	addBehaviour(newFindPatterns(this,
		"C:/ATIVOS/MRVE3SA.csv"));
	}

	public class FindPatterns extends OneShotBehaviour
	{

		String path;
		publicFindPatterns(Agent a,String path)
		{
			super(a);
			this.path=path;
		}
		@Override
		publicvoid action() {

			 Pattern testPattern;
		        String result = "";
		ArrayList<CandleStick> list 
		= newArrayList<CandleStick>();
		ArrayList<CandleStick>listResult 
		= newArrayList<CandleStick>();
		LoadCandleStickForCSVFile test
		 = newLoadCandleStickForCSVFile(path);

		test.loadCandleStrick(list);

		testPattern = newBearishEngulfing(list);
		listResult = testPattern.findCandleSticksPatterns();

		JOptionPane.showMessageDialog(null, 
			"ListREsult:" + listResult.size());
		JOptionPane.showMessageDialog(null, 
			"List:" + list.size());
		if(listResult.size()>0) 
	System.out.println("Encontrei o padraonasseguintesdadas:...");
		else
	System.out.println("Para  ativonaoencontrei o padrao buscado");
		for (inti = 0; i<listResult.size(); i++)
		        {
		result += listResult.get(i).getDate() + "\n";
		        }
		System.out.println(result);
		}
	}
}
