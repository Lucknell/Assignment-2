/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucknell
 */
public class Reverser extends Transpose
{
public Reverser(String s)
{
    super(s);
}
public String reverseText(String word)
{ 
   StringBuffer result = new StringBuffer(word);
    result.reverse();
    String reverse2 = result.toString();
    //System.out.println(reverse2); 
    
    StringBuffer result2 = new StringBuffer(reverse2);
    result2.reverse();
   // System.out.println(result2.toString()); 
    return reverse2;
}
public String decode(String word)
{
   StringBuffer result = new StringBuffer(word);
    result.reverse();
    String reverse2 = result.toString();
    //System.out.println(reverse2); 
    
    StringBuffer result2 = new StringBuffer(reverse2);
    result2.reverse();
   // System.out.println(result2.toString()); 
        
    StringBuffer result3 = new StringBuffer(word);
    result3.reverse();
    return result3.toString();
    
   
}
}
