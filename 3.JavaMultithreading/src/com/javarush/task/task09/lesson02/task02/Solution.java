package com.javarush.task.task09.lesson02.task02;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/* Рефакторинг в соответствии с Naming and Code Convention 2
Исправить код в соответствии с Naming and Code Convention (Shift+F6 для рефакторинга)
Не оставлять комментариев, проверяется строгое соответствие стандарту
*/
public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        Solution solution = new Solution();
        String fileName = solution.getAbsolutePathToDefaultTxtFile().toString();
        System.out.println(fileName);
        Process notepad = solution.getProcessStartNotepad(fileName);
        notepad.waitFor();
    }

    public Process getProcessStartNotepad(String fileName) throws IOException {
        String[] cmd_array = new String[]{"notepad.exe", fileName};
        return Runtime.getRuntime().exec(cmd_array);
    }

    public Path getAbsolutePathToDefaultTxtFile() {
        String packageName = Solution.class.getPackage().getName().replaceAll("[.]", "\\\\");
        String fileName = "3.JavaMultithreading\\src\\" + packageName + "\\file.txt";
        Path path = Paths.get(fileName);
        return path.toAbsolutePath();
    }
}
