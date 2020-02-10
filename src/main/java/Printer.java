public class Printer {
    private int sheets;

    public Printer() {
        this.sheets = 5;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void print(int pages, int copies) {
        if (this.sheets > pages * copies) {
            this.sheets -= pages * copies;
        }
    }
}
