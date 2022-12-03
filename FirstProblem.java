import java.util.*;

public class FirstProblem {
    public void san(){
        List<String> places = Arrays.asList("Doszhan Anuar", "Musin Adil", "Magayenov Arsen", "Shendibai Az-meir", "Tagaibek Sayat","Hamitov Tamerlan", "Tileyali Ramazan", "Erezhepov Nurbolat","Tanatar Binazar","Ashirhan Daulet","Bortanov Shakirim", "Palatov Bagdaulet", "Kyrbanaliev Adilkhan","Savetov Almas", "Seit Akku", "Sadenova Tabigat", "Daulethanova Janel", "Toleybekkizi Aina", "Yesirkep Uldana", "Kusain Alibek");
        Random r = new Random();

        Map<Integer, Integer> dict =  new HashMap<>();
        for (int i = 0; i < places.size(); i++){
            int t = r.nextInt(0,90) + 1;
            int b = r.nextInt(0,90) + 1;
            System.out.println(places.get(i) +" "+ t + "*" + b);
            if(!dict.containsKey(t)){
                dict.put(t, b);
            }else if(!dict.containsKey(b)){
                dict.put(b, t);
            }
            try{
                if(dict.containsKey(t)){
                    if(dict.containsKey(b)){
                        throw new Exception("Is not correct " +t+"*"+b+"is repeted");
                    }
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}















