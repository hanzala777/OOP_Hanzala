package com.OOP.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*Exceptions:
1)Checked
2)Unchecked (RunTime Exception)
3)Error
 */
/*
RUNTIME EXCEPTIONS:
> NullPointerException -> String is equals to NULL
> ArithmeticException  -> dividing by zero
> IllegalArgumentException -> Argument pass to a method not accepted
> IndexOutOfBoundException -> try to access an element in an array using invalid index
> IllegalStateException ->
*/
public class ExceptionsDemo {
    public static void show(){
        try {
            FileReader reader = new FileReader("file.txt");
            int value=reader.read();
            new SimpleDateFormat().parse("");
            System.out.println("File Opened");
        }
        catch(FileNotFoundException ex){
            System.out.println("File does not exist!");
            //OR
            System.out.println(ex.getMessage());
        }
        catch (IOException | ParseException ex){
            System.out.println("Couldn't read data.");
        }
    }
}
