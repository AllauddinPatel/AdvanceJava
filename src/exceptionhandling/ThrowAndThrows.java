package exceptionhandling;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception{
        int age=17;
        if (age<=18){
            throw new Exception("you can't vote");
        }
        else {
            System.out.println("You can Vote");
        }
        System.out.println("hiii");
    }
}


/**
 *              Throw                                                          Throws
 *
 * 1,Use to Throw exception                                   1.use to declare an Exception
 *
   2.used in method                                           2.used in method signature
 *
 * 3.it is followed by instance                               3.followed by class.
 *
 *
 *
 */
