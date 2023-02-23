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
        Account account=new Account();
        account.deposit(-1);
    }
}
