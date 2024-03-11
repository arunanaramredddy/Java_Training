import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class OccurenceOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String res=findOccurence(s);
        System.out.println(res);
    }
    static String findOccurence(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(map.containsKey(ch)) {
               int c= map.get(ch);
               map.put(ch,c+1);
            }
            else {
                map.put(ch,1);
            }
        }
        Set<Entry<Character,Integer>>entries=map.entrySet();
        String t="";
        for(Entry<Character,Integer> e:entries) {
            t=t+e.getKey()+e.getValue()+" ";
        }
        return t;
    }
}
