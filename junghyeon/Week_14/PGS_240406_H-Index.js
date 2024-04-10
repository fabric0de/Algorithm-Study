function solution(citations) {
  citations.sort((a, b) => b - a); 
  let i = 0;
  while (i < citations.length && citations[i] > i) {
      i++;
  }
  return i; // i는 H-Index
}
