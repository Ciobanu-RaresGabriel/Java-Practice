package Collections;

import java.util.ArrayList;

//create an array list, add some colors (strings) and print out the collection.
//iterate through all elements in an array list: -> colorsPrint() method
//insert an element into the array list at the first position: ->  colorInsert method
//retrieve an element (at a specified index) from a given array list: -> GetColor method


public class collectionsHomework {

    static ArrayList<String> colorsArray = new ArrayList<>();

    public static void main(String[] args) {



        colorsArray.add("rosu");
        colorAdd("verde");
        colorAdd("galben","albastru","alb","mov","gri");

        System.out.println(colorsArray);

        colorsPrint();

        colorInsert(colorsArray,"roz",0);
        System.out.println("Dupa utilizarea metodei colorInsert, avand ca parametri ( colorsArray,roz,0), ArrayList-ul colorsArray va contine urmatoarele elemente:");
        colorsPrint();

        getColor(colorsArray,0);
        getColor(colorsArray,27);

    }
    public static void colorAdd(String...colors){
        for(String color:colors) {
            colorsArray.add(color);
        }
    }
    public static void colorsPrint(){
        for(String color:colorsArray)
            System.out.println(color);
    }
    public static void colorInsert(ArrayList<String> colors, String newColor, int position){
colors.add(position,newColor);
    }
    public static void getColor(ArrayList<String> colors,int position) {
        if(position>=0&&position<colors.size())
        System.out.println("Elementul ce are ca index valoarea "+position+" este "+colors.get(position));
        else System.out.println("Index-ul "+position+" este incorect.");

    }
}
