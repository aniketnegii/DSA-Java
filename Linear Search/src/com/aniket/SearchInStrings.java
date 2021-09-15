package com.aniket;

public class SearchInStrings {
    public static void main(String[] args){

        String name = "Aniket Negi";
        if(searchString(name, 't')){
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }

    static boolean searchString(String s, char key){
        if(s == null) return false;

        for(char c : s.toCharArray()){
            if(c == key){
                return true;
            }
        }
        return false;
    }
}
