package hashmap;

import java.util.HashMap;

class Main2 {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<String, Double>();
        students.put("Qozeem", 4.0);
        students.put("Evana", 4.0);
        students.put("Tomi", 4.0);
        students.put("Ike", 4.0);
        students.put("Suhi", 4.0);

        for (String kv: students.keySet()) {
            System.out.println("Name: " + kv + ", CGPA: " + students.get(kv));
        }
    }
}