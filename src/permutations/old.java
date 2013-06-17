package permutations;
// все комибинации с без возвращения и c учетом порядка
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class old<T> {
    boolean exchangeChecker = false;
    Collection<T> start = new ArrayList<T>();
    public Collection<List<T>> permute(Collection<T> input) {
        start=input;
        Collection<List<T>> output = new ArrayList<List<T>>();
        if (input.isEmpty()) {
            output.add(new ArrayList<T>());
            exchangeChecker=true;
            return output;
        }
        List<T> list = new ArrayList<T>(input);
        T head = list.get(0);
        List<T> rest = list.subList(1, list.size());
        Collection<List<T>> ss = new ArrayList<List<T>>();
        ss = permute(rest);
        if (exchangeChecker) {
         List<List<T>> subs = new ArrayList<List<T>>();
         List<T> subt = new ArrayList<T>();
         Collection<List<T>> out = new ArrayList<List<T>>();
         subt.addAll(start);
         subs.add(subt);
         out.addAll(subs);
         // eopack
            List<List<T>> some = new ArrayList<List<T>>();
            
           some.addAll(ss);
            List<List<T>> xxx = new ArrayList<List<T>>();
            int i = 0;
                for ( List<T> p: out) {
                    exchangeChecker=false;
                     List<T> subList = new ArrayList<T>();
                    subList.addAll(p);
                    subList.add(i, head);
                    xxx.add(subList);
                    i++;
                     System.out.println("yest");
                } output.addAll(xxx);return output;
                 
               
        }
            for (List<T> permutations : ss) {
            
                List<List<T>> subLists = new ArrayList<List<T>>();
                for (int i = 0; i <= permutations.size(); i++) {
                    List<T> subList = new ArrayList<T>();
                    subList.addAll(permutations);
                    subList.add(i, head);
                    subLists.add(subList);
                }
                output.addAll(subLists);
                 System.out.print(output + ";");
            }
           
        return output;
    }
    
    
     public static void main(String args[]) {
        old<Integer> obj = new old<Integer>();
        Collection<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);
        ///////////////

        Collection<List<Integer>> start = new ArrayList<List<Integer>>();
         
        Collection<List<Integer>> output = obj.permute(input);
        int k = 0;
        List<List<Integer>> pnr = null;
        for (int i = 0; i <= input.size(); i++) {
            pnr = new ArrayList<List<Integer>>();
            for(List<Integer> integers : output){
            pnr.add(integers.subList(i, integers.size()));
            }
            k = input.size()- i;
            System.out.println("P("+input.size()+","+k+") :"+ 
            "Count ("+pnr.size()+") :- "+pnr);
        }
    }
}
