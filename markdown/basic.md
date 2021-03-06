# basic

## 변수 : 데이터(자료)를 임시로 담을 수 있는 메모리공간
## 자료형 : 변수에 저장할 데이터의 유형

- 변수 이름 규칙
    - 변수 이름의 길이에는 제한이 없으나 가독성중시
    - 반드시 문자나 언더바(_), 달러기호($)로 시작
    - 자바의 연산자는 이름에 사용 불가
    - 대소문자 구문함(int result != int Result)
    - 첫 글자에 숫자 사용 불가, 이름 사이에 빈칸 사용 불가(빈칸대신'_'사용)
    - 자바의 키워드는 변수 이름으로 사용 불가

- 자바에서 변수 선언은 명시적으로 데이터형을 지정하게 되어있으며, 선언된 데이터 유형과 대입된 
데이터값에 차이가 있을때 오류,Underflow,Overflow  발생함으로 주의 
    - Underflow : 자료형에 저장할 수 있는 최소 범위보다 작은 수를 저장
    - Overflow : 자료형에 저장할 수 있는 최대 범위보다 큰 수 저장

- 자바의 변수는 유형에 따라 인스턴스 변수, 클래스 변수, 지역 변수, 파라미터로 구분

- 자바에서 지원하는 기본 자료형은 크게 정수형,실수형,논리형으로 나눔


## Printf()의 형식 문자와 자료형   

형식문자 | 자료형 | 형식문자 | 자료형 
---|---|---|---|
 %c | 문자형 | $s | 8진수 
 %d | 정수형 | $s | 문자열 
 %e | 지수형 | $u | 부호 없는 정수형 
 %f | 실수형 | $x | 16진수 
 %% | %문자 출력 | \% | %문자 출력 


## 정수형

자료형 | 크기 | 입출력 범위 | 설명
---|---|---|---|
 byte | 1byte | -2^7 ~ 2^7-1 | 작은 범위의 값을 저장하기에 유용하다. 컴퓨터 데이터 통신 프로그램에서 많이 사용한다. 
 char | 2byte | 0 ~ 2^16-1 | 음수를 표현하지 않는 unsigned 자료형으로, 문자를 저장하거나 출력하는 용도로 사용한다. 
 short | 2byte | -2^15 ~ 2^15-1 | 메모리에서 차지하는 크기가 작다는 것이 장점이지만, 잘 사용하지 않는다. 
 int | 4byte | -2^31 ~ 2^31-1 | 정수 타입의 연산에 기본이 되는 자료형이다. 
 long | 8byte | -2^63 ~ 2^63-1 | 정수 표현 범위가 큰 데이터를 저장하기에 유용한 자료형이다. 

## 실수형

자료형 | 크기 | 입출력 범위 | 설명 
---|---|---|---|
 float | 4byte | 1.4E^-45 ~ 3.402823E^38 | 표현 범위가 작다. 값을 지정할 때 숫자 뒤에 f나 F를 붙여서 구분한다. 
 double | 8byte | 4.9E^324 ~ 3.402823E^308 | 실수형에서 사용하는 기본 데이터형이다.

## 논리형

boolean : 1byte, true or false 

## 연산자 

- 연산자는 프로그래밍 언어에서 사용할 수 있는 다양한 계산식
- 컴퓨터 연산자에는 사칙,관계,논리 연산이 있음

    ### 연산자 우선순위 
    - 우선순위 
        - ., [], ()
        - !, ~, +/-, ++/–, (cast)
        - +, -, *, /, %
        - «, », »>
        - <, >, <=, >=, ==, !=
        - &, ^, |
        - &&, ||
        - [조건식]?[true]:[false]
        - =, +=, -=, *=, /=, %=, «=, »=, ^=, &=, !=
        - ++/-- (후위형 증감 연산자)

    ### 산술 연산자
    - 이항 연산자 
        - +,-,*,/(몫),%(나머지)
        - += 좌변과 우변을 더한 결과를 좌변에 대입
        - -= 좌변에서 우변을 뺀 결과를 좌변에 대입
        - %= 좌변에서 우변을 나눈 나머지를 좌변에 대입
    - 단항 연산자
        - '++' 변수값을 1 증가
        - '--' 변수값을 1 감소
    
    ### 관계 연산자
    - '>' : 왼쪽 항이 크면 참, 아니면 거짓
    - '<' : 오른쪽 항이 크면 참, 아니면 거짓
    - '>=' : 왼쪽 항이 크거나 같으면 참, 아니면 거짓
    - '<=' : 오른쪽 항이 크거나 같으면 참, 아니면 거짓
    - '==' : 왼쪽과 오른쪽 항이 같으면 참, 아니면 거짓
    - '!=' ( !  = ) : 왼쪽과 오른쪽 항이 다르면 참, 아니면 거짓
      

## 분기문

- 분기문은 프로그램을 개발할 때 논리적 수행을 지원하는 명령어
- 자바에서 지원하는 분기문 : if 문과 switch 문
- if 문은 중첩 사용 가능, if ~ else if ~ else 문 등 응용 가능
- switch 문은 정수형 뿐만 아니라 문자열 비교로 case 별 처리 가능 

```java

if(조건값 1) {
	명령문;
} else if(조건값 2) {
	명령문;
} else if(조건값 3) {
	명령문;
} else {
	명령문;
}

```

```java

if(조건값 1) {
	명령문;
	if(조건값 2) {
		명령문;
	}
} else {
	명령문;
	if(조건값 3) {
		명령문;
	}
}

```

```java

switch(조건값) {
	case 조건 1:
		명령문;
		break;
	case 조건 2:
		명령문;
		break;
	case 조건 3:
		명령문;
		break;
	default:
		명령문;
		break;
}

```






