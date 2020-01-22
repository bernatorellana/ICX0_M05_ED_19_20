package capsa_blanca;

/**
 *
 * @author bernat
 */
public class TheHouseOfIfs {

    public int theScrambler( int [] numbers, String name ){
        if(name==null) return -1;
        if(numbers==null) return -1;
        if(numbers.length!=name.length()) return -1;
        if(numbers.length==0) return -1;
        
        String newName="";
        int [] stats = new int[name.length()];
        
        
        for(int i=0;i<stats.length;i++){
            stats[i]=0;
        }
        // check numbers
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=name.length()) return -1;
            stats[numbers[i]]++;
        }        
        for(int i=0;i<stats.length;i++){
            if(stats[i]>1) return -1;
        }
        //do some tricky work
        for(int i=0;i<numbers.length;i++){
            newName += name.charAt(numbers[i]);
        }
        // check results
        boolean eq=true;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=newName.charAt(i)){
                eq=false;
                break;
            }
        }
        if(!eq){
            eq=true;
            for(int i=0;i<name.length();i++){
                if(name.charAt(name.length()-i-1)!=newName.charAt(i)){
                    eq=false;
                    break;
                }
            }    
            if(!eq){
                return 1;
            } else {
                return 2;
            }
        } else {
            return 0;
        }
        
    }
}
