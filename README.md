# 자동차 경주 게임
## 흐름
1. 자동차 입력
2. 시도 횟수 입력
3. 게임 실행
4. 우승자 출력 및 자동차 현재 위치 출력

## 기능 목록
- Car( 자동차 이름, 현재 위치 저장 | 전진 여부 결정 | 현재위치 업데이트)
- Race( 지정된 횟수만큼 자동차 전진 | 현재 경주 상태 출력 | 우승자 출력 ) 
- GameInput(사용자로부터 자동차 이름 받고 유효성 검사 | 시도 횟수를 입력받아 정수로 변환)
- GameOutput(현재 자동차들의 위치 출력 | 우승자 출력)
- RacingGame = main(전체 흐름 제어)