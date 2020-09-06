
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String result = "The collection " + name + " ";
        if(elements.isEmpty()){
            return result + "is empty.";
        }
        
        String s = "has " + elements.size() + " element" +(elements.size() > 1 ? "s:" : ":");

        for (String element: elements) {
            s = s + "\n" +element;
            
        }
        
        return result + s;
    }
    
    
    
}
