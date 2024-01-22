public class InnerClass {
    private int age;
    private String color;

    private static class InnerTestClass {
        private String name;
        public void TestInnerClass(String name) {
            this.name = name;
        }
        private void printAge(){
            System.out.println("Age: "+age);
        }
    }


}
