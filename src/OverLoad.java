public class OverLoad {

 

    void createContact(String n,long ph)
    {
        System.out.println("Name :"+n + " "+"Phone : "+ph);
    }
    
    void createContact(String n,long ph1,long ph2)
    {
     System.out.println("Name :"+n + " "+"Phone : "+ph1+","+ph2);
    }
    public static void main(String[] args) {
        
        OverLoad p1=new  OverLoad();
        p1.createContact("Raj", 7869878711L);
        p1.createContact("Mike", 5454677,868899);
    }

 

}