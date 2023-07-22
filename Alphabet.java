
class Alphabate{
public static final String UPPERCASE_LETTERS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
public static final String LOWERCASE_LETTERS="abcdefghijklmnopqrstuvwxyz";
public static final String NUMBERS="1234567890";
public static final String SYMBOLS="!@#$%^&*()_+|/\\~?";


private final StringBuilder pool;

public Alphabate(boolean uppercaseInclude,boolean lowercaseInclude, boolean numbersInclude,boolean specialCharactersInclude){
    pool=new StringBuilder();
    if(uppercaseInclude)pool.append(UPPERCASE_LETTERS);
    if(lowercaseInclude)pool.append(LOWERCASE_LETTERS);
    if(numbersInclude)pool.append(NUMBERS);
    if(specialCharactersInclude)pool.append(SYMBOLS);
}

public String getAlphabate(){
    return pool.toString();
}


}