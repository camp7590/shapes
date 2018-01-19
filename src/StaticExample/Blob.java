
package StaticExample;


public class Blob {
    private String name;
    private static int blobcount=0;
    
    //instances methods can alter static varibles
    public Blob(String n){
        name = n;
        blobcount++;
    }
    
    public String getName(){
        return name;
    }
    
    //static methods
    //should use static method to return static varibles
    public static int getBlobCount(){
        return blobcount;
    }
    
    public static String getSaying(){
        return "We are blobs to the end!";
    }
}
