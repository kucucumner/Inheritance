class Cal{
    int v1, v2;
    Cal(int v1, int v2){
        System.out.println("Cal");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){
        return this.v1+v2;
    }
}
// Cal 클래스를 확장, 상속 한다는 의미로 extends 를 사용, Cal 클래스가 가지고 있는 모든 메소드와 변수를 상속
class Cal3 extends Cal {
    // super 를 통해서 부모 클래스의 생성자를 실행시킨다.
    Cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal3");
    }
    public int minus(){
        return this.v1-v2;
    }
    // 부모가 가지고 있지 않는 메소드를 추가
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal(2,1);

        // c3 라는 인스턴스에 sum 메소드를 호출하게 되면 c3가 있는 클래스에서 sum 이라는 메소드를 찾고 없다면 Cal 에서 sum 을 찾는다.
        Cal3 c3 = new Cal3(2,1);
        System.out.println(c.sum()); // 3
        System.out.println(c3.minus()); // 1

    }
}

