package com.tap.java17.day6;

public class TextBlocksSQLStyle
{
    public static void main(String[] args) {
        var query = """
                SELECT id, name, email
                FROM users
                WHERE status = 'ACTIVE'
                ORDER BY name;
                """;

        System.out.println(query);
    }
}
