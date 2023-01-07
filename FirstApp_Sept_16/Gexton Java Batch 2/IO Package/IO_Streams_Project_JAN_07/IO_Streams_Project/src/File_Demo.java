/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class File_Demo {
    public static void main(String[] args) {
        File file = new File("d:\\abc.txt");
        Scanner input = new Scanner(System.in);
        String text = "";
        try
        {
        if(!file.exists())
            if(file.createNewFile())
            {
                System.out.print("Enter Text You want to Add in the above created file :  ");
                text = input.nextLine();
                FileOutputStream fos = new FileOutputStream(file);
                byte[] txt = text.getBytes();
               // for(int i=0; i<txt.length; i++)
                    fos.write(txt);
                
            }
        }
        catch(FileNotFoundException ex)
        {
        }
        catch(IOException ex)
        {
            
        }
        
    }
}
