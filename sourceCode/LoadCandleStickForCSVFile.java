packagecandlesticks;

importhandles.CSV_handle;

importjava.util.ArrayList;


publicclassLoadCandleStickForCSVFile
{
privateStringCsv_file_path;
privateCSV_handlecsv_handle;

publicLoadCandleStickForCSVFile(StringCsv_file_path)
    {
this.Csv_file_path = Csv_file_path;
csv_handle = new CSV_handle();
    }

publicArrayList<CandleStick>
loadCandleStrick(ArrayList<CandleStick>list)
    {
csv_handle.readCsvFile(Csv_file_path, list);
returnlist;
    }
}
