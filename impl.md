## Implementation

- 머릿속에 있는 알고리즘을 소스코드로 바꾸는 과정
- 완전탐색, 시뮬레이션 등을 구현 유형으로 볼 수 있음


### 예시

상하좌우 문제이다. N x N 크기의 정사각형 공간 위에 서있고, 가장 왼 쪽 위 좌표는 (1,1)이다. 여행가는 상, 하, 좌, 우 방향으로 이동할 수 있고 우리 앞에 이동할 계획이 적힌 계획서가 놓여 있다. 최종적으로 도착할 지점의 좌표를 출력하는 프로그램을 작성하시오.

```java
int n = sc.nextInt();
sc.nextLine();
String[] planList = sc.nextLine().split(" ");
int x = 1, y =  1;

int[] dx = {-1, 0, 0, 1};
int[] dy = {0, 1, -1, 0};
char[] moveTypes = {'U', 'R', 'L', 'D'};

for (String p : planList) {
    char plan = p.charAt(0);
    int nx = -1, ny = -1;
    for (int j = 0; j < 4; j++) {
        if (plan == moveTypes[j]) {
            nx = x + dx[j];
            ny = y + dy[j];
        }
    }
    if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
    x = nx;
    y = ny;
}
System.out.println(x + " " + y);
```
--- 

시각문제이다. 정수 N이 입력될 때, 00시 00분 00초 부터 N시 59분 59초 까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 문제이다. 

```java
int n = sc.nextInt();
int count = 0;

for (int i = 0; i <= n; i++) {
    for (int j = 0; j <= 59; j++) {
        for (int l = 0; l <= 59; l++) {
            if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || l / 10 == 3 || l % 10 == 3) {
                count += 1;
            }
        }
    }
}

System.out.println(count);
```

### Reference
- 책 '이것이 코딩 테스트다
