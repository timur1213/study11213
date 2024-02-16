
import java.util.HashMap;
import java.util.Map;
public class cats
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new java.lang.String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        String[] color = new java.lang.String[]{"белый", "черный","пятнистый","красный","синый","пепельный","коричневый","голубой","рыжий","полосатый"};
        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats)
    {
        Map<String, Cat> addCats = new HashMap<String, Cat>();
        for(String s: cats){
            addCats.put(s, new Cat(s));
        }
        return addCats;
    }

    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }
        String color;
        public void Color(String color)
        {
            this.color = color;
        }
    }
}
