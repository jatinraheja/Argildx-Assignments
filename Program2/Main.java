import java.util.*;
class Main
{
public static void main(String args[])
{
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   //List<Integer> al = new ArrayList<>();
   HashMap<Integer,Integer> map = new HashMap<>();
   ArrayList<Integer> al = new ArrayList<>();
   ArrayList<Integer> ans = new ArrayList<>();
   for(int i=0;i<n;i++)
   {
      int num = sc.nextInt();
      al.add(num);
   }
   
   for(int i=0;i<n;i++)
   {
       if(map.containsKey(al.get(i)))
       {
           int num = map.get(al.get(i));
           num+=1;
           map.put(al.get(i),num);
       }
        else
            map.put(al.get(i),1);  
        
          
   }    
   for(int i=0;i<n;i++)
    {
       if(map.get(al.get(i))>=3)
       {
          continue;
       } 
       ans.add(al.get(i));
   
    }
  System.out.println(ans);
}
  
}