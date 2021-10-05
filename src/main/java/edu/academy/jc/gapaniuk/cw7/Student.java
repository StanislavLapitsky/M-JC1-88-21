package edu.academy.jc.gapaniuk.cw7;

public class Student extends User{
    private Integer grant;

    @Override
    public int getIncome(int i){
        if (this.getGrant() !=null){
            return this.getGrant()+i;
        }
        else {return 0;}
    }

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Byte grant) {
        this.grant = (int) grant;
    }
}
