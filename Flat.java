public class Flat {
    private String code;
    private int surface;
    private int[] tariffs;

    public Flat() {
    }

    public Flat(String code, int surface, int[] tariffs) {
        this.code = code;
        this.surface = surface;
        this.tariffs = tariffs;
    }

    public int[] getTariffs() {
        return tariffs;
    }

    public void setTariffs(int[] tariffs) {
        this.tariffs = tariffs;
    }

    /*
     * Get price of rent flat on season
     */
    public int getTariff(int day, int month) {
        if (month == 8 || (day >= 20 && month == 12) || (day <= 6 && month == 1)) {
            int[] tariffs = this.getTariffs();
            return tariffs[0];
        } else if (month == 7) {
            return tariffs[1];
        } else {
            return tariffs[2];
        }
    }
}
