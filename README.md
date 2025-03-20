## 함수형 프로그래밍 with Java | 벤 바이디히 저자

- 해당 책을 읽고 개인적으로 공부하는 Repo입니다.
- https://product.kyobobook.co.kr/detail/S000212762854

---

### 개요

> 자바 8부터 도입된 Lambda, Stream API, Optional Class 등 함수형 프로그래밍에 대한 깊은 이해와 함수형 사고방식을 키우기 위한 책입니다.

---
### 주요 단어 메모

- SAM(Single Abstarct Method)
- 메모이제이션 (e.g. Map::computeIfAbscent)
- JavaBean
- POJO(Plain Old Java Object)
- effectively final
- 보일러 플레이트
- Stream API

---
### 기본 자바 함수형 인터페이스

- Function<T,R> : 인수를 받고 결과를 반환
- Consumer<T> : 인수만 받고 결과를 반환 X
- Supplier<R> : 인수를 받지 않고 결과만 반환
- Predicate<T\> : 인수를 받아서 표현식에 대해 테스트하고 boolean 값을 결과로 반환.

---
### Stream 파이프라인 기본 연산

모든 Stream 데이터 처리의 기본적인 구성 요소이다. map/filter/reduce 패턴은은 독립적인 함수의 조합으로 내부 반복을 활용하여, 제어문을 제거할 수 있게 해준다.

- Map : 데이터 변환
- Filter : 데이터 선택
- Reduce : 결과 도출

---
### 노트

- Record의 얕은 불변성 및 JavaBean과의 차이
- Record의 컴팩트 생성자
- Builder 패턴
- 빈 검증 API - @NonNUll, @Positive (JSR-380)
- Record : 명목상 튜플
- Record는 컴포넌트에 의해서만 정의되는 투명한 데이터 애그리게이터 타입니다.
- Record는 기존 클래스 방식보다 유연하고 안전한 직렬화 방식을 지원한다.
- 대부분의 스트림 중간연산은 상태를 갖지 않고, 독립적으로 작동한다.
- 하지만, limit, skip과 같은 중간연산들은 목적 수행을 위해 상태 값을 관리한다.
- 의도하지 않은 사이드 이펙트를 위한 코드를 줄이며 가능한 순수 함수로 설계하는 것이 바람직하다.


---

### 기록
 - 2025.03.17 - 98p
 - 2025.03.18 - 152p
 - 2025.03.19 - 204p