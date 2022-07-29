import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {
public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Yogesh");
	list.add("Kamlesh");
	list.add("Rohan");
	list.add("Tushar");
	list.add("Tejas");
	list.add("Tanuja");
	
	List<String> newList = list.stream().filter(x->x.startsWith("T")).collect(Collectors.toList());
	
	System.out.println(newList);
	
}
}
