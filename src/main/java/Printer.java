public class Printer {
    private int sheets;
    private int toner;

    public Printer() {
        this.sheets = 5;
        this.toner = 10;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getToner() {
        return this.toner;
    }

    public void print(int pages, int copies) {
        if (this.sheets > pages * copies) {
            this.sheets -= pages * copies;
            this.toner -= pages * copies;
        }
    }
}
