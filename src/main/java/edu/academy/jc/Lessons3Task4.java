package edu.academy.jc;

/*
I used the same code in method encode and decode. how can I  write the code, using small code
 */

public class Lessons3Task4 {
    private  String key="";
    private   String message="";

    public  String encode(String key,String message){
        this.key=key;
        this.message=message;

        byte [] bytesMessage=message.getBytes();
        byte [] bytesKey=key.getBytes();

        for (int i = 0; i < bytesMessage.length;i++ ) {
            if(i>=bytesKey.length){
                break;
            }
            else {
                bytesMessage[i]= (byte) ( bytesMessage[i]^bytesKey[i]);
            }
        }
        
        return new String(bytesMessage);
    }

    public String decode(String key,String message){
        this.key=key;
        this.message=message;
        byte [] bytesMessage=message.getBytes();
        byte [] bytesKey=key.getBytes();

        for (int i = 0; i < bytesMessage.length;i++ ) {
            if(i>=bytesKey.length){
                break;
            }
            else {
                bytesMessage[i]= (byte) ( bytesMessage[i]^bytesKey[i]);

            }
        }
        for (int i = 0; i < bytesMessage.length;i++ ) {
            if(i>=bytesKey.length){
                break;
            }
            else {
                bytesMessage[i]= (byte) ( bytesMessage[i]^bytesKey[i]);

            }
        }

        return new String(bytesMessage);
    }

    public static void main(String[] args) {
        Lessons3Task4 lessons2Task4=new Lessons3Task4();

        System.out.println(lessons2Task4.encode("qwe","123456"));
        System.out.println(lessons2Task4.decode("qwe","123456"));


    }

}
