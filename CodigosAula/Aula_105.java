package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Program{
public static void main(String[] args) {
  List<String> list= newArrayList<>();
    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(2, "Marco");
    System.out.println(list.size());
  for(Stringx: list) {
    System.out.println(x);
  }
System.out.println("---------------------");
list.removeIf(x-> x.charAt(0) == 'M');
for(Stringx: list) {
  System.out.println(x);
}
System.out.println("---------------------");
System.out.println("Index ofBob: "+ list.indexOf("Bob"));
System.out.println("Index ofMarco: "+ list.indexOf("Marco"));
System.out.println("---------------------");
List<String> result= list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
for(Stringx: result) {
  System.out.println(x);
}
System.out.println("---------------------");
Stringname= list.stream().filter(x-> x.charAt(0) == 'J').findFirst().orElse(null);
System.out.println(name);
}
}
