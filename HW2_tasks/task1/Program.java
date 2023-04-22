
// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package HW2_tasks.task1;
import java.util.HashMap;
import java.util.Map;
public class Program {
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder request = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != "null")
            {
                request.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        request.delete(request.toString().length()-5,request.toString().length());
        return request.toString();
    }
	
    public static void main(String[] args)  {
        Map <String,String> param = new HashMap<String, String>();
        param.put("name","Ivanov");
        param.put("country","Russia");
        param.put("city","Moscow");
        param.put("age","null");
        System.out.println(getQuery(param));
        
    }
}
