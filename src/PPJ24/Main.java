package PPJ24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //FUNKCJA DO ZADANIA 1
    public static String func(String str){
        if(str.isEmpty()) return null;
        char[] arr=str.toCharArray();
        if(str.length()%2!=0){
            for (int i = 0; i <arr.length/2 ; i++) {
                char t=arr[i];
                arr[i]=arr[i + ((arr.length/2)+1)];
                arr[i + ((arr.length/2)+1)]=t;
            }
        }
        else{
            for (int i = 0; i <arr.length/2 ; i++) {
                char t=arr[i];
                arr[i]=arr[i + ((arr.length/2))];
                arr[i + ((arr.length/2))]=t;
            }
            }
    return new String(arr);
    }
    //FUNKCJA DO ZADANIA 2
    public static String norm(String name){
        char[] arr=name.toCharArray();
        arr[0]=Character.toUpperCase(arr[0]);
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=Character.toLowerCase(arr[i]);
        }
    return new String(arr);}
    //FUNKCJA DO ZADANIA 2
 public static String init(String name){
        String [] arr=name.split(" ");
        StringBuilder initials= new StringBuilder(new String());
     for (int i = 0; i <arr.length-1 ; i++)
         initials.append(Character.toUpperCase(arr[i].charAt(0))).append(".");
     char name1[]=arr[arr.length-1].toCharArray();
     name1[0]=Character.toUpperCase(name1[0]);
     for (int i = 1; i < name1.length ; i++) {
         name1[i]=Character.toLowerCase(name1[i]);
     }
     return initials + new String(name1);
 }
    //FUNKCJA DO ZADANIA 2

 public static String tr(String s, String from, String to){
     char[] sArr=s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j <from.length() ; j++) {
                if(sArr[i]==from.charAt(j)){
                    sArr[i]=to.charAt(j);
                    break;
                }
            }
     }
return new String(sArr);
 }
 //FUNKCJA DO ZADANIA 3
    static void checkISBN(String isbn) {
       Pattern numbersPattern=Pattern.compile("[0-9]");
       Pattern literaPattern=Pattern.compile("[a-z]");
       Pattern xPattern=Pattern.compile("[A-Z]");
       int counter=10;
       int sum=0;
       for (int i = 0; i <isbn.length()-1 ; i++) {
            Matcher nMatcher=numbersPattern.matcher(String.valueOf(isbn.charAt(i)));
            Matcher litera=literaPattern.matcher(String.valueOf(isbn.charAt(i)));
            if(litera.matches()){
                System.out.println(isbn + " ERROR. Invalid character " + isbn.charAt(i));
                return;
            }
            if(nMatcher.matches()){
                sum+=Character.getNumericValue(isbn.charAt(i)) * counter;
                counter--;
            }
       }
       if(counter>1){
           System.out.println(isbn + " ERROR.Too few digits");
       return;
       }
       if(counter<1){
           System.out.println(isbn + " ERROR.Too many digits");
           return;
       }
       Matcher last=xPattern.matcher(String.valueOf(isbn.charAt(isbn.length()-1)));
       if(!last.matches()) {
           sum += Character.getNumericValue( isbn.charAt(isbn.length() - 1));
       if(sum%11==0) {
           System.out.println(isbn + " OK ");
       }else{
           sum-= Character.getNumericValue( isbn.charAt(isbn.length() - 1));
           for (int i = 1; i <10 ; i++) {
               if((sum+i)%11==0){
                   System.out.println(isbn +" ERROR. Check digit should be " + i);
               return;
               }
           }
           System.out.println(isbn +" ERROR. Check digit should be " + "X");
       }
       }else{
           for (int i = 0; i <=10 ; i++) {
               if((sum+i)%11==0){
                   System.out.println(isbn +" ERROR. Check digit should be " + i);
                   return;
               }
           }
           System.out.println(isbn +" ERROR. Check digit should be " + "X");

       }

    }


    public static void main(String[] args) {
        //Zad 2
       /* System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("Mississippi",
                "abcdefghijklmnopqrstuvwyz",
                "BCDEFGHIJKLMNOPQRSTUVWYZA"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));*/
        //Zad 3
        String[] isbns = {
                "960-425-059-0", "80-902744-1-6", "85-359-0277-5",
                "0-8044-2958-X", "0-943396-04-2", "0-9752298-0-5",
                "9971-5-02l0-0", "93-8654--21-4", "99921-588-107",
        };
        for (int i = 0; i < isbns.length; ++i)
            checkISBN(isbns[i]);
    }

}
