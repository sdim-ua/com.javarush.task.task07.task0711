import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить

1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    
    

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
         
         for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            strings.add(s); 
             
            }
       

        int count = 13;
        
      while(count > 0) { 
        strings.add(0, strings.get(4));  
                strings.remove(strings.size()-1);   
         
            count--;
            
            }
    for (int k = 0; k < strings.size();k++ ) {
             
    System.out.println(strings.get(k));
        
                    }   
            
            
        }
        
       
}
