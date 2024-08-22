package Lesson6;

public class Park {
    public static class Attractions {
        private String name;
        private String time;
        private double cost;

        public Attractions(String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Park.Attractions attraction1 = new Park.Attractions("Детский поезд", "10:00 - 18:00", 90);
        Park.Attractions attraction2 = new Park.Attractions("Колесо обозрения", "09:00 - 22:00", 150);
        Park.Attractions attraction3 = new Park.Attractions( "Комната смеха", "10:00 - 18:00", 150);
        Park.Attractions attraction4 = new Park.Attractions( "Карусель цепочная", "10:00 - 18:00", 90);

        System.out.println(attraction1.getName());
        System.out.println(attraction1.getTime());
        System.out.println(attraction1.getCost());
    }
}

