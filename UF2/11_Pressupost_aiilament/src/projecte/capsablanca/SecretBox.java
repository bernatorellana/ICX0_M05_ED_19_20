package projecte.capsablanca;

/**
 *
 * @author bernat
 */
public class SecretBox {
    
    public static int getMyScore(String theSecret) {

        if(Character.isUpperCase(theSecret.charAt(0))) {
            if(theSecret.length()%2!=0 && theSecret.length()>9) {
                boolean isUpper = true;
                for(int i=0;i<theSecret.length();i++){
                    if(isUpper!=Character.isUpperCase(theSecret.charAt(i))){
                        return 3;
                    }
                    isUpper = !isUpper;
                }
                int LON = 4;
                for(int i=0;i<LON;i++){
                    if(Character.toUpperCase(theSecret.charAt(i)) 
                            != 
                        Character.toUpperCase(theSecret.charAt(theSecret.length()-LON+i))) {
                        return 4;
                    }
                }
                boolean found[] = new boolean []{false,false,false,false,false,};
                for(int i=0;i<theSecret.length();i++){
                    int idx ="ABCDR".indexOf(Character.toUpperCase(theSecret.charAt(i)));
                    
                    if(idx<0){
                        return 5;
                    } else {
                        found[idx]= true;
                    }
                }
                for(int i=0;i<found.length;i++){
                    if(!found[i]) return 6;
                }
                return 7;
            }
            return 2;
        }
        return 1;
    }
}
