public class Main {
    public static void main(String[] args) {
        //Vetor
        String[] vect = new String[] {
                "Maria", "joana", "Alex"
        };
        //uso comum até então
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        //usando o for each
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}