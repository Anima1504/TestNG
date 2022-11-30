package javapractices;

interface Language{
    void getName(String name);
}
class ProgrammingLanguage implements Language{
    public void getName(String name) {
        System.out.println("Programming Language" + name);
    }
    }

    class Inter {
        public static void main(String[] args) {
            ProgrammingLanguage lang = new ProgrammingLanguage();
            lang.getName("java");

        }
    }
