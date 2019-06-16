package Thealeshka.in.dataIn.dataInImp;

import Thealeshka.in.dataIn.GetData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class GetDataFileImp implements GetData {
    private String fileURL;

    public GetDataFileImp(String fileURL) {
        this.fileURL = fileURL;
    }

    public GetDataFileImp() {
    }

    public static GetData get(String fileURL) {
        return new GetDataFileImp(fileURL);
    }

    @Override
    public List<String> getData() {
        String result = "";
        try {
            for (String line : Files.readAllLines(Paths.get(fileURL))) {
                result += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Arrays.asList(result.split(" "));
    }

}
