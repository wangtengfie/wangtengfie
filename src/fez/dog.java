package fez;

public class dog {
    String name;
    String  breed ;
    String calor;
    String chandi;
    void bark(){
        System.out.println("他还会叫");
    }
    void wagtail(){
        System.out.println("他会摇尾巴");

    }
    void run (){
        System.out.println("他会跑");
    }

    public static void main(String[] args) {
        dog dog=new dog();
        dog.name="dj";
        dog.breed="金毛";
        dog.chandi="北京" +
                "朝阳区";
        dog .calor="金色";
        System.out.println(dog.name+"是一只狗"+dog.calor+"的毛发"+dog.breed+"他的家乡是"+dog.chandi);
       dog.bark();
       dog.wagtail();
       dog.run();

    }
}
