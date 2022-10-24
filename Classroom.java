class Classroom {
    public static void main(String[] args) {
        Wilder first = new Wilder("Ali", true);
        Wilder second = new Wilder("Anthony", false);

        System.out.println(first.whoAmI() + second.whoAmI());
    }
}
