/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.ArrayList;
/**
 *
 * @author patta
 */
public class collection1 {
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    
    public boolean isEmpty(){
        boolean value = false;
        value = arr.isEmpty();
        return value;
    }

    public void makeEmpty(){
        for(int i = 0;i < arr.size();i++){
            arr.remove(i);
        }
    }
    public void remove1(int i){
        arr.remove(i);
    }
    public void removeValue(int num){
        for(int i = 0;i < arr.size();i++){
            if(arr.get(i) == num){
                arr.remove(i);
            }
        }
    }
    public void insert1(int key,int value){
        arr.set(key,value);
    }
    
    public void isPresent(){
        for(int j = 0;j < arr.size();j++){
            System.out.println(arr.get(j));
        }
    }
    public Boolean isPresent(int x){
        boolean key = false;
        for(int j = 0;j < arr.size();j++){
            if(x == arr.get(j)){
                key = true;
            }
        }
        return key;
    }
}




