import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static List<String> run() throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        try {
            FileInputStream fstream = new FileInputStream("input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                list.add(strLine);
                System.out.println(strLine);
            }
            //br.close();
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        return list;
    }

    public static List<InputData> Scan(List<String> input){
        int VlanNumber;
        String Ip;
        String portNumberTaggged;
        String portNumberUnTaggged;
        String str;
        String[] spl = new String[4];
        List<InputData> data = new ArrayList<InputData>();
        for (int i = 0; i < input.size(); i++) {
          str  =  input.get(i);
          spl = str.split("\\S");
          VlanNumber =  Integer.parseInt(spl[0]);
          Ip = spl[1];
          portNumberTaggged = spl[2];
          portNumberUnTaggged = spl[3];
          data.add(new InputData(VlanNumber,Ip,portNumberTaggged,portNumberUnTaggged));
        }

       return  data;
    }
}