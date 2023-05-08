import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer,String>table1=new Hashtable<>();
        MyHashTable table=new MyHashTable(10);
        table.insert("Sayat","Qusain");
        table.insert("Aidos","Tinishtybai");
        table.insert("Ermek","Tnaliev");
        table.delete("Sayat");
        System.out.println(table.get("Sayat"));
    }
}