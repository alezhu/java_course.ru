/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.java_course.ru;

import java.text.Collator;
import java.util.Locale;

/**
 *
 * @author azhuravlev
 */
public class TestCollator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collator c = Collator.getInstance(new Locale("ru"));
    // Если закомментировать следующую строку, то "ПАВЕЛ" будет не равен "Павел" 
        // (c.compare!=0) что по идее не совсем корректно
        c.setStrength(Collator.PRIMARY);
        System.out.println(c.compare("ПАВЕЛ", "ПАВЕЛ"));
        System.out.println(c.compare("ПАВЕЛ", "Павел"));
        System.out.println(c.compare("ПАВЕЛ", "артем"));
        System.out.println("ПАВЕЛ".compareTo("артем"));
    }

}
