# 자동차 경주 게임
## 자동차 경주게임 최종 재개발

### 기능 요구사항
* 초간단 자동차 경주 게임을 구현한다.
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
* 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
* 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
* 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분한다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

### todo list
- [] 자동차 이름을 입력받는다.
- [] 이름은 별도의 모델로 관리한다.  
- [] 자동차의 이름은 빈값이 될 수 없다.
- [] 자동차의 이름은 null 이 될 수 없다.
- [] 자동차 이름은 5글자를 초과할 수 없다.
- [] 자동차 이름은 , 로 구분이 된다.
- [] 자동차 이름은 중복이 될 수 없다.
- [] 이름을 가지고 있는 자동차 객체를 만든다.
- [] 각 라운드 회수를 입력받는다.
- [] 각 라운드 회수는 카운트 객체로 저장한다.
- [] 각 자동차는 이동거리를 가지고 있다.
- [] 이동거리는 이동거리 객체를 가지고 있다.
- [] 이동거리는 음수가 될 수 없다.
- [] 이동에 대한 판단은 랜덤 값에 의하여 판단한다.
- [] 랜덤은 별도의 비느지스 로직으로 관리한다.
- [] 각 라운드를 관리한다.
- [] 라운드별 결과를 출력한다.
- [] 최종 우승자를 출력한다.