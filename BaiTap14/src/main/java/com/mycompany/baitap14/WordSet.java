/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class WordSet {
    Set<String> words = new HashSet<>();
    public WordSet(String line) {
        Scanner sc = new Scanner(line);
        while(sc.hasNext())
        {
            words.add(sc.next().toLowerCase());
        }
    }
    public WordSet union(WordSet other)
    {
        WordSet result = new WordSet(" ");
        result.words.addAll(this.words);
        result.words.addAll(other.words);
        return result;
    }
    public WordSet intersection(WordSet other){
        WordSet result = new WordSet(" ");
        result.words.addAll(this.words);
        result.words.retainAll(other.words);
        return result;
    }
    public String toString()
    {
        return String.join(" ", words);
    }
    
}
