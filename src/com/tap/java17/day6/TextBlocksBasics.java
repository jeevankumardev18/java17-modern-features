package com.tap.java17.day6;


public class TextBlocksBasics {
    public static void main(String[] args) {
        //Normal Usage
        String json = "{\n" +
                "  \"name\": \"John\",\n" +
                "  \"age\": 25\n" +
                "}";
        System.out.println(json);


        //Java17 Usage
        var json1 = """
                {
                  "name" : "Monika",
                  "age"   : 25
                }
                
                """;
        System.out.println(json1);



        var message = """
        {
            Welcome to Java 17
            This is a multiline string
        }
        """;
        System.out.println(message);
        
        

    }
}

//3-line explanation
//Text blocks = multiline strings using """
//Removes messy \n and + concatenation
//Makes SQL/JSON/XML clean and readable
//“They eliminate escape characters(\n) and concatenation(+).”