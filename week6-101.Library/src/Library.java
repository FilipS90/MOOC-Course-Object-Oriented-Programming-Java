
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class Library {
    private ArrayList<Book> lista = new ArrayList<Book>();
    
    public Library(){
        
    }
    
    public void addBook(Book b){
        lista.add(b);
    }
    
    public void printBooks(){
        for(Book b:lista){
            System.out.println(b.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String t){
        ArrayList<Book> l = new ArrayList<Book>();
        for(Book b:lista){
            if(StringUtils.included(b.title(),t))
                l.add(b);
        }
        return l;
    }
    
    public ArrayList<Book> searchByPublisher(String t){
        ArrayList<Book> l = new ArrayList<Book>();
        
        for(Book b:lista){
            if(StringUtils.included(b.publisher(), t))
                l.add(b);
        }
        return l;
    }
    
    public ArrayList<Book> searchByYear(int t){
        ArrayList<Book> l = new ArrayList<Book>();
        for(Book b:lista){
            if(b.year()==t)
                l.add(b);
        }
        return l;
    }
}
