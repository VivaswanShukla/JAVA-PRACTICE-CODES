package com.codes;
interface wi_fi{
    void wifi();
}
interface cam{
    void camera();
}
interface proc{
    void processor();
}
class cellPhone{
    void showName(){
        System.out.println("HELLO, THIS IA CELLPHONE CLASS");
    }
}
class smartPhone1 extends cellPhone implements wi_fi, cam, proc{
    void showname(){
        System.out.println("THE SMARTPHONE IS OF SAMSUNG");
    }
    public void wifi(){
        System.out.println("SAMSUNG USES WIFI-6");
    }
    public void camera(){
        System.out.println("IT HAS 48 MEGAPIXELS");
    }
    public void processor(){
        System.out.println("The processor is SNAPDRAGON 8-GEN 1");
    }
}
class smartPhone2 extends cellPhone implements wi_fi, cam, proc{
    void showname(){
        System.out.println("THE SMARTPHONE IS OF NOTHING");
    }
    public void wifi(){
        System.out.println("SAMSUNG USES WIFI-6");
    }
    public void camera(){
        System.out.println("IT HAS 108 MEGAPIXELS");
    }
    public void processor(){
        System.out.println("The processor is SNAPDRAGON 888+");
    }
}
public class interface_2 {
    public static void main(String[] args) {
//        wi_fi w = new smartPhone();
//        w.wifi();
//        cam c = new smartPhone();
//        c.camera();
//        proc p = new smartPhone();
//        p.processor();
        smartPhone1 sp = new smartPhone1();
        sp.showname();
        sp.camera();
        sp.processor();
        sp.wifi();

        smartPhone2 sp2 = new smartPhone2();
        sp2.showname();
        sp2.camera();
        sp2.processor();
        sp2.wifi();
    }
}
