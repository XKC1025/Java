package com.itheima05;

public class Test{
    public static void main(String[] args) {
        MiFactory factory = new MiFactory();
        factory.createPhone(new MiNote());

        factory.createPhone(new RedMi());
    }


}

class MiFactory {
	/*public void createPhone(MiNote mi) {
		mi.call();
	}

	public void createPhone(RedMi mi) {
		mi.call();
	}*/

    public void createPhone(Phone p) {
        p.call();
    }

}

interface Phone {
    public void call();
}

//С??Note
class MiNote implements Phone{
    public void call() {
        System.out.println("С??Note??绰");
    }
}

//????
class RedMi implements Phone {
    public void call() {
        System.out.println("?????绰");
    }
}
