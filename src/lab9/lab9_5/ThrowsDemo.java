package lab9.lab9_5;

public class ThrowsDemo {
    public void printMessage(String key) {
        try{
        String message = getDetails(key);
        System.out.println( message );}
        catch (NullPointerException e){
            System.out.println("null pointer exception");
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }

    public static void main(String[] args){

        ThrowsDemo td=new ThrowsDemo();
        td.printMessage(null);
        td.printMessage("key");
    }
}
