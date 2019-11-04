package com.company;

public class HackerEarth {

    public static void languages(){
        System.out.print("langauges ");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try{
            System.out.print("programming ");
            languages();
        }catch (Exception e){

            System.out.print("java ");
        }finally{
            System.out.print("scala ");
        }
        System.out.println("python ");
    }
}
