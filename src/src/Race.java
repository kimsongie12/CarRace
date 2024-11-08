import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// => 랜덤 객체는 클래스로 구현하는지?

public class Race {
    //참가하는 자동차 리스트
    private List<Car> cars;
    //시도 횟수
    private int attempts;
    //랜덤 객체 생성
    private Random random;

    //생성자 선언
    public Race(List<Car> cars, int attempts){
        this.cars = cars;
        this.attempts =attempts;
        this.random = new Random();
    }
    //경주 시작
    public void startRace(){
        //게임이 시작하기 위해서는 총 시도 횟수만큼 랜덤값이 0-9사이이고,뽑는다
        for (int i =0; i<attempts; i++){
            for (Car car : cars){
                int randomVaule = random.nextInt(10);
                //move 호출해서 랜덤 값 대입
                car.move(randomVaule);
            }
            printStatus(); //현재 경주 상태에 랜덤값
        }
        printWinners(); //경주 종료 후 우승자 출력
    }

    //현재 경주 상태 출력
    public void printStatus(){
        //경주 자동차들의 상태를 '-'로 반복해서 현재 위치를 출력한다
        for (Car car : cars){
            System.out.println(car.getName()+"-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    //우승자 출력
    public void printWinners(){
        //우승자를 출력 -> 최고 위치를 찾아서 최고 위치(maxPosition)에 있는 자동차 이름(getName())을 출력
        //maxPosition객체 -> cars리스트를 스트림으로 변환하고, Car의 현재 위치를 정수로 변환, 가장 큰 값, 참여 자동차가 없으면 최대위치는 0
        int maxPosition = cars.stream().mapToInt(Car::getPosition).max().orElse(0);
        //우승자 리스트
        List<String> winners = new ArrayList<>();

        for (Car car:cars){
            if (car.getPosition() == maxPosition){ //자동차의 현재 위치가 최고위치이면 우승자이다
                winners.add(car.getName()); // 우승자는 자동차 이름을 출력한다
        }
            System.out.println("Winner:" + String.join(",",winners));

    }

}
