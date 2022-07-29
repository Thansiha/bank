public class bank {
    void rateofinterest(){
        System.out.println("rbi rate of interest is 7%");
    }

}
class sbi extends bank{
    void rateofinterest(){
        System.out.println("rbi rate of interest is 7.1%");
    }

}
class icici extends bank{
    void rateofinterest(){
        System.out.println("rbi rate of interest is 7.5%");
    }

}
class hdfc extends bank{
    void rateofinterest(){
        System.out.println("rbi rate of interest is 7.45%");
    }

}
class axis extends bank{
    void rateofinterest(){
        System.out.println("rbi rate of interest is 7.5%");
    }

}
class pnb extends bank{
    void rateofinterest(){
        System.out.println("rbi rate of interest is 7.1%");
    }

}
class mainjava{
    public static void main(String[] args) {
        bank ob1=new sbi();
        ob1.rateofinterest();
        bank ob2=new icici();
        ob2.rateofinterest();
        bank ob3=new hdfc();
        ob3.rateofinterest();
        bank ob4=new axis();
        ob4.rateofinterest();
        bank ob5=new pnb();
        ob5.rateofinterest();

    }
}
