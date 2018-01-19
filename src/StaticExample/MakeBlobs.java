
package StaticExample;


public class MakeBlobs {

   
    public static void main(String[] args) {
        //get intial blob count useing the class itself to run the method
        System.out.println("Number of blobs " + Blob.getBlobCount());
        System.out.println("ALL blobs say: " + Blob.getSaying());
        Blob b, c;
        b = new Blob("Bobby");
        //need an instance in order to run instance method
        System.out.println("This is " + b.getName());
        //how many now - can use instance OR class to find out
        System.out.println("Number of blobls now: " + b.getBlobCount());
        System.out.println(b.getName() + " says " + b.getSaying());
        c = new Blob("Charlie");
        System.out.println("Number of blobls now: " + b.getBlobCount());
        // Blob.getname(0; cant do this
        //class cant alter instance varibles
    }
    
}
