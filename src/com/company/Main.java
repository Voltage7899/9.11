package com.company;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        new Main().getKey();
    }
    public void getKey()
    {
        Scanner scanner=new Scanner(System.in);
        try {
            String key = scanner.nextLine();
            Message(key);
        }catch (Exception e)
        {
            System.out.println("error");
        }
        finally {
            getKey();
        }
    }
    private String getDetails(String key) throws Exception
    {

            if (key.equals("")) {
                throw new Exception("Key isnt found");
            }

        return "key is "+key;



    }
    public void Message(String key) throws Exception
    {
String message=getDetails(key);
        System.out.println(message);



    }







    }











