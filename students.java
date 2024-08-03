class Students {
    int id;
    String name;

    Students(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Students s1 = new Students(521, "Madhu");
        Students s2 = new Students(512, "Hari");

        s1.display();
        s2.display();
    }
}
