package Thealeshka;

import Thealeshka.counter.Count;
import Thealeshka.in.dataIn.dataInImp.GetDataFileImp;
import Thealeshka.in.targetIn.targetInImp.TargetInFileImp;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Count.get(GetDataFileImp.get("data.txt")).count(TargetInFileImp.get("target.txt").getTarget()));
    }
}
