/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kurnia131023;

/**
 *
 * @author H P
 */
public class Enkrip1 {
    public static void main(String[] args){
        String text = "Selamat Datang";
        String temp ="";
        int tambah = 2;
        for(int i=0;1<text.length();i++){
            int h = (int) (text.charAt(i));
            char t =(char) (h+tambah);
            temp += t;
        }
        System.out.println(temp);
    }
}
