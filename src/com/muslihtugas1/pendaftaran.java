package com.muslihtugas1;

import java.io.IOException;
import java.util.Scanner;


public class pendaftaran {
    public static String bacaString(){
        int karakter;
        String string = "";
        boolean done = false;
        while(!done){
            try {
                karakter = System.in.read();
                if(karakter<0 ||(char)karakter == '\n')
                    done = true;
                else
                if(karakter != '\r')
                    string = string+(char)karakter; //mengeksekusi hasil char
            }catch(IOException ioe){ //eksekusi jika ada kesalahan
                System.err.println("Ada Kesalahan Input Data!"); //menampilkan output kesalahan
                done = true;
            }
        } return string; //keluar dari fungsi string
    }
}
