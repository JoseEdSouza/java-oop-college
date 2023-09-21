/**
 * The InvalidPairException class is a custom exception that can be thrown when an invalid pair is
 * encountered.
 */
package Relationship;

public class InvalidPairException extends Exception{
    InvalidPairException(){
        super();
    }

    InvalidPairException(String message){
        super(message);
    }

    InvalidPairException(Throwable cause){
        super(cause);
    }

    InvalidPairException(String message,Throwable cause){
        super(message,cause);
    }

    @Override
    public String toString() {
        if(getMessage()!=null){
            return "InvalidPairException: "+getMessage();
        }
        return super.toString();
    }
}
