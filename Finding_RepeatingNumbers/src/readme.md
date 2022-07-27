# Uygulama

<hr>

- Şimdi sıra sende!

- Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program 
- yazarak GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.

## Example 1 (Extra Zone)

```
import java.util.*;  
public class CollectionsFrequencyExample1 {  
    public static void main(String[] args) {  
        //Create a list object         
        List<String> arrlist = new ArrayList<String>();  
        //Add elements in the list  
        arrlist.add("Java");  
        arrlist.add("COBOL");  
          arrlist.add("Java");  
          arrlist.add("C++");  
        arrlist.add("Java");  
        System.out.println("List of elements: "+arrlist);  
        //Count the frequency of the given word      
        System.out.println("Frequency of the Word: "+Collections.frequency(arrlist,"Java"));  
        }       
}  

```

<br>

### Linkler (For Recommended Links)
> <a href="https://app.patika.dev/emrevaljean" target="_blank">Patika Profilim </a>
>
> <a href="https://www.javatpoint.com/java-collections-frequency-method#:~:text=The%20frequency()%20method%20of,equal%20to%20the%20specified%20object." target="_blank">Java T Point </a>

<hr>

<br>

## Example 2 (Extra Zone)
```
import java.util.*;  
public class CollectionsFrequencyExample2 {  
    public static void main(String[] args) {  
    
        //Create a list object         
        List<Integer> list = new ArrayList<>();  
        list.add(1);  
        list.add(2);  
        list.add(1);  
        list.add(3);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
             
        System.out.println("List of elements: "+list);  
        System.out.println("\nCount all with frequency:");  
        
        Set<Integer> uniqueSet = new HashSet<Integer>(list);  
        
        for (Integer i : uniqueSet) {  
        System.out.println(i + ": " + Collections.frequency(list, i));  
        }  
    }       
}
```
## Example 3 (Extra Zone) 

```
import java.util.*;  
public class CollectionsFrequencyExample3 {  
    public static void main(String[] args) {  
    
        // Let us create an array of integers  
        Integer arr[] = {20, 10, 20, 30, 20, 40, 20};          
        int freq = Collections.frequency(Arrays.asList(arr), 20);  
        System.out.println("Frequency of 20 is: "+freq);          
}
```
