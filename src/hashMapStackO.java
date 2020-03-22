import java.util.*;

public class hashMapStackO {

    public static void main(String[] args) {

        HashMap <Integer,String> hmap = new HashMap<Integer,String>();

        System.out.println("enter some values");

        Scanner in = new Scanner(System.in);

        for(int i=0;i<3;i++){

            Integer a=in.nextInt();
            String b=in.next();

            hmap.put(a,b);
            //         System.out.println(hmap.get(b)+" "+hmap.get(a));
        }

        for(Map.Entry m:hmap.entrySet()) {


            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}