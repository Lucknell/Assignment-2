/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucknell
 */
public class Caeser extends Cipher
{
public Caeser(String s)
{
super(s);
}
public String encode(String word)
{
	        StringBuffer r = new StringBuffer();
	        for (int i = 0; i < word.length(); i++) {
	          char c = word.charAt(i);                 
	          c = (char)('a' + (c -'a'+ 3) % 26);     
	          r.append(c);                        
	        }
	        return r.toString();
}
public String decode(String word)
{            
         StringBuffer t = new StringBuffer();
	         for (int i = 0; i < word.length(); i++) {
	           char c = word.charAt(i);
	           c = (char)('a' + (c - 'a' + 23) % 26);
	           t.append(c);
                 }
                
                return t.toString();
  
}
String code (String word, int SHIFT)
{
StringBuffer result = new StringBuffer();
for (int i = 0; i < word.length(); i++)
{
char ch = word.charAt(i);
ch = determineCharacter(ch, SHIFT);
result.append(ch);
}
return result.toString();
}
public char determineCharacter(char ch, final int shift)
{
if(Character.isUpperCase(ch))
ch = (char)('A' + (ch
-
'A' + shift) % 26);
// Complete the if/else so that lower case letters are accounted for
return ch;
}
}
