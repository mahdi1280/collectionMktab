import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Question2 {

    public static void main(String[] args) {
        Random random=new Random(1);
        Set<Character> var1=createRandom(random);
        random=new Random(2);
        Set<Character> var2=createRandom(random);
        System.out.println(var2);
        System.out.println(var1);
        System.out.println("Community: "+ getCommunity(var1,var2));
        System.out.println("Subscription: "+getSubscription(var1,var2));

    }

    private static TreeSet<Character> getSubscription(Set<Character> var1, Set<Character> var2) {
        TreeSet<Character> treeSet=new TreeSet<>();
        boolean flag=false;
        for(Character c:var1){
            for(Character c1:var2){
                if(c.equals(c1)){
                    flag=true;
                    break;
                }
            }
            if(!flag)
              treeSet.add(c);
            flag=false;
        }
        return treeSet;
    }


    private static TreeSet<Character> getCommunity(Set<Character> var1, Set<Character> var2) {
        TreeSet<Character> treeSet=new TreeSet<>();
        for(Character c:var1){
            for(Character c1:var2){
                if(c.equals(c1)){
                    treeSet.add(c);
                    break;
                }
            }
        }
        return treeSet;
    }

    private static TreeSet<Character> createRandom(Random random) {
        TreeSet<Character> var1=new TreeSet<>();
        while (var1.size()<10){
            var1.add((char)(random.nextInt(25)+97));
        }
        return var1;
    }
}
