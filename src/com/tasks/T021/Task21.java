package com.tasks.T021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task21 {
    public static void main(String[] args) {
        Task21 task21 = new Task21();

        task21.createVocabulary("Странник «…Вновь я посетил…» «Я думал, сердце позабыло…» «О бедность! затвердил я наконец…» Мирская власть «Как с древа сорвался предатель ученик…» «Отцы пустынники и жены непорочны…» «Когда за городом, задумчив, я брожу…» «Я памятник себе воздвиг нерукотворный…» Разлука. В последний раз, в сени уединенья, Моим стихам внимает наш пенат.");
    }

    void createVocabulary(String txt){

        txt = txt.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < txt.length(); i++){
            char c = txt.charAt(i);
            if(c >= 'а' && c <= 'я'){
                map.compute(c, (ch, integer) -> integer == null ? 1 : integer + 1);
            }
        }

        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort((s1, s2) -> Character.compare(s1.getKey(), s2.getKey()));

        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println("Буква: " + entry.getKey() + " - встречается: " + entry.getValue() + " раз");
        }
    }
}
