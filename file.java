import java.util.*;
import java.io.*;

public class file {
    public static void main(String[] args) thorws Exception{
        Scanner sc = new Scanner(System.in);
        FileReader fs = new FileReader("info.txt");
        BufferedReader br = new BufferedReader(fs);
        String line;
        List<Data> al = new ArrayList<Data>();
        while((line=br.nextLine())!=null){
            String[] arr = line.split(" ");
            Data d = new Data();
            d.set(arr[0], arr[1], arr[2]);
            al.add(d);
        }
        for(int i=0;i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                if(al.get(i).ip).equals(al.get(j).ip){
                    al.remove(j);
                }
                else if(Math.abs(Long.parseLong(al.get(i).ts)-Long.parseLong(al.get(j).ts)) > 2000){
                    al.remove(j);
                }
            }
        }
        Map<String,Integer> mp = new LinkedHashMap<String,Integer>();
        for(int i=0;i<al.size();i++){
            String lang = al.get(i).lang;
            if(mp.contains(lang)){
                mp.put(lang,mp.get(lang)+1);
            }
            else{
                mp.put(lang,1);
            }
        }
        for(String key:mp.ketSet()){
            System.out.println(key+" "+mp.get(key));
        }
        br.close();
        sc.close();
    }
}

class Data{
    String lang,ip,ts;
    void set(String l,String i,String ts){
        this.lang = l;
        this.ip = i;
        this.ts = ts;
    }
}
