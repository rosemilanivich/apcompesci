/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    
    int numspots;
    String flavor;
    boolean isbeef;
    int mph;
    
    public Cow(){
        numspots=17;
        flavor="waygu";
        isbeef=false;
        if(isbeef)
            mph=0;
        else
            mph=87;
    }
    
    public Cow(int n,String f,boolean b){
        numspots=n;
        flavor=f;
        isbeef=b;
        if(isbeef)
            mph=0;
        else
            mph=87;
    }
    
    public String getFlavor(){
        return flavor;
    }
    
    public void moo(){
        if(!isbeef){
            
        }
    }
}