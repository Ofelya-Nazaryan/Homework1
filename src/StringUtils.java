public class StringUtils {

    //Վերադարձնում ենք տրված տեքստի մեջ տրված սինվոլի քանակը․
    public static int getCountBySymbol(String text, char symbol) {
        int getCountBySymbol=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==symbol) {
                getCountBySymbol++;
            }
        }
        return getCountBySymbol;
    }

    //Վերադարձնում ենք տրված տեքստի մեջ տրված սինվոլների ընդհանուր քանակը․
    public static int getCountBySymbol(String text, char[] symbols) {
        int getCountBySymbol=0;
        for (int i = 0; i < text.length(); i++) {

            for (int j = 0; j < symbols.length; j++) {
                if (text.charAt(i) == symbols [j]) {
                    getCountBySymbol++;
                }
            }
        }
        return getCountBySymbol;
    }


    //Վերադարձնում է true եթե տրված տեքստը վերջանում է ly-ով, հակառակ դեպքում false
    public boolean endsLy(String str) {
        boolean result =false;
        if(str.substring((str.length()-2),str.length()).equals("ly")){
            result=true;
        }
        return result;
    }


    //Վերադարձնում ենք տրված տեքստի revers եղած տարբերակը․
    public String reverse(String str) {
        String reverse ="";
        for (int i = (str.length() - 1); i >= 0; i--) {
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }


    //Վերադարձնում է առաջին 2 տառերը։ օր․ Hello-> He
    public String firstTwo(String str) {
        return str.substring(0,2);
    }


    //Եթե front-փոփոխականը տանք true կվերադարձնի տրված str-ի առաջին տառը, հակառակ դեպքում վերջինը։
    public String theEndOrFront(String str, boolean front) {
        if(front){
            return   str.substring(0,1);
        }
        else{
            return   str.substring(str.length()-1,str.length());
        }
    }

    //Տրված տեքստից Ջնջում ենք սկզբի և վերջի բացատները(պռաբելները) և արդյունքը վերադարձնում ենք
    public String trim(String text) {
      return text.trim();
    }


    //վերադարձնում է true, եթե տրված տեքստը սկսվում է bad բառով,
    // կամ 2րդ տառից սկսած է պարունակում bad բառը։ օր․ xbadxx -> true, xxbadxx -> false
    public boolean hasBad(String str) {
         if(str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad")){
        return true;}
         return false;
    }


    //Վերադարձնում է տրված տեքստի վերջին n քանակի սինվոլները n անգամ
    //օր․ ("Hello", 3) → "llollollo", ("Hello", 2) → "lolo", ("Hello", 1) → "o"
    public String repeatEnd(String str, int n) {
        String end = "";
        if (n <= str.length()) {
            for (int i = 0; i < n; i++) {
                end = end + str.substring(str.length() - n, str.length());
                return end;
            }
        }
            return "***PLEASE ENTER VALID INFORMATION,OTHERWISE YOUR ACTION CANNOT BE COMPLETED ***";
    }


    //Վերադարձնում է մեջտեղի 2 տառերը
    public String middleTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        } else return "***String length is not enough to complete your action ***";
    }


    //Վերադարձնում է 2 ընդունող տեքստերի խառնուրդը))
    //օր․ ("abc", "xyz") → "axbycz",    ("Hi", "There") → "HTihere", ("xxxx", "There") → "xTxhxexre"
    public String mixString(String a, String b) {
        String myString="";

        if(a.length()>=b.length()){
            for (int i = 0; i < b.length(); i++) {
                myString=myString+a.charAt(i)+b.charAt(i);
            }
            myString+=a.substring(b.length());
        }
        else
            for (int i = 0; i < a.length(); i++) {
                myString=myString+a.charAt(i)+b.charAt(i);
            }
        myString+=b.substring(a.length());
        return myString;
    }


    //Վերադարձնում է true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
    //օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
    public boolean bobThere(String str) {

         boolean isBob=false;
        for (int i = 0; i <str.length()-2; i++) {
           if(str.charAt(i)==str.charAt(i+2) && str.charAt(i)=='b') {
               isBob = true;
           }
        }
        return isBob;
    }




}
