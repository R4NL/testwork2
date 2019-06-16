package Thealeshka.counter;

import Thealeshka.in.dataIn.GetData;

import java.util.ArrayList;
import java.util.List;

public class Count {
    private GetData getData;

    public Count(GetData getData) {
        this.getData = getData;
    }

    public Count() {
    }

    public static Count get(GetData getData) {
        return new Count(getData);
    }

    public long count(String target) {
        long res = 0;
        List<String> list=removeExcess(getData.getData());
        for (String value :list ) {
            if (value.equalsIgnoreCase(target)) {
                res++;
            }
        }
        return res;
    }

    private List<String> removeExcess(List<String> list) {
        List<String> resultList = new ArrayList<>();
        String punctuationMarks = ",./?!@#$^&*()_+-='}{[];:";
        for (String value : list) {
            String a=value;
            for (int i = 0; i < punctuationMarks.length(); i++) {
                while (a.contains(punctuationMarks.charAt(i)+"")){
                    a=deleteChar(a,punctuationMarks.charAt(i));
                }
            }
            resultList.add(a);
        }
        return resultList;
    }

    private String deleteChar(String str,char target){
        return str.substring(0,str.indexOf(target))+str.substring(str.indexOf(target)+1);
    }
}
