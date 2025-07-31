class MefEngineer {
    private final String name;

    public MefEngineer(String name) {
        this.name = name;
    }

    public void wishHappyBirthDayFor(MefEngineer other, boolean singing) {
        System.out.println("Happy birthday, "+ other.name+"!");
        if (singing) {
            System.out.println("sa-la-la-la :-)");
        }
    }

    public static void main(String[] args) {
        MefEngineer bela = new MefEngineer("Bela");
        MefEngineer vivi = new MefEngineer("Vivi");
        boolean singing = true;
        bela.wishHappyBirthDayFor(vivi, singing);
    }
}   
 