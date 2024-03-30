function solution(numbers) {
  let answer = "";

  answer = numbers
    .map((x) => x + "") //문자열로 변환
    .sort((a, b) => b + a - (a + b)) //문자열로 변환 후 정렬 (내림차순) 정렬 방식은? a+b와 b+a를 비교해서 b+a가 크면 b를 앞으로 보내는 방식
    .join("");

  return answer[0] === "0" ? "0" : answer;
}
