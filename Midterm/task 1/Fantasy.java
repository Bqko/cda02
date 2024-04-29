package midterm.bakuri_sheklashvili_1.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private final String studentName;
    // TODO change studentName to your name
    private String Bakuri_sheklashvili;

    public Fantasy(String studentName) {
        this.studentName = Bakuri_sheklashvili;
    }

    @Override
    public String toString() {
        return "Fantasy book by " + Bakuri_sheklashvili;
    }

    @Override
    public String getBookkeeping1() {
        return "Bookkeeping for Fantasy";
    }

    @Override
    public String getScissors2() {
        return "Scissors for Fantasy";
    }

    @Override
    public String methodHardware3(String argRod5) {
        return "Hardware method for Fantasy: " + argRod5;
    }

    @Override
    public List<String> methodStatistics4(String argFluid6) {
        // Assuming some statistical processing is done here
        // and a list of results is returned
        return List.of("Statistical analysis for Fantasy based on: " + argFluid6);
    }
}
