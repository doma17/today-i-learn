import java.util.ArrayDeque;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> genrePlayCount = new HashMap<>();
        HashMap<String, ArrayDeque<Integer>> countInGenre = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int playCount = plays[i];

            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + playCount);

            if (!countInGenre.containsKey(genre)) {
                countInGenre.put(genre, new ArrayDeque<>());
            }
            countInGenre.get(genre).add(i);
        }

        // 장르별 재생 횟수 정렬
        ArrayDeque<String> sortedGenres = new ArrayDeque<>();
        genrePlayCount.entrySet().stream()
            .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
            .forEach(entry -> sortedGenres.add(entry.getKey()));

        // 장르별로 정렬된 곡 인덱스
        ArrayDeque<Integer> result = new ArrayDeque<>();
        for (String genre : sortedGenres) {
            ArrayDeque<Integer> songIndices = countInGenre.get(genre);
            ArrayDeque<Integer> sortedSongIndices = new ArrayDeque<>();
            songIndices.stream()
                .sorted((index1, index2) -> plays[index2] - plays[index1])
                .forEach(sortedSongIndices::add);

            // 최상위 두 곡만 선택
            int count = 0;
            while (!sortedSongIndices.isEmpty() && count < 2) {
                result.add(sortedSongIndices.poll());
                count++;
            }
        }
        // 결과를 배열로 변환
        int[] answer = new int[result.size()];
        int index = 0;
        while (!result.isEmpty()) {
            answer[index++] = result.poll();
        }
        return answer;
    }
}