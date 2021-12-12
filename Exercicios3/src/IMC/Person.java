package IMC;

public class Person {
        private String name ="";
        private double height = 0.0;
        private double weight = 0.0;
        private double imc = 0.0;
        private String imcLevel = "";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getImc() {
            return imc;
        }

        public void setImc() {
            if (this.weight == 0.0 || this.height == 0.0){
                System.out.println("Insira tanto a altura quanto o peso para ser possível calcular o IMC");
            }
            this.imc = this.weight / ( this.height * this.height);
            setImcLevel();

        }
        public void setImcLevel() {
            this.imcLevel = this.imc < 18.5 ? "Below" : this.imc > 25.0 ? "Above" : "Normal";
        }
        public String getImcLevel() {
            return this.imcLevel;
        }

    }

