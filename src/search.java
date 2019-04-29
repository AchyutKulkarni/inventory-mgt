
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achuu
 */
public class search {
    public static boolean search(String k){
        boolean found=false;
    String mn="";
    String nam="";
    String t="";
    String m="";
    String a="";
    String d="";
    String av="";
    String pr="";
    Scanner x;
    try{
        String filePath = "C:\\Users\\achuu\\Documents\\NetBeansProjects\\inventory\\inventory.txt";
        x=new Scanner(new File(filePath));
        x.useDelimiter("[;\n]");
        while(x.hasNext()&&!found){
            mn=x.next();
            nam=x.next();
            t=x.next();
            m=x.next();
            d=x.next();
            a=x.next();
            av=x.next();
            pr=x.next();
            if(k.equals(nam))
                found=true;
        }
        
    
    }   
    catch (Exception ex) {
            System.err.println("Error: " + ex);
        }
    if(found)
            return true;
    else
            return false;    
    
    }
    public static boolean searchcust(String k){
        boolean found=false;
    String id="";
    String name="";
    String e="";
    String ad="";
    String no="";
    Scanner x1;
    try{
        String filePath = "C:\\Users\\achuu\\Documents\\NetBeansProjects\\inventory\\customer.txt";
        x1=new Scanner(new File(filePath));
        x1.useDelimiter("[;\n]");
        while(x1.hasNext()&&!found){
            id=x1.next();
            name=x1.next();
            e=x1.next();
            ad=x1.next();
            no=x1.next();
            if(k.equals(name))
                found=true;
        }
        
    
    }   
    catch (Exception ex) {
            System.err.println("Error: " + ex);
        }
    if(found)
            return true;
    else
            return false;    
    
    }
}
