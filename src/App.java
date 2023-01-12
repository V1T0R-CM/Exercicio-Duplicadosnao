import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr1= new ArrayList<String>();
        ArrayList<String> arr2= new ArrayList<String>();
        arr1.add("Morango");
        arr1.add("Uva");
        arr1.add("Acerola");
        arr1.add("Kiwi");

        arr2.add("Pêra");
        arr2.add("Caju");
        arr2.add("Morango");
        arr2.add("Kiwi");
        for(int i = 0; i<arr1.size(); i++){
            if(arr2.contains(arr1.get(i))){
                System.out.println(arr1.get(i));
            }
    }
}
}