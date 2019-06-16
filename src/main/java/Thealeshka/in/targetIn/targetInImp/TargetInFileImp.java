package Thealeshka.in.targetIn.targetInImp;

import Thealeshka.in.targetIn.TargetIn;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TargetInFileImp implements TargetIn {
    private String fileURL;

    public TargetInFileImp(String fileURL) {
        this.fileURL = fileURL;
    }

    public TargetInFileImp() {
    }

    public static TargetIn get(String fileURL) {
        return new TargetInFileImp(fileURL);
    }

    @Override
    public String getTarget() {
        String res = "";
        try {
            res = new String(Files.readAllBytes(Paths.get(fileURL)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
