public class Car {
    //자동차 이름, 위치
    private String name;
    private int position;
    //생성자(자동차 이름, 위치)
    public Car(String name, int position){
        this.name = name;
        this.position = 0;
    }
    // 자동차 전진 메소드
    public void move(int randValue){
            if(randValue >= 4){
                position++;
            }
    }
    // 현재 위치를 반환
    public int getPosition(){
        return position;
    }
    // 이름 반환
    public String getName(){
        return name;
    }

}
