package src.singleton.enum_singleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public enum Singleton {
    UNIQUE_INSTANCE;

    // other useful fields here

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }


    private String a = "123123";

    public String getA() {
        return a;
    }

    public void abs() {
        try {
            processFile("example.txt");
        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }

    /**
     * 파일을 처리하고 특정 조건에 따라 로그를 남기는 복잡한 메소드.
     *
     * @param filePath 처리할 파일의 경로.
     * @throws IOException 파일 읽기 중 오류가 발생할 경우.
     */
    public static void processFile(String filePath) throws IOException {
        File file = new File(filePath);

        // 파일 존재 여부 확인
        if (!file.exists()) {
            System.err.println("File does not exist: " + filePath);
            return;
        }

        // 파일 읽기
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                // 여기서 복잡한 로직을 수행한다고 가정
                // 예: 특정 문자열이 포함된 라인 수집, 데이터 분석 등
                System.out.println("Reading line: " + line);
                lineCount++;

                // 특정 조건에 따른 추가 작업
                if (line.contains("특정 조건")) {
                    // 조건에 맞는 작업 수행
                    System.out.println("특정 조건에 해당하는 라인 발견: " + line);
                }
            }

            // 파일 처리 완료 로그
            System.out.println("File processing completed. Total lines read: " + lineCount);
        }
    }
}
