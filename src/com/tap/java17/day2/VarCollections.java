package com.tap.java17.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarCollections
{
    public static void main(String[] args)
    {

        //Normal Usage
        HashMap<String,Integer> map= new HashMap<>();
        map.put("John",25);
        map.put("Ram",22);
        for(Map.Entry<String ,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }


        // By Using VAR Keyword
        var map1=new HashMap<String,Integer>();
        map1.put("Panda",67);
        map1.put("roller",244);
        for(var name:map1.entrySet()){
            System.out.println(name.getKey()+" "+name.getValue());
        }


        //Normal Usage
        HashMap<String,Double> hashMap = new HashMap<>();
        hashMap.put("Hem",245.7);
        hashMap.put("Dev",422.8);

        for(Map.Entry<String ,Double> names: hashMap.entrySet()){

            System.out.println(names.getKey());
        }


        //By Using VAR Keyword

        var names = new HashMap<String,Double>();
        names.put("Ravi",233.3);
        names.put("Sony",445.7);

        for(var entry: names.entrySet()){
            System.out.println(entry.getKey());
        }


        //Normal Usage
        List<String> list= new ArrayList<>();
        list.add("Krishna");
        list.add("Rama");

        for(String s:list)
        {
            System.out.println(s);
        }

        //By Using VAR Keyword
        var gods=new ArrayList<String >();
        gods.add("Narayana");
        gods.add("Gopala");

        for(var s:gods){
            System.out.println(s);
        }

        // Use var in
        //     ✔ Service methods
        //     ✔ Repository calls
        //     ✔ Streams
        //     ✔ Loops

        //        Avoid in:
        //    ❌ Public APIs
        //    ❌ DTOs
        //    ❌ Method parameters

    }
}
