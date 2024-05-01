## Greedy

- 현재 상황에서 지금 당장 좋은 것만 고르는 방법

### 예시

거스름돈 문제이다. 당신은 카운터에서 일하는 점원이고 거스름돈으로 사용할 500원, 100원, 50원, 10원 동전이 무제한 존재한다고 하자. 손님에게 거슬러줘야할 돈이 N이라고 할때, 줘야할 동전의 최소개수를 구하라. 이때 N은 항상 10의 배수

- 이 문제의 경우 그리디로, 가장 큰 화폐 단위부터 돈을 거슬러 주면 간단히 풀 수 있다.

```java

int count = 0;
int[] coinTypes = {500, 100, 50, 10};

for (int i = 0; i < 4; i++) {
    count += n / coinTypes[i];
    n %= coinTypes[i];
}

System.out.println(count);

```

---

큰 수의 법칙 문제이다. 다양한 수로 이루어진 배열이 있을때, 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙이다. 그러나 배열의 특정 수가 연속해서 K번 더해질 수 없는 규칙이 있다.  

예를 들어, {2,4,5,6} 배열이 있을 때, M=8 이고 K=3 이면 큰 수의 법칙에 따라 결과는 6+6+6+5+6+6+6+5= 46이다


- 그리디를 통해 가장 큰 수와 두번째로 큰 수를 찾고, 결과를 구할 수 있을 것이다.

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int m = sc.nextInt();
int k = sc.nextInt();

int[] arr = new int[n];
for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}

Arrays.sort(arr);
int first = arr[n-1];
int second = arr[n-2];

int count = (m / (k+1)) * k;
count += m % (k + 1);

int result = 0;
result += count * first;
result += (m - count) * second;

System.out.println(result);
```

---

숫자카드게임 문제이다. 여러개의 숫자 카드 중에서, 가장 높은 숫자가 쓰인 카드 한장을 뽑는 게임이다. 룰은 아래와 같다.
1. n x m 형태로 카드들이 놓여져 있다
2. 먼저 뽑고자 하는 행을 선택한다
3. 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 골라야 한다


- 간단하게, 각 행마다 가장 작은 수를 찾은 뒤에 그 수중에서 가장 큰 수를 찾는 문제이다.

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int m = sc.nextInt();

int[][] matrix = new int[n][m];
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
    }
}

int[] targetList = new int[n];
for (int i = 0; i < n; i++) {
    targetList[i] = Arrays.stream(matrix[i]).min().getAsInt();
}

System.out.println(Arrays.stream(targetList).max().getAsInt());

sc.close();
```

--- 

어떠한 수가 N이 1이 될때까지 다음 두 과정을 반복적으로 선택하여 수행한다.
1. N에서 1을 뺀다
2. N을 K로 나눈다. 단 나누어 떨어질때만 가능

N, K가 주어질 때, N이 1이 될때 까지 위 두 과정이 수행되어야 하는 최소 횟수를 구하는 문제이다.

- 최대한 많이 나누는 방향으로 계산하면 된다

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int k = sc.nextInt();
int count = 0;

while (n >= k) {
    int remain = n % k;
    count += remain;
    n -= remain;
    if (n < k) {
        break;
    }
    count += 1;
    n /= k;
}

count += (n-1);
System.out.println(count);

```

### Reference
- 책 '이것이 코딩 테스트다'